package com.learning.tennislearning.Video;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.learning.tennislearning.R;


public class Forehand extends Fragment {

    private LinearLayout fh1;
    private LinearLayout fh2;
    private LinearLayout fh3;
    private LinearLayout fh4;
    private LinearLayout fh5;
    private LinearLayout fh6;
    private LinearLayout fh7;
    private LinearLayout fh8;
    private LinearLayout fh9;
    private LinearLayout fh10;

    public Forehand() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.tab_forehand, container, false);
        fh1 = (LinearLayout) view.findViewById(R.id.fh1);
        fh2 = (LinearLayout) view.findViewById(R.id.fh2);
        fh3 = (LinearLayout) view.findViewById(R.id.fh3);
        fh4 = (LinearLayout) view.findViewById(R.id.fh4);
        fh5 = (LinearLayout) view.findViewById(R.id.fh5);
        fh6 = (LinearLayout) view.findViewById(R.id.fh6);
        fh7 = (LinearLayout) view.findViewById(R.id.fh7);
        fh8 = (LinearLayout) view.findViewById(R.id.fh8);
        fh9 = (LinearLayout) view.findViewById(R.id.fh9);
        fh10 = (LinearLayout) view.findViewById(R.id.fh10);

        fh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h1 = new Intent(getActivity(), Forehand1.class);
                startActivity(h1);
            }
        });

        fh2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h2 = new Intent(getActivity(), Forehand2.class);
                startActivity(h2);
            }
        });

        fh3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h3 = new Intent(getActivity(), Forehand3.class);
                startActivity(h3);
            }
        });

        fh4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent h4 = new Intent(getActivity(), Forehand4.class);
                startActivity(h4);
            }
        });

        fh5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h5 = new Intent(getActivity(), Forehand5.class);
                startActivity(h5);
            }
        });
        //bates
        fh6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h6 = new Intent(getActivity(), Forehand6.class);
                startActivity(h6);
            }
        });

        fh7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h7 = new Intent(getActivity(), Forehand7.class);
                startActivity(h7);
            }
        });

        fh8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h8 = new Intent(getActivity(), Forehand8.class);
                startActivity(h8);
            }
        });

        fh9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent h9 = new Intent(getActivity(), Forehand9.class);
                startActivity(h9);
            }
        });

        fh10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h10 = new Intent(getActivity(), Forehand10.class);
                startActivity(h10);
            }
        });

        return view;
    }
}
