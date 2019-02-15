package com.example.pccorner.parkingsystemdesgin;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    //I will always define the variable here without make any initialize
    private Handler mWaitHandler ; //waiting 4 seconds and then ends splach screen
    ProgressBar progressBar;
    private Handler handler ; //for change progressbar status
    private int progressStatus ; //the first state of progressbar

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeAllWidget(); //this methods for initialize All Widget and Variables...
        makeAllEvent();  //this methods for make all Event...
    }

    private void makeAllEvent() {
        mWaitHandler.postDelayed(new Runnable() {

            @Override
            public void run() {
                progressBar.setVisibility(View.VISIBLE);
                //The following code will execute after the 5 seconds.
                try {
                    //Go to next page i.e, start the next activity.
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            while (progressStatus < 100) {
                                // Update the progress status
                                progressStatus += 1;
                                // Try to sleep the thread for 20 milliseconds
                                try {
                                    Thread.sleep(20);  //3 seconds
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                // Update the progress bar
                                handler.post(new Runnable() {
                                    @Override
                                    public void run() {
                                        progressBar.setProgress(progressStatus);

                                    }
                                });
                            }
                            Intent intent = new Intent(getApplicationContext(), FirstScreen.class);
                            startActivity(intent);

                            //Let's Finish Splash Activity since we don't want to show this when user press back button.
                            finish();

                        }

                    }).start(); // Start the operation
                } catch (Exception ignored) {
                    ignored.printStackTrace();
                }
            }
        }, 3000);  // Give a 4 seconds delay.
    }

    private void initializeAllWidget() {
        progressBar=findViewById(R.id.progressBar);
        mWaitHandler = new Handler();
        handler = new Handler();
        progressStatus = 0;
    }
}
