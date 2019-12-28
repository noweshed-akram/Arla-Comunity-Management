package com.example.beatniktechnology.arla.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.beatniktechnology.arla.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Price extends Fragment {

    static Price instance;
    LinearLayout priceFirstLY;
    Button priceCloseBT;
    Button priceShowBT;


    public Price() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        //getActivity().setTitle("Prise");

        View view =  inflater.inflate(R.layout.fragment_price, container, false);

       /* priceFirstLY = view.findViewById(R.id.priceFirstLY);
        priceCloseBT = view.findViewById(R.id.priceCloseBT);
        priceShowBT = view.findViewById(R.id.priceShowBT);

        priceFirstLY.setVisibility(LinearLayout.VISIBLE);
        priceShowBT.setVisibility(View.GONE);
        priceCloseBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                priceFirstLY.setVisibility(LinearLayout.GONE);
                priceShowBT.setVisibility(View.VISIBLE);
            }
        });

        priceShowBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                priceFirstLY.setVisibility(LinearLayout.VISIBLE);
                priceShowBT.setVisibility(View.GONE);
            }
        });
*/
        return view;
    }

    public static Price getInstance() {
        if (instance == null)
            instance = new Price();
        return instance;
    }

}
