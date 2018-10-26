package com.learning.tennislearning;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class AboutActivity extends AppCompatActivity {

    AppCompatActivity about = this;

    private ViewGroup linearLayoutDetails;
    private ImageView imageViewExpand;

    private static final int DURATION = 250;
    String versionName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //versi

        int versionCode = -1;
        try {
            PackageInfo packageInfo = this.getPackageManager().
                    getPackageInfo(this.getPackageName(), 0);
            versionName = packageInfo.versionName;
            versionCode = packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();

        }

        //versionTv.setText("Versi : "+String.format(versionName));

        Button dev = (Button) findViewById(R.id.code);
        dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alert = new AlertDialog.Builder(about);
                alert.setTitle("Developer");
                alert.setIcon(R.drawable.code);
                alert.setMessage("Juris Vassa Ivandro \n" + "vjivandro77@gmail.com");
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                AlertDialog dialog = alert.create();
                dialog.show();
            }
        });

        Button cop = (Button) findViewById(R.id.copy);
        cop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alert = new AlertDialog.Builder(about);
                alert.setTitle("Copyright");
                alert.setIcon(R.drawable.copy);
                alert.setMessage("Copyright © 2017 Tenis Lapangan App - Drs. Supriatna, M.Pd \n" + "All right reserved");
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                AlertDialog dialog = alert.create();
                dialog.show();
            }
        });

        Button ver = (Button) findViewById(R.id.versi);
        ver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alert = new AlertDialog.Builder(about);
                alert.setTitle("Build Version");
                alert.setIcon(R.drawable.versi);
                alert.setMessage("Versi " + versionName);
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                AlertDialog dialog = alert.create();
                dialog.show();
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent email = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto","ysupriatna42@yahoo.com", null
                ));
                email.putExtra(Intent.EXTRA_SUBJECT, "Judul Email");
                startActivity(Intent.createChooser(email, "Send email..."));

                Snackbar.make(view, "Kirim Email", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        linearLayoutDetails = (ViewGroup) findViewById(R.id.linearLayoutDetails);
        imageViewExpand = (ImageView) findViewById(R.id.imageViewExpand);

        Toolbar toolbarCard = (Toolbar) findViewById(R.id.toolbarCard);
        toolbarCard.setTitle(R.string.nama);
        toolbarCard.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return true;
            }
        });
    }

    public void toggleDetails(View view) {
        if (linearLayoutDetails.getVisibility() == View.GONE) {
            ExpandAndCollapseViewUtil.expand(linearLayoutDetails, DURATION);
            imageViewExpand.setImageResource(R.mipmap.less);
            rotate(-180.0f);
        } else {
            ExpandAndCollapseViewUtil.collapse(linearLayoutDetails, DURATION);
            imageViewExpand.setImageResource(R.mipmap.more);
            rotate(180.0f);
        }
    }

    private void rotate(float angle) {
        Animation animation = new RotateAnimation(0.0f, angle, Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        animation.setFillAfter(true);
        animation.setDuration(DURATION);
        imageViewExpand.startAnimation(animation);
    }
}
