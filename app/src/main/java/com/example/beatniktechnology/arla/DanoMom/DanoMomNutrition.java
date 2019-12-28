package com.example.beatniktechnology.arla.DanoMom;


import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.beatniktechnology.arla.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DanoMomNutrition extends Fragment {

    View mView;
    static DanoMomNutrition instance;

    TextView rdiPopUp;


    public DanoMomNutrition() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_dano_mom_nutrition, container, false);

        rdiPopUp = mView.findViewById(R.id.rdipopup);
        rdiPopUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(getContext());
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.fragment_dano_mom_rdi);
                dialog.show();


                WindowManager.LayoutParams lp = new WindowManager.LayoutParams(
                        FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT);
                lp.copyFrom(dialog.getWindow().getAttributes());
                //dialog.getWindow().setLayout(w, 710);
            }
        });

        return mView;
    }

    public static DanoMomNutrition getInstance() {
        if (instance == null)
            instance = new DanoMomNutrition();
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
