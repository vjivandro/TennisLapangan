package com.learning.tennislearning.Video;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.learning.tennislearning.R;


public class Backhand extends Fragment {

    private LinearLayout back1;
    private LinearLayout back2;

    public Backhand() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.tab_backhand, container, false);
        back1 = (LinearLayout) view.findViewById(R.id.back1);
        back2 = (LinearLayout) view.findViewById(R.id.back2);

        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h1 = new Intent(getActivity(), Backhand1.class);
                startActivity(h1);
            }
        });

        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h2 = new Intent(getActivity(), Backhand2.class);
                startActivity(h2);
            }
        });

        return view;
    }
}
