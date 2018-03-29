package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView imageView = findViewById(R.id.imageView);

        Intent intent = getIntent();

        int position = intent.getIntExtra("n",1);

        Log.i("get_position",Integer.toString(position));

        switch (position){
            case 0:
                imageView.setImageResource(R.drawable.f1);
                break;
            case 1:
                imageView.setImageResource(R.drawable.f2);
                break;
            case 2:
                imageView.setImageResource(R.drawable.f3);
                break;
            case 3:
                imageView.setImageResource(R.drawable.f4);
                break;
            case 4:
                imageView.setImageResource(R.drawable.f5);
                break;
            case 5:
                imageView.setImageResource(R.drawable.f6);
                break;
            case 6:
                imageView.setImageResource(R.drawable.f7);
                break;
            case 7:
                imageView.setImageResource(R.drawable.f8);
                break;
            case 8:
                imageView.setImageResource(R.drawable.f9);
                break;
            case 9:
                imageView.setImageResource(R.drawable.f10);
                break;
            case 10:
                imageView.setImageResource(R.drawable.f11);
                break;
            case 11:
                imageView.setImageResource(R.drawable.f12);
                break;
            case 12:
                imageView.setImageResource(R.drawable.f13);
                break;
            case 13:
                imageView.setImageResource(R.drawable.f14);
                break;
            case 14:
                imageView.setImageResource(R.drawable.f15);
                break;
            case 15:
                imageView.setImageResource(R.drawable.f16);
                break;
            case 16:
                imageView.setImageResource(R.drawable.f17);
                break;
            case 17:
                imageView.setImageResource(R.drawable.f18);
                break;
            case 18:
                imageView.setImageResource(R.drawable.f19);
                break;
            case 19:
                imageView.setImageResource(R.drawable.f20);
                break;
            case 20:
                imageView.setImageResource(R.drawable.f21);
                break;
            case 21:
                imageView.setImageResource(R.drawable.f22);
                break;
            case 22:
                imageView.setImageResource(R.drawable.f23);
                break;
            case 23:
                imageView.setImageResource(R.drawable.f24);
                break;
            default:
                imageView.setImageResource(R.drawable.f25);
                break;

        }
    }


    //設定回傳值,並返回
    public void fn_like(View v){
        Intent i = new Intent();
        i.putExtra("Like",1);
        setResult(RESULT_OK,i);
        finish();
    }
    public void fn_dislike(View v) {
        Intent i = new Intent();
        i.putExtra("Like", 0);
        setResult(RESULT_OK, i);
        finish();
    }







}
