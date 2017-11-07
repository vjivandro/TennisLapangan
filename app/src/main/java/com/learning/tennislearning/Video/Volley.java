package com.learning.tennislearning.Video;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.learning.tennislearning.R;

/**
 * Created by vjivandro on 9/28/17.
 */

public class Volley extends Fragment {

    private LinearLayout vol1;
    private LinearLayout vol2;
    private LinearLayout vol3;
    private LinearLayout vol4;
    private LinearLayout vol5;

    public Volley () {
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
        View view = inflater.inflate(R.layout.tab_volley, container, false);
        vol1 = (LinearLayout) view.findViewById(R.id.vl1);
        vol2 = (LinearLayout) view.findViewById(R.id.vl2);
        vol3 = (LinearLayout) view.findViewById(R.id.vl3);
        vol4 = (LinearLayout) view.findViewById(R.id.vl4);
        vol5 = (LinearLayout) view.findViewById(R.id.vl5);

        vol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v1 = new Intent(getActivity(), Volley1.class);
                startActivity(v1);
            }
        });
        vol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v2 = new Intent(getActivity(), Volley2.class);
                startActivity(v2);
            }
        });
        vol3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v3 = new Intent(getActivity(), Volley3.class);
                startActivity(v3);
            }
        });
        vol4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v4 = new Intent(getActivity(), Volley4.class);
                startActivity(v4);
            }
        });
        vol5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v5 = new Intent(getActivity(), Volley5.class);
                startActivity(v5);
            }
        });
        return view;
    }
}
