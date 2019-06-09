package com.example.lab7navigationbar.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lab7navigationbar.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment3 extends Fragment {


    public Fragment3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment3, container, false);
        setupUI(view);
        return view;
    }

    private void setupUI(View view){
        TextView receivedText = view.findViewById(R.id.txtViewFragment3);
        Fragment3Args args = Fragment3Args.fromBundle(getArguments());
        String message = args.getMessage();
        receivedText.setText(message);
    }
}
