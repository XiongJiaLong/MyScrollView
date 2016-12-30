package com.example.administrator.myscrollview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    MyScrollView scrollView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initMyScroll();
    }

    void initMyScroll(){

        imageView = (ImageView) findViewById(R.id.mImg);
        scrollView = (MyScrollView) findViewById(R.id.mScrollView);
        //设置放大的头部视图
//        scrollView.setZoomView(imageView);
        //设置放大系数
        scrollView.setmScaleRatio(0.5f);
        //设置回弹速度
        scrollView.setmReplyRatio(0.5f);
        //设置最大放大倍数
        scrollView.setmScaleTimes(2.0f);

    }
}
