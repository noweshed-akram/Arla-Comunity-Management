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
public class WorkingWomen extends Fragment {

    static WorkingWomen instance;
    private int progressStatus1 = 0;
    private int progressStatus2 = 0;
    private int progressStatus3 = 0;
    private int progressStatus4 = 0;
    private int progressStatus5 = 0;
    private int progressStatus6 = 0;
    private int progressStatus7 = 0;
    private int progressStatus8 = 0;
    private int progressStatus9 = 0;
    private int progressStatus10 = 0;
    private int progressStatus11 = 0;
    private int progressStatus12 = 0;
    private int progressStatus13 = 0;
    private int progressStatus14 = 0;
    private int progressStatus15 = 0;
    private int progressStatus16 = 0;
    private int progressStatus17 = 0;
    private int progressStatus18 = 0;
    private int progressStatus19 = 0;
    private int progressStatus20 = 0;
    private int progressStatus21 = 0;
    private int progressStatus22 = 0;
    private int progressStatus23 = 0;
    private int progressStatus24 = 0;
    private int progressStatus25 = 0;
    private int progressStatus26 = 0;
    private int progressStatus27 = 0;
    private int progressStatus28 = 0;
    private Handler handler = new Handler();


    public WorkingWomen() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_working_women, container, false);

        final ProgressBar wwpb1 = view.findViewById(R.id.wwpb1);
        final ProgressBar wwpb2 = view.findViewById(R.id.wwpb2);
        final ProgressBar wwpb3 = view.findViewById(R.id.wwpb3);
        final ProgressBar wwpb4 = view.findViewById(R.id.wwpb4);
        final ProgressBar wwpb5 = view.findViewById(R.id.wwpb5);
        final ProgressBar wwpb6 = view.findViewById(R.id.wwpb6);
        final ProgressBar wwpb7 = view.findViewById(R.id.wwpb7);
        final ProgressBar wwpb8 = view.findViewById(R.id.wwpb8);
        final ProgressBar wwpb9 = view.findViewById(R.id.wwpb9);
        final ProgressBar wwpb10 = view.findViewById(R.id.wwpb10);
        final ProgressBar wwpb11 = view.findViewById(R.id.wwpb11);
        final ProgressBar wwpb12 = view.findViewById(R.id.wwpb12);
        final ProgressBar wwpb13 = view.findViewById(R.id.wwpb13);
        final ProgressBar wwpb14 = view.findViewById(R.id.wwpb14);
        final ProgressBar wwpb15 = view.findViewById(R.id.wwpb15);
        final ProgressBar wwpb16 = view.findViewById(R.id.wwpb16);
        final ProgressBar wwpb17 = view.findViewById(R.id.wwpb17);
        final ProgressBar wwpb18 = view.findViewById(R.id.wwpb18);
        final ProgressBar wwpb19 = view.findViewById(R.id.wwpb19);
        final ProgressBar wwpb20 = view.findViewById(R.id.wwpb20);
        final ProgressBar wwpb21 = view.findViewById(R.id.wwpb21);
        final ProgressBar wwpb22 = view.findViewById(R.id.wwpb22);
        final ProgressBar wwpb23 = view.findViewById(R.id.wwpb23);
        final ProgressBar wwpb24 = view.findViewById(R.id.wwpb24);
        final ProgressBar wwpb25 = view.findViewById(R.id.wwpb25);
        final ProgressBar wwpb26 = view.findViewById(R.id.wwpb26);
        final ProgressBar wwpb27 = view.findViewById(R.id.wwpb27);
        final ProgressBar wwpb28 = view.findViewById(R.id.wwpb28);


        final TextView wwtext1 = view.findViewById(R.id.wwtext1);
        final TextView wwtext2 = view.findViewById(R.id.wwtext2);
        final TextView wwtext3 = view.findViewById(R.id.wwtext3);
        final TextView wwtext4 = view.findViewById(R.id.wwtext4);
        final TextView wwtext5 = view.findViewById(R.id.wwtext5);
        final TextView wwtext6 = view.findViewById(R.id.wwtext6);
        final TextView wwtext7 = view.findViewById(R.id.wwtext7);
        final TextView wwtext8 = view.findViewById(R.id.wwtext8);
        final TextView wwtext9 = view.findViewById(R.id.wwtext9);
        final TextView wwtext10 = view.findViewById(R.id.wwtext10);
        final TextView wwtext11 = view.findViewById(R.id.wwtext11);
        final TextView wwtext12 = view.findViewById(R.id.wwtext12);
        final TextView wwtext13 = view.findViewById(R.id.wwtext13);
        final TextView wwtext14 = view.findViewById(R.id.wwtext14);
        final TextView wwtext15 = view.findViewById(R.id.wwtext15);
        final TextView wwtext16 = view.findViewById(R.id.wwtext16);
        final TextView wwtext17 = view.findViewById(R.id.wwtext17);
        final TextView wwtext18 = view.findViewById(R.id.wwtext18);
        final TextView wwtext19 = view.findViewById(R.id.wwtext19);
        final TextView wwtext20 = view.findViewById(R.id.wwtext20);
        final TextView wwtext21 = view.findViewById(R.id.wwtext21);
        final TextView wwtext22 = view.findViewById(R.id.wwtext22);
        final TextView wwtext23 = view.findViewById(R.id.wwtext23);
        final TextView wwtext24 = view.findViewById(R.id.wwtext24);
        final TextView wwtext25 = view.findViewById(R.id.wwtext25);
        final TextView wwtext26 = view.findViewById(R.id.wwtext26);
        final TextView wwtext27 = view.findViewById(R.id.wwtext27);
        final TextView wwtext28 = view.findViewById(R.id.wwtext28);

        progressStatus1 = 0;
        progressStatus2 = 0;
        progressStatus3 = 0;
        progressStatus4 = 0;
        progressStatus5 = 0;
        progressStatus6 = 0;
        progressStatus7 = 0;
        progressStatus8 = 0;
        progressStatus9 = 0;
        progressStatus10 = 0;
        progressStatus11 = 0;
        progressStatus12 = 0;
        progressStatus13 = 0;
        progressStatus14 = 0;
        progressStatus15 = 0;
        progressStatus16 = 0;
        progressStatus17 = 0;
        progressStatus18 = 0;
        progressStatus19 = 0;
        progressStatus20 = 0;
        progressStatus21 = 0;
        progressStatus22 = 0;
        progressStatus23 = 0;
        progressStatus24 = 0;
        progressStatus25 = 0;
        progressStatus26 = 0;
        progressStatus27 = 0;
        progressStatus28 = 0;

        // Start the lengthy operation in a background thread
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (progressStatus1 < 17) {
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
                            wwpb1.setProgress(progressStatus1);
                            // Show the progress on TextView
                            wwtext1.setText(progressStatus1 + "");
                            // If task execution completed
                            if (progressStatus1 == 17) {
                                // Set a message of completion
                                wwtext1.setText("17");
                            }
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
                while (progressStatus2 < 18) {
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
                            wwpb2.setProgress(progressStatus2);
                            // Show the progress on TextView
                            wwtext2.setText(progressStatus2 + "");
                            // If task execution completed
                            if (progressStatus2 == 18) {
                                // Set a message of completion
                                wwtext2.setText("18");
                            }
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
                while (progressStatus3 < 20) {
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
                            wwpb3.setProgress(progressStatus3);
                            // Show the progress on TextView
                            wwtext3.setText(progressStatus3 + "");
                            // If task execution completed
                            if (progressStatus3 == 20) {
                                // Set a message of completion
                                wwtext3.setText("20");
                            }
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
                while (progressStatus4 < 22) {
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
                            wwpb4.setProgress(progressStatus4);
                            // Show the progress on TextView
                            wwtext4.setText(progressStatus4 + "");
                            // If task execution completed
                            if (progressStatus4 == 22) {
                                // Set a message of completion
                                wwtext4.setText("22");
                            }
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
                while (progressStatus5 < 25) {
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
                            wwpb5.setProgress(progressStatus5);
                            // Show the progress on TextView
                            wwtext5.setText(progressStatus5 + "");
                            // If task execution completed
                            if (progressStatus5 == 25) {
                                // Set a message of completion
                                wwtext5.setText("25");
                            }
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
                while (progressStatus6 < 29) {
                    // Update the progress status
                    progressStatus6 += 1;

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
                            wwpb6.setProgress(progressStatus6);
                            // Show the progress on TextView
                            wwtext6.setText(progressStatus6 + "");
                            // If task execution completed
                            if (progressStatus6 == 29) {
                                // Set a message of completion
                                wwtext6.setText("29");
                            }
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
                while (progressStatus7 < 32) {
                    // Update the progress status
                    progressStatus7 += 1;

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
                            wwpb7.setProgress(progressStatus7);
                            // Show the progress on TextView
                            wwtext7.setText(progressStatus7 + "");
                            // If task execution completed
                            if (progressStatus7 == 32) {
                                // Set a message of completion
                                wwtext7.setText("32");
                            }
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
                while (progressStatus8 < 35) {
                    // Update the progress status
                    progressStatus8 += 1;

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
                            wwpb8.setProgress(progressStatus8);
                            // Show the progress on TextView
                            wwtext8.setText(progressStatus8 + "");
                            // If task execution completed
                            if (progressStatus8 == 35) {
                                // Set a message of completion
                                wwtext8.setText("35");
                            }
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
                while (progressStatus9 < 39) {
                    // Update the progress status
                    progressStatus9 += 1;

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
                            wwpb9.setProgress(progressStatus9);
                            // Show the progress on TextView
                            wwtext9.setText(progressStatus9 + "");
                            // If task execution completed
                            if (progressStatus9 == 39) {
                                // Set a message of completion
                                wwtext9.setText("39");
                            }
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
                while (progressStatus10 < 42) {
                    // Update the progress status
                    progressStatus10 += 1;

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
                            wwpb10.setProgress(progressStatus10);
                            // Show the progress on TextView
                            wwtext10.setText(progressStatus10 + "");
                            // If task execution completed
                            if (progressStatus10 == 42) {
                                // Set a message of completion
                                wwtext10.setText("42");
                            }
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
                while (progressStatus11 < 45) {
                    // Update the progress status
                    progressStatus11 += 1;

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
                            wwpb11.setProgress(progressStatus11);
                            // Show the progress on TextView
                            wwtext11.setText(progressStatus11 + "");
                            // If task execution completed
                            if (progressStatus11 == 45) {
                                // Set a message of completion
                                wwtext11.setText("45");
                            }
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
                while (progressStatus12 < 48) {
                    // Update the progress status
                    progressStatus12 += 1;

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
                            wwpb12.setProgress(progressStatus12);
                            // Show the progress on TextView
                            wwtext12.setText(progressStatus12 + "");
                            // If task execution completed
                            if (progressStatus12 == 48) {
                                // Set a message of completion
                                wwtext12.setText("48");
                            }
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
                while (progressStatus13 < 51) {
                    // Update the progress status
                    progressStatus13 += 1;

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
                            wwpb13.setProgress(progressStatus13);
                            // Show the progress on TextView
                            wwtext13.setText(progressStatus13 + "");
                            // If task execution completed
                            if (progressStatus13 == 51) {
                                // Set a message of completion
                                wwtext13.setText("51");
                            }
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
                while (progressStatus14 < 53) {
                    // Update the progress status
                    progressStatus14 += 1;

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
                            wwpb14.setProgress(progressStatus14);
                            // Show the progress on TextView
                            wwtext14.setText(progressStatus14 + "");
                            // If task execution completed
                            if (progressStatus14 == 53) {
                                // Set a message of completion
                                wwtext14.setText("53");
                            }
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
                while (progressStatus15 < 55) {
                    // Update the progress status
                    progressStatus15 += 1;

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
                            wwpb15.setProgress(progressStatus15);
                            // Show the progress on TextView
                            wwtext15.setText(progressStatus15 + "");
                            // If task execution completed
                            if (progressStatus15 == 55) {
                                // Set a message of completion
                                wwtext15.setText("55");
                            }
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
                while (progressStatus16 < 57) {
                    // Update the progress status
                    progressStatus16 += 1;

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
                            wwpb16.setProgress(progressStatus16);
                            // Show the progress on TextView
                            wwtext16.setText(progressStatus16 + "");
                            // If task execution completed
                            if (progressStatus16 == 57) {
                                // Set a message of completion
                                wwtext16.setText("57");
                            }
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
                while (progressStatus17 < 58) {
                    // Update the progress status
                    progressStatus17 += 1;

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
                            wwpb17.setProgress(progressStatus17);
                            // Show the progress on TextView
                            wwtext17.setText(progressStatus17 + "");
                            // If task execution completed
                            if (progressStatus17 == 58) {
                                // Set a message of completion
                                wwtext17.setText("58");
                            }
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
                while (progressStatus18 < 62) {
                    // Update the progress status
                    progressStatus18 += 1;

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
                            wwpb18.setProgress(progressStatus18);
                            // Show the progress on TextView
                            wwtext18.setText(progressStatus18 + "");
                            // If task execution completed
                            if (progressStatus18 == 62) {
                                // Set a message of completion
                                wwtext18.setText("62");
                            }
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
                while (progressStatus19 < 66) {
                    // Update the progress status
                    progressStatus19 += 1;

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
                            wwpb19.setProgress(progressStatus19);
                            // Show the progress on TextView
                            wwtext19.setText(progressStatus19 + "");
                            // If task execution completed
                            if (progressStatus19 == 66) {
                                // Set a message of completion
                                wwtext19.setText("66");
                            }
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
                while (progressStatus20 < 70) {
                    // Update the progress status
                    progressStatus20 += 1;

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
                            wwpb20.setProgress(progressStatus20);
                            // Show the progress on TextView
                            wwtext20.setText(progressStatus20 + "");
                            // If task execution completed
                            if (progressStatus20 == 70) {
                                // Set a message of completion
                                wwtext20.setText("70");
                            }
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
                while (progressStatus21 < 74) {
                    // Update the progress status
                    progressStatus21 += 1;

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
                            wwpb21.setProgress(progressStatus21);
                            // Show the progress on TextView
                            wwtext21.setText(progressStatus2 + "");
                            // If task execution completed
                            if (progressStatus2 == 74) {
                                // Set a message of completion
                                wwtext21.setText("74");
                            }
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
                while (progressStatus22 < 78) {
                    // Update the progress status
                    progressStatus22 += 1;

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
                            wwpb22.setProgress(progressStatus22);
                            // Show the progress on TextView
                            wwtext22.setText(progressStatus22 + "");
                            // If task execution completed
                            if (progressStatus22 == 78) {
                                // Set a message of completion
                                wwtext22.setText("78");
                            }
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
                while (progressStatus23 < 82) {
                    // Update the progress status
                    progressStatus23 += 1;

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
                            wwpb23.setProgress(progressStatus23);
                            // Show the progress on TextView
                            wwtext23.setText(progressStatus23 + "");
                            // If task execution completed
                            if (progressStatus23 == 82) {
                                // Set a message of completion
                                wwtext23.setText("82");
                            }
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
                while (progressStatus24 < 86) {
                    // Update the progress status
                    progressStatus24 += 1;

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
                            wwpb24.setProgress(progressStatus24);
                            // Show the progress on TextView
                            wwtext24.setText(progressStatus24 + "");
                            // If task execution completed
                            if (progressStatus24 == 86) {
                                // Set a message of completion
                                wwtext24.setText("86");
                            }
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
                while (progressStatus25 < 90) {
                    // Update the progress status
                    progressStatus25 += 1;

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
                            wwpb25.setProgress(progressStatus25);
                            // Show the progress on TextView
                            wwtext25.setText(progressStatus25 + "");
                            // If task execution completed
                            if (progressStatus25 == 90) {
                                // Set a message of completion
                                wwtext25.setText("90");
                            }
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
                while (progressStatus26 < 94) {
                    // Update the progress status
                    progressStatus26 += 1;

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
                            wwpb26.setProgress(progressStatus26);
                            // Show the progress on TextView
                            wwtext26.setText(progressStatus26 + "");
                            // If task execution completed
                            if (progressStatus26 == 94) {
                                // Set a message of completion
                                wwtext26.setText("94");
                            }
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
                while (progressStatus27 < 98) {
                    // Update the progress status
                    progressStatus27 += 1;

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
                            wwpb27.setProgress(progressStatus27);
                            // Show the progress on TextView
                            wwtext27.setText(progressStatus27 + "");
                            // If task execution completed
                            if (progressStatus27 == 98) {
                                // Set a message of completion
                                wwtext27.setText("98");
                            }
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
                while (progressStatus28 < 100) {
                    // Update the progress status
                    progressStatus28 += 1;

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
                            wwpb28.setProgress(progressStatus28);
                            // Show the progress on TextView
                            wwtext28.setText(progressStatus28 + "");
                            // If task execution completed
                            if (progressStatus28 == 100) {
                                // Set a message of completion
                                wwtext28.setText("100");
                            }
                        }
                    });
                }
            }
        }).start(); // Start the operation
        //End

        return view;
    }

    public static WorkingWomen getInstance() {
        if (instance == null)
            instance = new WorkingWomen();
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
