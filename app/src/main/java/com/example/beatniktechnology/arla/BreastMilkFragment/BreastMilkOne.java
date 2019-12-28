package com.example.beatniktechnology.arla.BreastMilkFragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.beatniktechnology.arla.Fragments.BreastMilk;
import com.example.beatniktechnology.arla.NutritionFragments.BreastfeedingOne;
import com.example.beatniktechnology.arla.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BreastMilkOne extends Fragment {

    static BreastMilkOne instance;
//    Button breastMilkOneShowBT;
    public LinearLayout breastMilkFirstLY;
    TextView BreastMilkOneShow;
    RelativeLayout relativeLayout;



    public BreastMilkOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_breast_milk_one, container, false);



//        BreastMilkOneShow = view.findViewById(R.id.breastMilkOneShowBT);
//        breastMilkFirstLY =  view.findViewById(R.id.breastMilkFirstLY);
//
//        BreastMilkOneShow.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                breastMilkFirstLY.setVisibility(LinearLayout.VISIBLE);
//                BreastMilkOneShow.setVisibility(View.GONE);
//            }
//        });
//        relativeLayout = view.findViewById(R.id.breastmilkOneZoomInOut); // get reference to root activity view
//        view.setOnClickListener(new View.OnClickListener() {
//            float zoomFactor = 1.5f;
//            boolean zoomedOut = false;
//
//            @Override
//            public void onClick(View v) {
//                if(zoomedOut) {
//                    // now zoom in
//                    v.setScaleX(1);
//                    v.setScaleY(1);
//                    zoomedOut = false;
//                }
//                else {
//                    v.setScaleX(zoomFactor);
//                    v.setScaleY(zoomFactor);
//                    zoomedOut = true;
//                }
//            }
//        });


//        View v = view.findViewById(R.id.breastmilkOneZoomInOut); // get reference to root activity view
//        v.setOnClickListener(new View.OnClickListener() {
//            float zoomFactor = 1.5f;
//            boolean zoomedOut = false;
//
//            @Override
//            public void onClick(View v) {
//                if(zoomedOut) {
//                    // now zoom in
//                    v.setScaleX(1);
//                    v.setScaleY(1);
//                    v.scrollBy(1,1);
//                    zoomedOut = false;
//                }
//                else {
//                    v.setScaleX(zoomFactor);
//                    v.setScaleY(zoomFactor);
//                    zoomedOut = true;
//                }
//            }
//        });

        return view;
    }

    public static BreastMilkOne getInstance() {
        if (instance == null)
            instance = new BreastMilkOne();
        return instance;
    }

}
