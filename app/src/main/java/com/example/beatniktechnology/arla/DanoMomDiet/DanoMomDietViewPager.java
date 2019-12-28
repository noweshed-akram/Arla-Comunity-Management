package com.example.beatniktechnology.arla.DanoMomDiet;


import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
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
public class DanoMomDietViewPager extends Fragment {

    static DanoMomDietViewPager instance;
    TextView danoMomDietPopUp;


    public DanoMomDietViewPager() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_dano_mom_diet_view_pager, container, false);

        danoMomDietPopUp = view.findViewById(R.id.danoMomDietPopUp);
        danoMomDietPopUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(getContext());
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.fragment_dano_mom_summary);
                dialog.show();


                WindowManager.LayoutParams lp = new WindowManager.LayoutParams(
                        FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog.getWindow().getAttributes());
                dialog.getWindow().setLayout(1200, 710);
            }
        });

        ViewPager viewPager;

        viewPager = view.findViewById(R.id.danoMomDietViewPager);

        DanoMomDietViewPagerAdapter adapter =  new DanoMomDietViewPagerAdapter(getChildFragmentManager());
        adapter.addFragment(DanoMomDiet.getInstance(), "Diet one");
        adapter.addFragment(DanoMomDietTwo.getInstance(), "Diet Two");

        viewPager.setSaveFromParentEnabled(false);

        viewPager.setAdapter(adapter);

        return view;
    }

    public static DanoMomDietViewPager getInstance() {
        if (instance == null)
            instance = new DanoMomDietViewPager();
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
