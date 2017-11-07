package com.learning.tennislearning;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.learning.tennislearning.Materi.Materi_TenisAnatomy;
import com.learning.tennislearning.Materi.Materi_TenisLapangan;
import com.learning.tennislearning.Materi.Materi_PanduanTenis;
import com.learning.tennislearning.Materi.Materi_TenisBuku;
import com.learning.tennislearning.Materi.Materi_Body;
import com.learning.tennislearning.Materi.Materi_LapanganTenis;


/**
 * Created by vjivandro on 9/26/17.
 */

public class MateriActivity extends AppCompatActivity {

    AppCompatActivity materi = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);


        LinearLayout materi1 = (LinearLayout) findViewById(R.id.book1);
        LinearLayout materi2 = (LinearLayout) findViewById(R.id.book2);
        LinearLayout materi3 = (LinearLayout) findViewById(R.id.book3);
        LinearLayout materi4 = (LinearLayout) findViewById(R.id.book4);
        LinearLayout materi5 = (LinearLayout) findViewById(R.id.book5);
        LinearLayout materi6 = (LinearLayout) findViewById(R.id.book6);

        materi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mt1 = new Intent(materi, Materi_Body.class);
                startActivity(mt1);
            }
        });

        materi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mt2 = new Intent(materi, Materi_TenisAnatomy.class);
                startActivity(mt2);
            }
        });

        materi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mt3 = new Intent(materi, Materi_LapanganTenis.class);
                startActivity(mt3);
            }
        });

        materi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mt4 = new Intent(materi, Materi_TenisLapangan.class);
                startActivity(mt4);
            }
        });

        materi5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mt5 = new Intent(materi, Materi_TenisBuku.class);
                startActivity(mt5);
            }
        });

        materi6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mt6 = new Intent(materi, Materi_PanduanTenis.class);
                startActivity(mt6);
            }
        });

    }
}
