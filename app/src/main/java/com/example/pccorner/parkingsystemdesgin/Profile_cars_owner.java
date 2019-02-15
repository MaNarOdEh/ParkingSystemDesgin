package com.example.pccorner.parkingsystemdesgin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Profile_cars_owner extends AppCompatActivity {

    ImageView img_back_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_cars_owner);
        initializeAllWidget();
        makeNecessaryEvent();
    }
    private void initializeAllWidget() {
        img_back_btn=findViewById(R.id.img_back_btn);
    }
    private void makeNecessaryEvent() {
        img_back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
