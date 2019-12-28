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
public class BreastfeedingOne extends Fragment {

    static BreastfeedingOne instance;
    private int progressStatus1 = 0;
    private int progressStatus2 = 0;
    private int progressStatus3 = 0;
    private int progressStatus4 = 0;
    private int progressStatus5 = 0;
    private Handler handler = new Handler();


    public BreastfeedingOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_breastfeeding_one, container, false);

        final ProgressBar pb = view.findViewById(R.id.pb);
        final ProgressBar pb2 = view.findViewById(R.id.pb2);
        final ProgressBar pb3 = view.findViewById(R.id.pb3);
        final ProgressBar pb4 = view.findViewById(R.id.pb4);
        final ProgressBar pb5 = view.findViewById(R.id.pb5);

//        final TextView tv = view.findViewById(R.id.tv);
//        final TextView tv2 = view.findViewById(R.id.tv2);
//        final TextView tv3 = view.findViewById(R.id.tv3);
//        final TextView tv4 = view.findViewById(R.id.tv4);
//        final TextView tv5 = view.findViewById(R.id.tv5);

        // Set the progress status zero on each button click
        progressStatus1 = 0;
        progressStatus2 = 0;
        progressStatus3 = 0;
        progressStatus4 = 0;
        progressStatus5 = 0;

        // Start the lengthy operation in a background thread
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (progressStatus1 < 42) {
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
                            pb.setProgress(progressStatus1);
                            // Show the progress on TextView
//                            tv.setText(progressStatus1 + "");
//                            // If task execution completed
//                            if (progressStatus1 == 42) {
//                                // Set a message of completion
//                                //tv.setText("42");
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
                while (progressStatus2 < 41) {
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
                            pb2.setProgress(progressStatus2);
                            // Show the progress on TextView
//                            tv2.setText(progressStatus2 + "");
//                            // If task execution completed
//                            if (progressStatus2 == 41) {
//                                // Set a message of completion
//                                //tv2.setText("41");
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
                while (progressStatus3 < 69) {
                    // Update the progress status
                    progressStatus3 += 1;

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
                            pb3.setProgress(progressStatus3);
                            // Show the progress on TextView
//                            tv3.setText(progressStatus3 + "");
//                            // If task execution completed
//                            if (progressStatus3 == 69) {
//                                // Set a message of completion
//                                tv3.setText("69");
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
                while (progressStatus4 < 71) {
                    // Update the progress status
                    progressStatus4 += 1;

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
                            pb4.setProgress(progressStatus4);
                            // Show the progress on TextView
//                            tv4.setText(progressStatus4 + "");
//                            // If task execution completed
//                            if (progressStatus4 == 71) {
//                                // Set a message of completion
//                                tv4.setText("71");
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
                while (progressStatus5 < 45) {
                    // Update the progress status
                    progressStatus5 += 1;

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
                            pb5.setProgress(progressStatus5);
                            // Show the progress on TextView
//                            tv5.setText(progressStatus5 + "");
//                            // If task execution completed
//                            if (progressStatus5 == 45) {
//                                // Set a message of completion
//                                tv5.setText("45");
//                            }
                        }
                    });
                }
            }
        }).start(); // Start the operation
        //End

        return view;
    }

    public static BreastfeedingOne getInstance() {
        if (instance == null)
            instance = new BreastfeedingOne();
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
