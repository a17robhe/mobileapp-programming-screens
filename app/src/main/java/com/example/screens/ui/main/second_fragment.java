package com.example.screens.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.screens.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link second_fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class second_fragment extends Fragment {

    public second_fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment second_fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static second_fragment newInstance(String param1, String param2) {
        second_fragment fragment = new second_fragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second_fragment, container, false);
        return view;
    }
}