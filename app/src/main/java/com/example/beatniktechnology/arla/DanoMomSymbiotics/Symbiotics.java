package com.example.beatniktechnology.arla.DanoMomSymbiotics;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.beatniktechnology.arla.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Symbiotics extends Fragment {

    static Symbiotics instance;


    public Symbiotics() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_symbiotics, container, false);

//        ViewPager viewPager;
//
//        viewPager = view.findViewById(R.id.symbioticsViewPager);
//
//        SymbioticsViewPagerAdapter adapter = new SymbioticsViewPagerAdapter(getChildFragmentManager());
//        adapter.addFragment(SymbioticsOne.getInstance(),"SymbioticsOne");
//        adapter.addFragment(SymbioticsTwo.getInstance(),"SymbioticsTwo");
//
//        viewPager.setSaveFromParentEnabled(false);
//
//        viewPager.setAdapter(adapter);

        return view;
    }

    public static Symbiotics getInstance() {
        if (instance == null)
            instance = new Symbiotics();
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
