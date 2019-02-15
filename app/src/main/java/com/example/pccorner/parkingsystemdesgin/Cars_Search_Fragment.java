package com.example.pccorner.parkingsystemdesgin;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Cars_Search_Fragment extends Fragment {
    Button btn_number_search,btn_search_by_image,btn_search_by_video;
    ViewPager viewPager;
    View view;
    FragmentManager fragmentManager ;
    FragmentTransaction fragmentTransaction;
    MyPagerAdapter_Search myPagerAdapter_search;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_cars__search_, container, false);
        initalizeAllWidget();
        makeNecesssaryAllEvent();
        return view;
    }
    private void initalizeAllWidget() {
        btn_number_search=view.findViewById(R.id.btn_number_search);
        btn_search_by_image=view.findViewById(R.id.btn_search_by_image);
        btn_search_by_video=view.findViewById(R.id.btn_search_by_video);
        viewPager=view.findViewById(R.id.viewPager);

        fragmentManager = getActivity().getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        myPagerAdapter_search=new MyPagerAdapter_Search(getFragmentManager(),3);
        viewPager.setAdapter(myPagerAdapter_search);

    }
    private void makeNecesssaryAllEvent() {
        btn_number_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSelectedButton(0);
                viewPager.setCurrentItem(0);


            }
        });
        btn_search_by_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSelectedButton(1);
            }
        });
        btn_search_by_video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSelectedButton(2);

            }
        });
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }
            @Override
            public void onPageSelected(int i) {
                   setSelectedButton(i);
            }
            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });

    }
    private void setSelectedButton(int i){
        if(i==0){
            btn_number_search.setBackgroundResource(R.drawable.rounded_button);
            btn_search_by_image.setBackgroundResource(R.drawable.white_rounded_btn);
            btn_search_by_video.setBackgroundResource(R.drawable.white_rounded_btn);
            viewPager.setCurrentItem(0);

            //change the color
            btn_number_search.setTextColor(getResources().getColor(R.color.colorBackground));
            btn_search_by_image.setTextColor(getResources().getColor(R.color.colorItem));
            btn_search_by_video.setTextColor(getResources().getColor(R.color.colorItem));
        }else if(i==1){
            btn_search_by_image.setBackgroundResource(R.drawable.rounded_button);
            btn_number_search.setBackgroundResource(R.drawable.white_rounded_btn);
            btn_search_by_video.setBackgroundResource(R.drawable.white_rounded_btn);
            viewPager.setCurrentItem(1);

            //change the color
            btn_search_by_image.setTextColor(getResources().getColor(R.color.colorBackground));
            btn_number_search.setTextColor(getResources().getColor(R.color.colorItem));
            btn_search_by_video.setTextColor(getResources().getColor(R.color.colorItem));
        }else{
            btn_search_by_video.setBackgroundResource(R.drawable.rounded_button);
            btn_number_search.setBackgroundResource(R.drawable.white_rounded_btn);
            btn_search_by_image.setBackgroundResource(R.drawable.white_rounded_btn);
            viewPager.setCurrentItem(2);

            //change the color
            btn_search_by_video.setTextColor(getResources().getColor(R.color.colorBackground));
            btn_number_search.setTextColor(getResources().getColor(R.color.colorItem));
            btn_search_by_image.setTextColor(getResources().getColor(R.color.colorItem));
        }
    }

}
