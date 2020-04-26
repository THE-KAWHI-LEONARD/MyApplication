package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //int dip_10=Utils.dip2px(this,10L);
        TextView tv_padding=findViewById(R.id.tv_padding);
        //tv_padding.setPadding(dip_10,dip_10,dip_10,dip_10);
        tv_padding.setText("今天天气真热啊，火辣辣的");
        tv_padding.setTextColor(Color.RED);
        tv_padding.setTextSize(30);
    }
//    public static int dip2px(Context context,float dpValue){
//        final float scale=context.getResources().getDisplayMetrics().density;
//        return (int)(dpValue*scale+0.5f);
//    }
}

