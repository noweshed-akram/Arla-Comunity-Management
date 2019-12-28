package com.example.beatniktechnology.arla.NutritionFragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.beatniktechnology.arla.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BreastfeddingTwo extends Fragment {

    static BreastfeddingTwo instance;


    public BreastfeddingTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_breastfedding_two, container, false);
        return view;
    }

    public static BreastfeddingTwo getInstance() {
        if (instance == null)
            instance = new BreastfeddingTwo();
        return instance;
    }


}
