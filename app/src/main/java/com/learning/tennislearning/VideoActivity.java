package com.learning.tennislearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VideoActivity extends AppCompatActivity {
    AppCompatActivity kat = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        Button own = (Button) findViewById(R.id.own);
        own.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vd1 = new Intent(kat, VideoOwn.class);
                startActivity(vd1);
            }
        });

        Button other = (Button) findViewById(R.id.other);
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vd2 = new Intent(kat, Video_Other.class);
                startActivity(vd2);
            }
        });
    }
}
