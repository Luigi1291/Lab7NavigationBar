package com.example.lab7navigationbar.Fragments;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.navigation.Navigation;

import com.example.lab7navigationbar.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2 extends Fragment {


    public Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment2, container, false);
        setupUI(view);
        return view;
    }

    private void setupUI(final View view){
        final TextInputEditText editText = view.findViewById(R.id.txtEditTextFrag2);
        FloatingActionButton btnNext = view.findViewById(R.id.btnNextFrag2);
        btnNext.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String content = editText.getText().toString();
                Fragment2Directions.Fragment2to3 action = Fragment2Directions.fragment2to3();
                action.setMessage(content); // sets the message
                Navigation.findNavController(view).navigate(action);
            }
        });
    }
}
