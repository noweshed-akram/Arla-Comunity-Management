package com.example.beatniktechnology.arla.DanoMomDiet;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.beatniktechnology.arla.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DanoMomDiet extends Fragment {

    static DanoMomDiet instance;


    public DanoMomDiet() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dano_mom_diet, container, false);
    }


    public static DanoMomDiet getInstance() {
        if (instance == null)
            instance = new DanoMomDiet();
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
