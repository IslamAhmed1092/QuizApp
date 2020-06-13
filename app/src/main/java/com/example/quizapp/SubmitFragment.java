package com.example.quizapp;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class SubmitFragment extends Fragment {


    public SubmitFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rootView = inflater.inflate(R.layout.fragment_submit, container, false);

        Button prevButton = (Button) rootView.findViewById(R.id.prev_button);
        Button submitButton = (Button) rootView.findViewById(R.id.submit_button);
        final QuestionsActivity questionsActivityObject = (QuestionsActivity)getActivity();

        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                questionsActivityObject.viewPager.arrowScroll(View.FOCUS_LEFT);
            }
        });

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                questionsActivityObject.showResult();
            }
        });

        return rootView;
    }

}
