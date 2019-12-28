package com.example.beatniktechnology.arla.Fragments;


import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.beatniktechnology.arla.R;
import com.hookedonplay.decoviewlib.DecoView;
import com.hookedonplay.decoviewlib.charts.SeriesItem;
import com.hookedonplay.decoviewlib.events.DecoEvent;

import java.io.ByteArrayOutputStream;

/**
 * A simple {@link Fragment} subclass.
 */
public class Competition extends Fragment {

    static Competition instance;


//    ImageView imageview;
//    Drawable drawable;
//    Bitmap bitmap1;
//
//    ByteArrayOutputStream bytearrayoutputstream;
//    byte[] BYTE;

    public Competition() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_competition, container, false);

        DecoView COdecoView1 = view.findViewById(R.id.myDecoView);
        DecoView COdecoView2 = view.findViewById(R.id.myDecoView1);
        DecoView COdecoView3 = view.findViewById(R.id.myDecoView2);
        DecoView COdecoView4 = view.findViewById(R.id.myDecoView3);

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

        COdecoView1.addEvent(new DecoEvent.Builder(-70).setIndex(series1Index).setDelay(1000).build());
        COdecoView2.addEvent(new DecoEvent.Builder(-60).setIndex(series1Index1).setDelay(1000).build());
        COdecoView3.addEvent(new DecoEvent.Builder(-60).setIndex(series1Index2).setDelay(1000).build());
        COdecoView4.addEvent(new DecoEvent.Builder(-60).setIndex(series1Index3).setDelay(1000).build());

        //getActivity().setTitle("Competition");

//        bytearrayoutputstream = new ByteArrayOutputStream();
//        imageview = view.findViewById(R.id.competitionIV);
//
//        drawable = getResources().getDrawable(R.drawable.competition);
//
//        bitmap1 = ((BitmapDrawable)drawable).getBitmap();
//        bitmap1.compress(Bitmap.CompressFormat.JPEG,40,bytearrayoutputstream);
//
//        imageview.setImageBitmap(bitmap1);



        return view;
    }

    public static Competition getInstance() {
        if (instance == null)
            instance = new Competition();
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
