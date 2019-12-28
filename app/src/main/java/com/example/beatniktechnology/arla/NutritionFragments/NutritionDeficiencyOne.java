package com.example.beatniktechnology.arla.NutritionFragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.beatniktechnology.arla.Fragments.NutritionDeficiency;
import com.example.beatniktechnology.arla.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NutritionDeficiencyOne extends Fragment {

    static NutritionDeficiencyOne instance;
    LinearLayout red_yellow_ly;
//    public TextView nutritionDeficiencyOneShow;


    public NutritionDeficiencyOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_nutrition_deficiency_one, container, false);

//        nutritionDeficiencyOneShow = view.findViewById(R.id.NutritionDeficiencyOneShow);
//
//        nutritionDeficiencyOneShow.setVisibility(View.GONE);
//        nutritionDeficiencyOneShow.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                NutritionDeficiency.getInstance().nutritionDefeciencyFirstLY.setVisibility(LinearLayout.VISIBLE);
//                nutritionDeficiencyOneShow.setVisibility(View.GONE);
//
//            }
//        });

        red_yellow_ly = view.findViewById(R.id.red_yellow_ly);

        Animation animation = AnimationUtils.loadAnimation(getContext(), R.anim.bounce);
        red_yellow_ly.startAnimation(animation);

        return view;
    }

    public static NutritionDeficiencyOne getInstance() {
        if (instance == null)
            instance = new NutritionDeficiencyOne();
        return instance;
    }

}
