package com.example.beatniktechnology.arla;


import android.net.Uri;
import android.os.Bundle;
import android.os.Debug;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;


/**
 * A simple {@link Fragment} subclass.
 */
public class VideoPlay extends Fragment {

    private ImageButton cancelBtn;

    public VideoPlay() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_video_play, container, false);
        //cancelBtn = view.findViewById(R.id.videoCancelBtn);

        //For play video
        final VideoView videoViewHome = view.findViewById(R.id.videoplayFragment);
        String videopathHome =  "android.resource://com.example.beatniktechnology.arla/"+R.raw.arla_video_new;
        Uri uriHome = Uri.parse(videopathHome);
        videoViewHome.setVideoPath(String.valueOf(uriHome));

        MediaController mediaControllerHome = new MediaController(getContext());
        videoViewHome.setMediaController(mediaControllerHome);
        mediaControllerHome.setAnchorView(videoViewHome);
        //For Video play

//        cancelBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                getActivity().finish();
//                Toast.makeText(getContext(),"canceled button clicked", Toast.LENGTH_LONG).show();
//            }
//        });

        return view;
    }

}
