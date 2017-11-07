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
 * Created by vjivandro on 9/27/17.
 */

public class GroundStroke extends Fragment {


    private LinearLayout gs1;
    private LinearLayout gs2;
    private LinearLayout gs3;
    private LinearLayout gs4;

    public GroundStroke () {
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
        View view = inflater.inflate(R.layout.tab_groundstroke, container, false);
        gs1 =(LinearLayout) view.findViewById(R.id.gs1);
        gs2 =(LinearLayout) view.findViewById(R.id.gs2);
        gs3 =(LinearLayout) view.findViewById(R.id.gs3);
        gs4 =(LinearLayout) view.findViewById(R.id.gs4);

        gs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent g1 = new Intent(getActivity(), GroundStrouk1.class);
                startActivity(g1);
            }
        });
        gs2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent g2 = new Intent(getActivity(), GroundStrouk2.class);
                startActivity(g2);
            }
        });
        gs3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent g3 = new Intent(getActivity(), GroundStrouk3.class);
                startActivity(g3);
            }
        });
        gs4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent g4 = new Intent(getActivity(), GroundStrouk4.class);
                startActivity(g4);
            }
        });
        return view;
    }
}
