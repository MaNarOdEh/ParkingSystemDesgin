package com.example.pccorner.parkingsystemdesgin;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class AdminMainActivity extends AppCompatActivity {

    NavigationView navigation_view;
    DrawerLayout drawer_layout;
    View headerView ;
    Toolbar toolbar;
    FrameLayout frame_layout;
    //header Navigations
    CircleImageView img_profile;
    TextView txt_name,txt_phone;
    FragmentManager fragmentManager ;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_main);
        initializeAllWidget();
        makeNecessaryEvent();
    }

    private void initializeAllWidget() {
        navigation_view=findViewById(R.id.navigation_view);
        drawer_layout=findViewById(R.id.drawer_layout);
        toolbar=findViewById(R.id.toolbar);
        frame_layout=findViewById(R.id.frame_layout);
        headerView  = navigation_view.getHeaderView(0);


        img_profile=headerView.findViewById(R.id.img_profile);
        txt_phone=headerView.findViewById(R.id.txt_phone);
        txt_name=headerView.findViewById(R.id.txt_name);


         fragmentManager = getSupportFragmentManager();
         fragmentTransaction = fragmentManager.beginTransaction();

        setAttributeForToolbar();


    }

    private void setAttributeForToolbar() {
        toolbar.setTitle("Tracking Systems");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.menu_toolbar);
    }

    private void makeNecessaryEvent() {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        switch (id){
            case android.R.id.home:
                drawer_layout.openDrawer(GravityCompat.START);
                break;
            case R.id.toolbar_out:
                break;
            case R.id.toolbar_setting:
                break;
            case R.id.toolbar_about:
                break;

        }
        return true;
    }
    public void  moveToFrag(View view){
        int id=view.getId();
        switch (id){
            case R.id.main_profile:
                Intent intent=new Intent(AdminMainActivity.this, profile_admin.class);
                startActivity(intent);
                break;
            case R.id.txt_search_car:
                Cars_Search_Fragment fragment = new Cars_Search_Fragment();
                fragmentTransaction.add(R.id.frame_layout, fragment);
                fragmentTransaction.commit();
                drawer_layout.closeDrawers();
                break;
            case R.id.txt_employee:
                break;


        }

    }


}
