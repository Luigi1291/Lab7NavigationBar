package com.example.lab7navigationbar.Fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.navigation.Navigation;

import com.example.lab7navigationbar.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {
    String TAG = "Fragment1";

    public Fragment1() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment1, container, false);
        setupUI(view);
        return view;
    }

    private void setupUI(final View view){
        FloatingActionButton btnNext = view.findViewById(R.id.btnNextFrag1);
        btnNext.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.i(TAG, "button fragment1 clicked");
                Navigation.findNavController(view)
                        .navigate(R.id.fragment1to2); //id of navigation_graph action
            }
        });
    }
}
