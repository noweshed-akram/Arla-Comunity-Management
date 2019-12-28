package com.example.beatniktechnology.arla;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class DeelacMaErDudherBikolpoNei extends Fragment {

    static DeelacMaErDudherBikolpoNei instance;


    public DeelacMaErDudherBikolpoNei() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_deelac_ma_er_dudher_bikolpo_nei, container, false);
    }

    public static DeelacMaErDudherBikolpoNei getInstance() {
        if (instance == null)
            instance = new DeelacMaErDudherBikolpoNei();
        return instance;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {
            // Refresh your fragment here
            getFragmentManager().beginTransaction().detach(this).attach(this).commit();
        }
    }

}
