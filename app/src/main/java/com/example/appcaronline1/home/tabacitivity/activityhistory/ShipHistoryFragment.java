package com.example.appcaronline1.home.tabacitivity.activityhistory;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.appcaronline1.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ShipHistoryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ShipHistoryFragment extends Fragment {


    public ShipHistoryFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ship_history, container, false);
    }
}