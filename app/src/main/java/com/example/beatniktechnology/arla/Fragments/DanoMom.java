package com.example.beatniktechnology.arla.Fragments;


import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.beatniktechnology.arla.DanoMom.DanoMomBreastMilk;
import com.example.beatniktechnology.arla.DanoMom.DanoMomConsumers;
import com.example.beatniktechnology.arla.DanoMom.DanoMomDHA;
import com.example.beatniktechnology.arla.DanoMom.DanoMomFBL;
import com.example.beatniktechnology.arla.DanoMom.DanoMomNutrition;
import com.example.beatniktechnology.arla.DanoMom.DanoMomPreparation;
import com.example.beatniktechnology.arla.DanoMom.DanoMomRDI;
import com.example.beatniktechnology.arla.DanoMom.DanoMomReferences;
import com.example.beatniktechnology.arla.DanoMom.DanoMomSummary;
import com.example.beatniktechnology.arla.DanoMomDiet.DanoMomDiet;
import com.example.beatniktechnology.arla.DanoMomDiet.DanoMomDietViewPager;
import com.example.beatniktechnology.arla.DanoMomStatistics.DanoMomStatistics;
import com.example.beatniktechnology.arla.DanoMomSymbiotics.Symbiotics;
import com.example.beatniktechnology.arla.DeelacMaErDudherBikolpoNei;
import com.example.beatniktechnology.arla.Home;
import com.example.beatniktechnology.arla.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DanoMom extends Fragment {

    DanoMomViewPagerAdapter adapter;
    ImageView danoMomhomeFromTabLayoutBT;



    public DanoMom() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dano_mom, container, false);

        TabLayout tabLayout;
        ViewPager viewPager;

        tabLayout = view.findViewById(R.id.danoMom_tab_layout);
        viewPager = view.findViewById(R.id.danoMom_viewPager);

        tabLayout.setTabTextColors(Color.parseColor("#000000"),Color.parseColor("#FFFFFF"));
        tabLayout.setupWithViewPager(viewPager);

        DanoMomViewPagerAdapter adapter = new DanoMomViewPagerAdapter(getChildFragmentManager());
        adapter.addFragment((DeelacMaErDudherBikolpoNei.getInstance()), "Start");
        adapter.addFragment(DanoMomStatistics.getInstance(),"Statistics");
        adapter.addFragment(DanoMomConsumers.getInstance(),"Consumers");
        adapter.addFragment(DanoMomRDI.getInstance(),"RDI");
        adapter.addFragment(DanoMomDHA.getInstance(),"DHA");
        adapter.addFragment(DanoMomNutrition.getInstance(),"Nutrition");
        adapter.addFragment(Symbiotics.getInstance(),"Symbiotic");
        adapter.addFragment(DanoMomBreastMilk.getInstance(),"Breastmilk");
        adapter.addFragment(DanoMomFBL.getInstance(),"Foods to boost Lactation");
        adapter.addFragment(DanoMomDietViewPager.getInstance(),"Diet");
        adapter.addFragment(DanoMomPreparation.getInstance(),"Preparation");
        adapter.addFragment(DanoMomSummary.getInstance(),"Summary");
        adapter.addFragment(DanoMomReferences.getInstance(),"References");

        viewPager.setSaveFromParentEnabled(false);

        viewPager.setAdapter(adapter);


        danoMomhomeFromTabLayoutBT =  view.findViewById(R.id.danoMomhomeFromTabLayoutBT);
        danoMomhomeFromTabLayoutBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Home()).commit();
            }
        });

        return view;
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
