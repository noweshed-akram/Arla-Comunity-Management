package com.example.beatniktechnology.arla.Fragments;


import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.beatniktechnology.arla.NutritionFragments.BreastfeddingTwo;
import com.example.beatniktechnology.arla.NutritionFragments.BreastfeedingOne;
import com.example.beatniktechnology.arla.NutritionFragments.NutritionDeficiencyOne;
import com.example.beatniktechnology.arla.NutritionFragments.NutritionViewPagerAdapter;
import com.example.beatniktechnology.arla.NutritionFragments.Section;
import com.example.beatniktechnology.arla.NutritionFragments.WorkingWomen;
import com.example.beatniktechnology.arla.R;
import com.hookedonplay.decoviewlib.DecoView;
import com.hookedonplay.decoviewlib.charts.SeriesItem;
import com.hookedonplay.decoviewlib.events.DecoEvent;


/**
 * A simple {@link Fragment} subclass.
 */
public class NutritionDeficiency extends Fragment {

    TextView NutritionDeficiencyShow, nutritionDeficiencyinstructionAndPrice;

   // Section section;



    private NutritionViewPagerAdapter adapter;


    static NutritionDeficiency instance;

    public LinearLayout nutritionDefeciencyFirstLY;
    Button nutritionDefeciencyCloseBT;



    public NutritionDeficiency() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_nutrition_deficiency, container, false);

        DecoView NDdecoView1 = view.findViewById(R.id.NDdeco);

        // Create background track
        NDdecoView1.addSeries(new SeriesItem.Builder(Color.argb(255, 253, 197, 7))
                .setRange(0, 100, 100)
                .setInitialVisibility(false)
                .setLineWidth(5f)
                .build());

        //Create data series track
        SeriesItem seriesItem1 = new SeriesItem.Builder(Color.argb(255, 115, 38, 92))
                .setRange(0, 100, 0)
                .setLineWidth(5f)
                .build();

        int series1Index = NDdecoView1.addSeries(seriesItem1);

        NDdecoView1.addEvent(new DecoEvent.Builder(DecoEvent.EventType.EVENT_SHOW, true)
                .setDelay(0)
                .setDuration(2000)
                .build());

        NDdecoView1.addEvent(new DecoEvent.Builder(-70).setIndex(series1Index).setDelay(1000).build());


        //getActivity().setTitle("Nutrition Deficiency");

//        TabLayout tabLayout;
        ViewPager viewPager;

        viewPager = view.findViewById(R.id.nutritionViewPager);
//        tabLayout =  view.findViewById(R.id.nutritiounDeficiencyTabLayout);
//        tabLayout.setupWithViewPager(viewPager);



        NutritionViewPagerAdapter adapter = new NutritionViewPagerAdapter(getChildFragmentManager());
        adapter.addFragment(NutritionDeficiencyOne.getInstance(), "Nutrition");
        adapter.addFragment(BreastfeedingOne.getInstance(), "Scenario");
        adapter.addFragment(BreastfeddingTwo.getInstance(), "Practice");
        adapter.addFragment(Section.getInstance(), "Section");
        adapter.addFragment(WorkingWomen.getInstance(), "Working Women");

        viewPager.setSaveFromParentEnabled(false);

        viewPager.setAdapter(adapter);

        nutritionDefeciencyFirstLY = view.findViewById(R.id.nutritionDefeciencyFirstLY);
        nutritionDefeciencyCloseBT = view.findViewById(R.id.nutritionDefeciencyCloseBT);
        NutritionDeficiencyShow = view.findViewById(R.id.NutritionDeficiencyShow);

        nutritionDefeciencyFirstLY.setVisibility(LinearLayout.VISIBLE);
        NutritionDeficiencyShow.setVisibility(View.GONE);
        nutritionDefeciencyCloseBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nutritionDefeciencyFirstLY.setVisibility(LinearLayout.GONE);
                NutritionDeficiencyShow.setVisibility(View.VISIBLE);

            }
        });

        NutritionDeficiencyShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               nutritionDefeciencyFirstLY.setVisibility(LinearLayout.VISIBLE);
               NutritionDeficiencyShow.setVisibility(View.GONE);
            }
        });

        nutritionDeficiencyinstructionAndPrice = view.findViewById(R.id.nutritionDeficiencyinstructionAndPrice);
        nutritionDeficiencyinstructionAndPrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(getContext());
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.fragment_deelac_summery);
                dialog.show();

                WindowManager.LayoutParams lp = new WindowManager.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,
                        FrameLayout.LayoutParams.MATCH_PARENT);
                lp.copyFrom(dialog.getWindow().getAttributes());
               // dialog.getWindow().setLayout(1200, 690);
            }
        });

        return view;

    }

    public static NutritionDeficiency getInstance() {
        if (instance == null)
            instance = new NutritionDeficiency();
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
