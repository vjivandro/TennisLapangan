package com.learning.tennislearning;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.learning.tennislearning.Test.TestTennis;

public class MainActivity extends AppCompatActivity {

    Activity myclass = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button materi = (Button) findViewById(R.id.materi);
        materi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mt = new Intent(myclass, MateriActivity.class);
                startActivity(mt);
            }
        });

        Button test = (Button) findViewById(R.id.latih);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tt = new Intent(myclass, TestActivity.class);
                startActivity(tt);
            }
        });

        Button video = (Button) findViewById(R.id.video);
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vd = new Intent(myclass, VideoActivity.class);
                startActivity(vd);
            }
        });

        Button ppt = (Button) findViewById(R.id.ppt);
        ppt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(myclass, PresentasiActivity.class);
                startActivity(p);
            }
        });
    }


    public void materi(View view) {
        startActivity(new Intent(this, MateriActivity.class));
    }

    public void test(View view) {
        startActivity(new Intent(this, TestTennis.class));
    }

    public void video(View view) {
        startActivity(new Intent(this, VideoActivity.class));
    }

    public void ppt(View view) {
        startActivity(new Intent(this, PresentasiActivity.class));
    }

    public void about(View view) {
        startActivity(new Intent(this, AboutActivity.class));
    }

    public void panduan(View view) {
        startActivity(new Intent(this, PanduanActivity.class));
    }


    // Back / Exit
    public void onBackPressed(){
        exit();
    }

    private void exit() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Anda yakin akan keluar dari aplikasi?")
                .setCancelable(false)
                .setPositiveButton("Iya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                }).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.about) {
            //Create Intent for Product Activity
            Intent about = new Intent(this, AboutActivity.class);
            //Start Product Activity
            startActivity(about);
            return true;
        } if (id == R.id.panduan){
            Intent panduan = new Intent(this, PanduanActivity.class);
            //Start Product Activity
            startActivity(panduan);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
