package com.example.beatniktechnology.arla.Fragments;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.beatniktechnology.arla.R;
import com.hookedonplay.decoviewlib.DecoView;
import com.hookedonplay.decoviewlib.charts.SeriesItem;
import com.hookedonplay.decoviewlib.events.DecoEvent;

/**
 * A simple {@link Fragment} subclass.
 */
public class CowsMilk extends Fragment {

    static CowsMilk instance;
    LinearLayout cowsMilkFirstLY;
    Button cowsMilkCloseBT;
    Button cowsMilkShowBT;

    RelativeLayout greenBubbleOne, greenBubbleTwo, greenBubbleThree, greenBubbleFour, greenBubbleFive;


    public CowsMilk() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //getActivity().setTitle("Cow's Milk");
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cows_milk, container, false);

//        cowsMilkFirstLY = view.findViewById(R.id.cowsMilkFirstLY);
//        cowsMilkCloseBT = view.findViewById(R.id.cowsMilkCloseBT);
//        cowsMilkShowBT = view.findViewById(R.id.cowsMilkShowBT);
        DecoView CMdecoView1 = view.findViewById(R.id.CMdeco1);
        DecoView CMdecoView2 = view.findViewById(R.id.CMdeco);

//        cowsMilkFirstLY.setVisibility(LinearLayout.VISIBLE);
//        cowsMilkShowBT.setVisibility(View.GONE);
//        cowsMilkCloseBT.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                cowsMilkFirstLY.setVisibility(LinearLayout.GONE);
//                cowsMilkShowBT.setVisibility(View.VISIBLE);
//            }
//        });
//
//        cowsMilkShowBT.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                cowsMilkFirstLY.setVisibility(LinearLayout.VISIBLE);
//                cowsMilkShowBT.setVisibility(View.GONE);
//            }
//        });

        // Create background track
        CMdecoView1.addSeries(new SeriesItem.Builder(Color.argb(255, 253, 197, 7))
                .setRange(0, 100, 100)
                .setInitialVisibility(false)
                .setLineWidth(5f)
                .build());
        CMdecoView2.addSeries(new SeriesItem.Builder(Color.argb(255, 253, 197, 7))
                .setRange(0, 100, 100)
                .setInitialVisibility(false)
                .setLineWidth(5f)
                .build());

        //Create data series track
        SeriesItem seriesItem1 = new SeriesItem.Builder(Color.argb(255, 115, 38, 92))
                .setRange(0, 100, 0)
                .setLineWidth(5f)
                .build();

        int series1Index = CMdecoView1.addSeries(seriesItem1);
        int series1Index1 = CMdecoView2.addSeries(seriesItem1);

        CMdecoView1.addEvent(new DecoEvent.Builder(DecoEvent.EventType.EVENT_SHOW, true)
                .setDelay(0)
                .setDuration(2000)
                .build());
        CMdecoView2.addEvent(new DecoEvent.Builder(DecoEvent.EventType.EVENT_SHOW, true)
                .setDelay(0)
                .setDuration(2000)
                .build());

        CMdecoView1.addEvent(new DecoEvent.Builder(-70).setIndex(series1Index).setDelay(1000).build());
        CMdecoView2.addEvent(new DecoEvent.Builder(-80).setIndex(series1Index1).setDelay(1000).build());


//
//        greenBubbleOne = view.findViewById(R.id.greenBubbleOne);
//        greenBubbleTwo = view.findViewById(R.id.greenBubbleTwo);
//        greenBubbleThree = view.findViewById(R.id.greenBubbleThree);
//        greenBubbleFour = view.findViewById(R.id.greenBubbleFour);
//        greenBubbleFive = view.findViewById(R.id.greenBubbleFive);
//
//        Animation animation  = AnimationUtils.loadAnimation(getContext(), R.anim.blink_anim);
//        greenBubbleOne.startAnimation(animation);
//        greenBubbleTwo.startAnimation(animation);
//        greenBubbleThree.startAnimation(animation);
//        greenBubbleFour.startAnimation(animation);
//        greenBubbleFive.startAnimation(animation);


        return view;
    }

    public static CowsMilk getInstance() {
        if (instance == null)
            instance = new CowsMilk();
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
