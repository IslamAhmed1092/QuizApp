package com.example.quizapp;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class Q1Fragment extends Fragment {


    public Q1Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        final View rootView = inflater.inflate(R.layout.fragment_q1, container, false);
        final QuestionsActivity questionsActivityObject = (QuestionsActivity)getActivity();
        Button nextButton = (Button) rootView.findViewById(R.id.next_button);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean answer = ((RadioButton)rootView.findViewById(R.id.A13)).isChecked();
                questionsActivityObject.setAnswer(answer, 0);
                questionsActivityObject.viewPager.arrowScroll(View.FOCUS_RIGHT);
            }
        });
        return rootView;
    }

}
