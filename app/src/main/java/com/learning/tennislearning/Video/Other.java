package com.learning.tennislearning.Video;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.learning.tennislearning.R;


public class Other extends Fragment {

    private LinearLayout other1;
    private LinearLayout other2;
    private LinearLayout other3;
    private LinearLayout other4;
    private LinearLayout other5;

    public Other() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.tab_other, container, false);
        other1 = (LinearLayout) view.findViewById(R.id.ot1);
        other2 = (LinearLayout) view.findViewById(R.id.ot2);
        other3 = (LinearLayout) view.findViewById(R.id.ot3);
        other4 = (LinearLayout) view.findViewById(R.id.ot4);
        other5 = (LinearLayout) view.findViewById(R.id.ot5);

        other1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ot1 = new Intent(getActivity(), OtherVideo1.class);
                startActivity(ot1);
            }
        });

        other2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ot2 = new Intent(getActivity(), OtherVideo2.class);
                startActivity(ot2);
            }
        });

        other3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ot3 = new Intent(getActivity(), OtherVideo3.class);
                startActivity(ot3);
            }
        });

        other4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ot4 = new Intent(getActivity(), OtherVideo4.class);
                startActivity(ot4);
            }
        });

        other5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ot5 = new Intent(getActivity(), OtherVideo5.class);
                startActivity(ot5);
            }
        });

        return view;
    }
}
