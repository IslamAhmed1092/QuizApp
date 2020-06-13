package com.example.quizapp;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class Q3Fragment extends Fragment {


    public Q3Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rootView = inflater.inflate(R.layout.fragment_q3, container, false);

        Button nextButton = (Button) rootView.findViewById(R.id.next_button);
        Button prevButton = (Button) rootView.findViewById(R.id.prev_button);
        final QuestionsActivity questionsActivityObject = (QuestionsActivity)getActivity();
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String A3 = ((EditText)rootView.findViewById(R.id.A3)).getText().toString().trim();
                boolean answer = A3.equalsIgnoreCase("dec");
                questionsActivityObject.setAnswer(answer, 2);
                questionsActivityObject.viewPager.arrowScroll(View.FOCUS_RIGHT);
            }
        });

        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String A3 = ((EditText)rootView.findViewById(R.id.A3)).getText().toString().trim();
                boolean answer = A3.equalsIgnoreCase("dec");
                questionsActivityObject.setAnswer(answer, 2);
                ((QuestionsActivity)getActivity()).viewPager.arrowScroll(View.FOCUS_LEFT);
            }
        });

        return rootView;
    }

}
