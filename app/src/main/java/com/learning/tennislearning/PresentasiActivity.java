package com.learning.tennislearning;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.learning.tennislearning.PPT.BackhandPPT;
import com.learning.tennislearning.PPT.DasarTenisPPT;
import com.learning.tennislearning.PPT.FisikTenisPPT;
import com.learning.tennislearning.PPT.ForehandPPT;
import com.learning.tennislearning.PPT.ServisLanPPT;
import com.learning.tennislearning.PPT.VolleyPPT;
import com.learning.tennislearning.Test.TestPerwasitan;

/**
 * Created by vjivandro on 9/28/17.
 */

public class PresentasiActivity extends AppCompatActivity {
    Activity myclass = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ppt);

        LinearLayout ppt = (LinearLayout) findViewById(R.id.ppt1);
        ppt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p1 = new Intent(myclass, BackhandPPT.class);
                startActivity(p1);
            }
        });

        LinearLayout ppt2 = (LinearLayout) findViewById(R.id.ppt2);
        ppt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p2 = new Intent(myclass, VolleyPPT.class);
                startActivity(p2);
            }
        });

        LinearLayout ppt3 = (LinearLayout) findViewById(R.id.ppt3);
        ppt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p3 = new Intent(myclass, ForehandPPT.class);
                startActivity(p3);
            }
        });

        LinearLayout ppt4 = (LinearLayout) findViewById(R.id.ppt4);
        ppt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p4 = new Intent(myclass, FisikTenisPPT.class);
                startActivity(p4);
            }
        });

        LinearLayout ppt5 = (LinearLayout) findViewById(R.id.ppt5);
        ppt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p5 = new Intent(myclass, ServisLanPPT.class);
                startActivity(p5);
            }
        });

        LinearLayout ppt6 = (LinearLayout) findViewById(R.id.ppt6);
        ppt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p6 = new Intent(myclass, DasarTenisPPT.class);
                startActivity(p6);
            }
        });
    }
}
