package com.example.pccorner.parkingsystemdesgin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class profile_admin extends AppCompatActivity {

    ImageView img_back_btn;
    TextView txt_apply;
    EditText edit_username;
    EditText edit_user_name,edit_password,edit_gender,edit_age,edit_phone_number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_admin);
        initalizeAllWidget();
        makeNecessaryEvents();
    }
    private void initalizeAllWidget(){
        img_back_btn=findViewById(R.id.img_back_btn);
        edit_username=findViewById(R.id.edit_username);

        edit_user_name=findViewById(R.id.edit_user_name);
        edit_gender=findViewById(R.id.edit_gender);
        edit_password=findViewById(R.id.edit_password);
        edit_age=findViewById(R.id.edit_age);
        txt_apply=findViewById(R.id.txt_apply);
        edit_phone_number=findViewById(R.id.edit_phone_number);
    }
    private void makeNecessaryEvents() {
        img_back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // finish();
                Intent intent=new Intent(profile_admin.this,AdminMainActivity.class);
                startActivity(intent);
            }
        });
        txt_apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(profile_admin.this, "Changed Saved!", Toast.LENGTH_SHORT).show();
            }
        });

    }
    private boolean check_edit(String name,String password,String phone_Numner,String gender,String age){
        boolean is_correct=true;
        return is_correct;
    }
}
