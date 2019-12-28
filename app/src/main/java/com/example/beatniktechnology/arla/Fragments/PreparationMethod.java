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
public class PreparationMethod extends Fragment {

    static PreparationMethod instance;


    public PreparationMethod() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        //getActivity().setTitle("Preparation Method");

        return inflater.inflate(R.layout.fragment_preparation_method, container, false);
    }


    public static PreparationMethod getInstance() {
        if (instance == null)
            instance = new PreparationMethod();
        return instance;
    }

}
