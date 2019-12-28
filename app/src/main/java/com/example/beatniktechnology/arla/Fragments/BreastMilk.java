package com.example.beatniktechnology.arla.Fragments;


import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.beatniktechnology.arla.BreastMilkFragment.BreastMilkOne;
import com.example.beatniktechnology.arla.BreastMilkFragment.BreastMilkTwo;
import com.example.beatniktechnology.arla.BreastMilkFragment.BreastmilkViewPagerAdapter;
import com.example.beatniktechnology.arla.R;
import com.hookedonplay.decoviewlib.DecoView;
import com.hookedonplay.decoviewlib.charts.SeriesItem;
import com.hookedonplay.decoviewlib.events.DecoEvent;

import static android.support.v4.content.ContextCompat.getSystemService;

/**
 * A simple {@link Fragment} subclass.
 */
public class BreastMilk extends Fragment {

    static BreastMilk instance;
    Button breastMilkCloseBT;
    public LinearLayout breastMilkFirstLY;
    TextView BreastMilkShow, breastMilkinstructionAndPrice;


    public BreastMilk() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_breast_milk, container, false);

        DecoView BMdecoView1 = view.findViewById(R.id.BMdeco1);

        // Create background track
        BMdecoView1.addSeries(new SeriesItem.Builder(Color.argb(255, 253, 197, 7))
                .setRange(0, 100, 100)
                .setInitialVisibility(false)
                .setLineWidth(5f)
                .build());

        //Create data series track
        SeriesItem seriesItem1 = new SeriesItem.Builder(Color.argb(255, 115, 38, 92))
                .setRange(0, 100, 0)
                .setLineWidth(5f)
                .build();

        int series1Index = BMdecoView1.addSeries(seriesItem1);

        BMdecoView1.addEvent(new DecoEvent.Builder(DecoEvent.EventType.EVENT_SHOW, true)
                .setDelay(0)
                .setDuration(2000)
                .build());

        BMdecoView1.addEvent(new DecoEvent.Builder(-70).setIndex(series1Index).setDelay(1000).build());

        //getActivity().setTitle("Breast Milk");

        //TabLayout tabLayout;
        ViewPager viewPager;

        viewPager = view.findViewById(R.id.breastMilkViewPager);
        //tabLayout =  view.findViewById(R.id.breastmilk_tab_layout);
        //tabLayout.setupWithViewPager(viewPager);

        BreastmilkViewPagerAdapter adapter =  new BreastmilkViewPagerAdapter(getChildFragmentManager());
        adapter.addFragment(BreastMilkOne.getInstance(), "Breast Milk");
        adapter.addFragment(BreastMilkTwo.getInstance(), "Breast Milk");

        viewPager.setSaveFromParentEnabled(false);

        viewPager.setAdapter(adapter);

        breastMilkFirstLY = view.findViewById(R.id.breastMilkFirstLY);
        BreastMilkShow = view.findViewById(R.id.BreastMilkShow);
        breastMilkCloseBT = view.findViewById(R.id.breastMilkCloseBT);

        breastMilkFirstLY.setVisibility(LinearLayout.VISIBLE);
        BreastMilkShow.setVisibility(View.GONE);

        breastMilkCloseBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                breastMilkFirstLY.setVisibility(LinearLayout.GONE);
                BreastMilkShow.setVisibility(View.VISIBLE);

            }
        });

        BreastMilkShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                breastMilkFirstLY.setVisibility(LinearLayout.VISIBLE);
                BreastMilkShow.setVisibility(View.GONE);


            }
        });


        breastMilkinstructionAndPrice = view.findViewById(R.id.breastMilkinstructionAndPrice);
        breastMilkinstructionAndPrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(getContext());
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.fragment_deelac_summery);
                dialog.show();


                WindowManager.LayoutParams lp = new WindowManager.LayoutParams(
                        FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT);
                lp.copyFrom(dialog.getWindow().getAttributes());
                //dialog.getWindow().setLayout(1200, 690);
            }
        });

        return view;
    }


    public static BreastMilk getInstance() {
        if (instance == null)
            instance = new BreastMilk();
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
