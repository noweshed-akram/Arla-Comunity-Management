package com.example.beatniktechnology.arla.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.beatniktechnology.arla.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Prebiotices extends Fragment {

    static Prebiotices instance;


    public Prebiotices() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        //getActivity().setTitle("Prebiotices");

        return inflater.inflate(R.layout.fragment_prebiotices, container, false);
    }

    public static Prebiotices getInstance() {
        if (instance == null)
            instance = new Prebiotices();
        return instance;
    }

}
