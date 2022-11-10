package com.example.laba8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ConstraintLayout cl = (ConstraintLayout) findViewById(R.id.ll1);
        LinearLayout ll = (LinearLayout) findViewById(R.id.ll2);
        TextView tv1 = (TextView) findViewById(R.id.questoin);
        Button btn1 = (Button) findViewById(R.id.answer1);
        Button btn2 = (Button) findViewById(R.id.answer2);
        ImageView iv = (ImageView) findViewById(R.id.imageView) ;

        cl.setBackgroundResource(R.color.darkblue);
        ll.setBackgroundResource(R.color.mainblue);
        tv1.setText(R.string.whatisDog);
        btn1.setText(R.string.btn1);
        btn2.setText(R.string.btn2);
        iv.setBackgroundResource(R.drawable.ima);
    }
}