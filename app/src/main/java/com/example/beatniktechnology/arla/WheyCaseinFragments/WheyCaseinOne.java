package com.example.beatniktechnology.arla.WheyCaseinFragments;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.beatniktechnology.arla.NutritionFragments.BreastfeddingTwo;
import com.example.beatniktechnology.arla.R;
import com.hookedonplay.decoviewlib.DecoView;
import com.hookedonplay.decoviewlib.charts.SeriesItem;
import com.hookedonplay.decoviewlib.events.DecoEvent;

/**
 * A simple {@link Fragment} subclass.
 */
public class WheyCaseinOne extends Fragment {

    static WheyCaseinOne instance;


    public WheyCaseinOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_whey_casein_one, container, false);

        DecoView WCOdecoView1 = view.findViewById(R.id.wcdeco1);
        DecoView WCOdecoView2 = view.findViewById(R.id.wcdeco2);

        // Create background track
        WCOdecoView1.addSeries(new SeriesItem.Builder(Color.argb(255, 253, 197, 7))
                .setRange(0, 100, 100)
                .setInitialVisibility(false)
                .setLineWidth(8f)
                .build());
        WCOdecoView2.addSeries(new SeriesItem.Builder(Color.argb(255, 253, 197, 7))
                .setRange(0, 100, 100)
                .setInitialVisibility(false)
                .setLineWidth(8f)
                .build());

//Create data series track
        SeriesItem seriesItem1 = new SeriesItem.Builder(Color.argb(255, 115, 38, 92))
                .setRange(0, 100, 0)
                .setLineWidth(8f)
                .build();

        int series1Index = WCOdecoView1.addSeries(seriesItem1);
        int series1Index1 = WCOdecoView2.addSeries(seriesItem1);

        WCOdecoView1.addEvent(new DecoEvent.Builder(DecoEvent.EventType.EVENT_SHOW, true)
                .setDelay(0)
                .setDuration(2000)
                .build());
        WCOdecoView2.addEvent(new DecoEvent.Builder(DecoEvent.EventType.EVENT_SHOW, true)
                .setDelay(0)
                .setDuration(2000)
                .build());

        WCOdecoView1.addEvent(new DecoEvent.Builder(-60).setIndex(series1Index).setDelay(1000).build());
        WCOdecoView2.addEvent(new DecoEvent.Builder(-50).setIndex(series1Index1).setDelay(1000).build());

        return view;
    }

    public static WheyCaseinOne getInstance() {
        if (instance == null)
            instance = new WheyCaseinOne();
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
