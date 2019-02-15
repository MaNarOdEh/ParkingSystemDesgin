package com.example.pccorner.parkingsystemdesgin;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

public class LogInActivity extends AppCompatActivity {
    TextView txt_forget_password;
    Button btn_login;
    EditText edit_password,edit_user_name;
    TextInputLayout txt_input_user_name,txt_input_password;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        initalizeAllWidget();
        makeAllEvent();
    }
    private void initalizeAllWidget() {
        txt_forget_password=findViewById(R.id.txt_forget_password);

        edit_password=findViewById(R.id.edit_password);
        edit_user_name=findViewById(R.id.edit_user_name);

        txt_input_user_name=findViewById(R.id.txt_input_user_name);
        txt_input_password=findViewById(R.id.txt_input_password);
        progressBar=findViewById(R.id.progressBar);

        btn_login=findViewById(R.id.btn_login);
    }
    private void makeAllEvent() {
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
               // Intent intent=new Intent(LogInActivity.this)
               // Intent intent=new Intent(LogInActivity.this,Profile_cars_owner.class);
                //startActivity(intent);
            }
        });
        txt_forget_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LogInActivity.this,AdminMainActivity.class);
                startActivity(intent);

            }
        });
    }

}
