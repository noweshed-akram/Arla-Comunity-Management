package com.example.beatniktechnology.arla.Fragments;


import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.beatniktechnology.arla.DeelacMaErDudherBikolpoNei;
import com.example.beatniktechnology.arla.DeelacSummery;
import com.example.beatniktechnology.arla.Home;
import com.example.beatniktechnology.arla.R;
import com.example.beatniktechnology.arla.WheyCaseinFragments.WheyCaseinOne;

/**
 * A simple {@link Fragment} subclass.
 */
public class Deelac extends Fragment {

    ImageView homeBT;


    public Deelac() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_deelac, container, false);

        getActivity().setTitle("Deelac");

        TabLayout tabLayout;
        ViewPager viewPager;

        viewPager = view.findViewById(R.id.deelac_viewPager);
        tabLayout =  view.findViewById(R.id.deelac_tab_layout);
        tabLayout.setTabTextColors(Color.parseColor("#000000"),Color.parseColor("#FFFFFF"));
        tabLayout.setupWithViewPager(viewPager);

        homeBT =  view.findViewById(R.id.homeFromTabLayoutBT);
        homeBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Home()).commit();
            }
        });

        DeelacViewPagerAdapter adapter =  new DeelacViewPagerAdapter(getChildFragmentManager());
        adapter.addFragment((DeelacMaErDudherBikolpoNei.getInstance()), "Start");
        adapter.addFragment((BreastMilk.getInstance()), "Breast Milk");
        adapter.addFragment(NutritionDeficiency.getInstance(), "Statistics");
        adapter.addFragment(Prebiotices.getInstance(), "Prebiotics");
        adapter.addFragment(WheyCaseinOne.getInstance(), "Whey Casein");
        adapter.addFragment(Lactose.getInstance(), "Lactose");
        adapter.addFragment(CowsMilk.getInstance(), "Cow's Milk");
        adapter.addFragment(Competition.getInstance(), "Competition");
        adapter.addFragment(PreparationMethod.getInstance(), "Preparation");
        adapter.addFragment((DeelacSummery.getInstance()), "Summary");
        adapter.addFragment(Articles.getInstance(), "References");

        viewPager.setSaveFromParentEnabled(false);

        viewPager.setAdapter(adapter);

        return view;
    }



}
