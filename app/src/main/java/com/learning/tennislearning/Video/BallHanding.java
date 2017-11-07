package com.learning.tennislearning.Video;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.learning.tennislearning.R;

/**
 * Created by vjivandro on 9/27/17.
 */

public class BallHanding extends Fragment {

    private LinearLayout bh1;
    private LinearLayout bh2;
    private LinearLayout bh3;
    private LinearLayout bh4;
    private LinearLayout bh5;

    public BallHanding () {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.tab_ballhanding, container, false);
        bh1 = (LinearLayout) view.findViewById(R.id.bh1);
        bh2 = (LinearLayout) view.findViewById(R.id.bh2);
        bh3 = (LinearLayout) view.findViewById(R.id.bh3);
        bh4 = (LinearLayout) view.findViewById(R.id.bh4);
        bh5 = (LinearLayout) view.findViewById(R.id.bh5);

        bh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h1 = new Intent(getActivity(), BHVideo1.class);
                startActivity(h1);
            }
        });

        bh2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h2 = new Intent(getActivity(), BHVideo2.class);
                startActivity(h2);
            }
        });

        bh3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h3 = new Intent(getActivity(), BHVideo3.class);
                startActivity(h3);
            }
        });

        bh4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent h4 = new Intent(getActivity(), BHVideo4.class);
                startActivity(h4);
            }
        });

        bh5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h5 = new Intent(getActivity(), BHVideo5.class);
                startActivity(h5);
            }
        });

        return view;
    }
}
