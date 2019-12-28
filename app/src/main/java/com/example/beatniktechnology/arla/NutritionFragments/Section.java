package com.example.beatniktechnology.arla.NutritionFragments;


import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.beatniktechnology.arla.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Section extends Fragment {

    static Section instance;
    private int progressStatus1 = 0;
    private int progressStatus2 = 0;
    private Handler handler = new Handler();


    public Section() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_section, container, false);

        final ProgressBar spb1 = view.findViewById(R.id.spb1);
        final ProgressBar spb2 = view.findViewById(R.id.spb2);

//        final TextView text1 = view.findViewById(R.id.text1);
//        final TextView text2 = view.findViewById(R.id.text2);

        progressStatus1 = 0;
        progressStatus2 = 0;

        // Start the lengthy operation in a background thread
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (progressStatus1 < 60) {
                    // Update the progress status
                    progressStatus1 += 1;

                    // Try to sleep the thread for 20 milliseconds
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    // Update the progress bar
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            spb1.setProgress(progressStatus1);
                            // Show the progress on TextView
//                            text1.setText(progressStatus1 + "");
//                            // If task execution completed
//                            if (progressStatus1 == 60) {
//                                // Set a message of completion
//                                //text1.setText("60%");
//                            }
                        }
                    });
                }
            }
        }).start(); // Start the operation
        //End

        // Start the lengthy operation in a background thread
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (progressStatus2 < 80) {
                    // Update the progress status
                    progressStatus2 += 1;

                    // Try to sleep the thread for 20 milliseconds
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    // Update the progress bar
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            spb2.setProgress(progressStatus2);
                            // Show the progress on TextView
//                            text2.setText(progressStatus2 + "");
//                            // If task execution completed
//                            if (progressStatus2 == 80) {
//                                // Set a message of completion
//                                //text2.setText("80%");
//                            }
                        }
                    });
                }
            }
        }).start(); // Start the operation
        //End

        return view;
    }

    public static Section getInstance() {
        if (instance == null)
            instance = new Section();
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
