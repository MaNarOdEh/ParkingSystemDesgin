package com.example.pccorner.parkingsystemdesgin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class search_by_car_number extends Fragment {

    View view;
    CardView card_view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_search_by_car_number, container, false);
        initalizeAllwidget();
        makeNecessaryEvent();
        return view;
    }
    private void initalizeAllwidget() {
        card_view=view.findViewById(R.id.card_view);
    }
    private void makeNecessaryEvent() {
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Profile_cars_owner.class);
                getActivity().startActivity(intent);
            }
        });
    }



}
