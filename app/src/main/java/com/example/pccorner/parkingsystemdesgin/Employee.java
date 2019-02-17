package com.example.pccorner.parkingsystemdesgin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Employee extends AppCompatActivity {

    Button btn_add_new_Employee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);
        initializeAllWidget();
        makeNecessaryEvent();
    }

    private void initializeAllWidget() {
        btn_add_new_Employee=findViewById(R.id.btn_add_new_Employee);
    }
    private void makeNecessaryEvent() {
        btn_add_new_Employee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* Intent intent=new Intent(Employee.this,Add_Employee);
                startActivity(intent);*/
            }
        });
    }
}
