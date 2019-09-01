package com.zhanggouzi.widgetdemo;

import android.content.Intent;
import android.media.Rating;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.zhanggouzi.widgetdemo.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ( (TextView)findViewById(R.id.hello)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass( MainActivity.this,RatingBarActivity.class);
                startActivity(intent);
            }
        });
    }
}
