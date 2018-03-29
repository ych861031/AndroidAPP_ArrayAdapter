package com.example.user.myapplication;

import android.app.ListActivity;
import android.content.Intent;
import android.net.sip.SipSession;
import android.net.wifi.p2p.WifiP2pManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends ListActivity {


//    String data[] = {"Taipei","Taichung","tainan","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1"};

    ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();

    private SimpleAdapter adapter;

    private static final String[] mPlaces = new String[] {
            "台北市", "新北市", "台南市", "高雄市", "苗粟縣",
            "台北市", "新北市", "台南市", "高雄市", "苗粟縣",
            "台北市", "新北市", "台南市", "高雄市", "苗粟縣",
            "台北市", "新北市", "台南市", "高雄市", "苗粟縣",
            "台北市", "新北市", "台南市", "高雄市", "苗粟縣"
    };

    private static final String[] mFoods = new String[] {
            "大餅包小餅", "蚵仔煎", "東山鴨頭", "臭豆腐", "潤餅",
            "豆花", "青蛙下蛋","豬血糕", "大腸包小腸", "鹹水雞",
            "烤香腸","車輪餅","珍珠奶茶","鹹酥雞","大熱狗",
            "炸雞排","山豬肉","花生冰","剉冰","水果冰",
            "包心粉圓","排骨酥","沙茶魷魚","章魚燒","度小月"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//android.R.layout.simple_list_item_1
//        String[] data = mPlaces;
//        ArrayAdapter arrayAdapter = new ArrayAdapter<>(this,
//                R.layout.layout,
//                R.id.textView
//                ,data);
//        setListAdapter(arrayAdapter);

//        String[] data = mPlaces;
//        ArrayAdapter arrayAdapter = new ArrayAdapter<>(this,
//                android.R.layout.simple_list_item_multiple_choice
//                ,data);
//        setListAdapter(arrayAdapter);

        for(int i=0; i<mPlaces.length; i++){
            HashMap<String,String> item = new HashMap<String,String>();
            item.put( "food", mFoods[i]);
            item.put( "place",mPlaces[i] );
            list.add( item );
        }


        adapter = new SimpleAdapter(
                this,list,
                android.R.layout.simple_list_item_2,
                new String[] { "food","place" },
                new int[] { android.R.id.text1, android.R.id.text2 } );

        setListAdapter(adapter);
    }

    int index;
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra("n",position);
        index = position;
        startActivityForResult(intent,111);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if(data==null){
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode){
            case 111:
                int like = data.getIntExtra("Like",1);
                if (like==1){
                    Toast.makeText(MainActivity.this,"我喜歡吃"+mPlaces[index]+"的"+mFoods[index],Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity.this,"我不喜歡吃"+mPlaces[index]+"的"+mFoods[index],Toast.LENGTH_LONG).show();
                }
        }

    }
}
