package com.example.beatniktechnology.arla;


import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.beatniktechnology.arla.Fragments.DanoMom;
import com.example.beatniktechnology.arla.Fragments.Deelac;

/**
 * A simple {@link Fragment} subclass.
 */
public class Home extends Fragment {

    private LinearLayout deelacHomeBtn;
    private LinearLayout danoMomLinearLayoutHome;
    ImageView videoThumbBTN, danoArrow, delacArrow;


    public Home() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
//        danoArrow = view.findViewById(R.id.danoArrow);
//        delacArrow = view.findViewById(R.id.delacArrow);

        deelacHomeBtn = view.findViewById(R.id.deelacLinearLayoutHome);
        danoMomLinearLayoutHome = view.findViewById(R.id.danoMomLinearLayoutHome);
        deelacHomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                    getChildFragmentManager().beginTransaction().replace(R.id.fragment_container,
//                            new Home()).commit();

                getFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Deelac()).commit();
            }
        });

        danoMomLinearLayoutHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                    getChildFragmentManager().beginTransaction().replace(R.id.fragment_container,
//                            new Home()).commit();

                getFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new DanoMom()).commit();
            }
        });

        videoThumbBTN = view.findViewById(R.id.videoThumbBtn);
        videoThumbBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Dialog dialog = new Dialog(getContext());
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.fragment_video_play);
                dialog.show();
                WindowManager.LayoutParams lp = new WindowManager.LayoutParams(
                        FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog.getWindow().getAttributes());
                dialog.getWindow().setAttributes(lp);
                final VideoView videoview = (VideoView) dialog.findViewById(R.id.videoplayFragment);
                Uri uri = Uri.parse("android.resource://"+getActivity().getPackageName()+"/"+R.raw.arla_video_new);
                videoview.setVideoURI(uri);
                videoview.start();
            }
        });

//        Animation animat = AnimationUtils.loadAnimation(getActivity(), R.anim.lefttorightforarrow);
//        danoArrow.startAnimation(animat);
//        delacArrow.startAnimation(animat);


        return view;
    }

}
