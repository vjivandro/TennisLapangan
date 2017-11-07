package com.learning.tennislearning;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.learning.tennislearning.R;
import com.learning.tennislearning.Test.TestPerwasitan;
import com.learning.tennislearning.Test.TestTennis;

/**
 * Created by vjivandro on 9/26/17.
 */

public class TestActivity extends AppCompatActivity {
    AppCompatActivity test = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        LinearLayout test1 = (LinearLayout) findViewById(R.id.test1);
        LinearLayout test2 = (LinearLayout) findViewById(R.id.test2);

        test1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tt = new Intent(test, TestPerwasitan.class);
                startActivity(tt);
            }
        });

        test2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent td = new Intent(test, TestTennis.class);
                startActivity(td);
            }
        });
    }
}
