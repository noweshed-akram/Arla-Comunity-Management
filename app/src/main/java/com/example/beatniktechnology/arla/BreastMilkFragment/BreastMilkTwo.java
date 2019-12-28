package com.example.beatniktechnology.arla.BreastMilkFragment;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.beatniktechnology.arla.Fragments.BreastMilk;
import com.example.beatniktechnology.arla.R;
import com.hookedonplay.decoviewlib.DecoView;
import com.hookedonplay.decoviewlib.charts.SeriesItem;
import com.hookedonplay.decoviewlib.events.DecoEvent;

/**
 * A simple {@link Fragment} subclass.
 */
public class BreastMilkTwo extends Fragment {

    static BreastMilkTwo instance;




    public BreastMilkTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_breast_milk_two, container, false);

        DecoView COdecoView1 = view.findViewById(R.id.bmdeco1);
        DecoView COdecoView2 = view.findViewById(R.id.bmdeco2);
        DecoView COdecoView3 = view.findViewById(R.id.bmdeco3);
        DecoView COdecoView4 = view.findViewById(R.id.bmdeco4);

        // Create background track
        COdecoView1.addSeries(new SeriesItem.Builder(Color.argb(255, 253, 197, 7))
                .setRange(0, 100, 100)
                .setInitialVisibility(false)
                .setLineWidth(8f)
                .build());
        COdecoView2.addSeries(new SeriesItem.Builder(Color.argb(255, 253, 197, 7))
                .setRange(0, 100, 100)
                .setInitialVisibility(false)
                .setLineWidth(8f)
                .build());
        COdecoView3.addSeries(new SeriesItem.Builder(Color.argb(255, 253, 197, 7))
                .setRange(0, 100, 100)
                .setInitialVisibility(false)
                .setLineWidth(8f)
                .build());
        COdecoView4.addSeries(new SeriesItem.Builder(Color.argb(255, 253, 197, 7))
                .setRange(0, 100, 100)
                .setInitialVisibility(false)
                .setLineWidth(8f)
                .build());

        //Create data series track
        SeriesItem seriesItem1 = new SeriesItem.Builder(Color.argb(255, 115, 38, 92))
                .setRange(0, 100, 0)
                .setLineWidth(8f)
                .build();

        int series1Index = COdecoView1.addSeries(seriesItem1);
        int series1Index1 = COdecoView2.addSeries(seriesItem1);
        int series1Index2 = COdecoView3.addSeries(seriesItem1);
        int series1Index3 = COdecoView4.addSeries(seriesItem1);

        COdecoView1.addEvent(new DecoEvent.Builder(DecoEvent.EventType.EVENT_SHOW, true)
                .setDelay(0)
                .setDuration(2000)
                .build());
        COdecoView2.addEvent(new DecoEvent.Builder(DecoEvent.EventType.EVENT_SHOW, true)
                .setDelay(0)
                .setDuration(2000)
                .build());
        COdecoView3.addEvent(new DecoEvent.Builder(DecoEvent.EventType.EVENT_SHOW, true)
                .setDelay(0)
                .setDuration(2000)
                .build());
        COdecoView4.addEvent(new DecoEvent.Builder(DecoEvent.EventType.EVENT_SHOW, true)
                .setDelay(0)
                .setDuration(2000)
                .build());

        COdecoView1.addEvent(new DecoEvent.Builder(-90).setIndex(series1Index).setDelay(1000).build());
        COdecoView2.addEvent(new DecoEvent.Builder(-80).setIndex(series1Index1).setDelay(1000).build());
        COdecoView3.addEvent(new DecoEvent.Builder(-60).setIndex(series1Index2).setDelay(1000).build());
        COdecoView4.addEvent(new DecoEvent.Builder(-50).setIndex(series1Index3).setDelay(1000).build());



        return view;
    }

    public static BreastMilkTwo getInstance() {
        if (instance == null)
            instance = new BreastMilkTwo();
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
