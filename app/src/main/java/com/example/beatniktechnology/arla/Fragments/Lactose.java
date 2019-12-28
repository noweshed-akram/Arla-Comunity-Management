package com.example.beatniktechnology.arla.Fragments;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.beatniktechnology.arla.R;
import com.hookedonplay.decoviewlib.DecoView;
import com.hookedonplay.decoviewlib.charts.SeriesItem;
import com.hookedonplay.decoviewlib.events.DecoEvent;


/**
 * A simple {@link Fragment} subclass.
 */
public class Lactose extends Fragment {

    static Lactose instance;
//    LinearLayout lactoseFirstLY;
//    Button lactoseCloseBT;
//    Button lactoseShowBT;

//    LinearLayout lactoseAnimOne,lactoseAnimTwo,lactoseAnimThree,lactoseAnimFour;

    public Lactose() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        //getActivity().setTitle("Lactose  ");

        View view =  inflater.inflate(R.layout.fragment_lactose, container, false);

//        lactoseFirstLY = view.findViewById(R.id.lactoseFirstLY);
//        lactoseCloseBT = view.findViewById(R.id.lactoseCloseBT);
//        lactoseShowBT = view.findViewById(R.id.lactoseShowBT);
//
//        lactoseFirstLY.setVisibility(LinearLayout.VISIBLE);
//        lactoseShowBT.setVisibility(View.GONE);
//        lactoseCloseBT.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                lactoseFirstLY.setVisibility(LinearLayout.GONE);
//                lactoseShowBT.setVisibility(View.VISIBLE);
//            }
//        });
//
//        lactoseShowBT.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                lactoseFirstLY.setVisibility(LinearLayout.VISIBLE);
//                lactoseShowBT.setVisibility(View.GONE);
//            }
//        });


//        DecoView LdecoView1 = view.findViewById(R.id.Ldeco);
//
//        // Create background track
//        LdecoView1.addSeries(new SeriesItem.Builder(Color.argb(255, 253, 197, 7))
//                .setRange(0, 100, 100)
//                .setInitialVisibility(false)
//                .setLineWidth(5f)
//                .build());
//
//        //Create data series track
//        SeriesItem seriesItem1 = new SeriesItem.Builder(Color.argb(255, 115, 38, 92))
//                .setRange(0, 100, 0)
//                .setLineWidth(5f)
//                .build();
//
//        int series1Index = LdecoView1.addSeries(seriesItem1);
//
//        LdecoView1.addEvent(new DecoEvent.Builder(DecoEvent.EventType.EVENT_SHOW, true)
//                .setDelay(0)
//                .setDuration(2000)
//                .build());
//
//        LdecoView1.addEvent(new DecoEvent.Builder(-70).setIndex(series1Index).setDelay(4000).build());
//
//
//        lactoseAnimOne = view.findViewById(R.id.lactoseAnimOne);
//        lactoseAnimTwo = view.findViewById(R.id.lactoseAnimTwo);
//        lactoseAnimThree = view.findViewById(R.id.lactoseAnimThree);
//        lactoseAnimFour = view.findViewById(R.id.lactoseAnimFour);
//
//        Animation animation  = AnimationUtils.loadAnimation(getContext(), R.anim.lefttoright);
//        lactoseAnimOne.startAnimation(animation);
//
//        Animation animation2  = AnimationUtils.loadAnimation(getContext(), R.anim.righttoleft);
//        lactoseAnimTwo.startAnimation(animation2);
//
//        Animation animation3  = AnimationUtils.loadAnimation(getContext(), R.anim.lefttoright);
//        lactoseAnimThree.startAnimation(animation3);
//
//        Animation animation4  = AnimationUtils.loadAnimation(getContext(), R.anim.righttoleft);
//        lactoseAnimFour.startAnimation(animation4);


        return view;
    }

    public static Lactose getInstance() {
        if (instance == null)
            instance = new Lactose();
        return instance;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {
            // Refresh your fragment here
            getFragmentManager().beginTransaction().detach(this).attach(this).commit();
            Log.i("IsRefresh", "Yes");
        }
    }
}
