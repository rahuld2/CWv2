package com.example.rahul.cwv2;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 *another Fragment which makes up the MyLists. because this fragemnt was basic all the coding was
 * also done in the XML file
 */
public class buttonBelow extends Fragment {

    public buttonBelow() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_button_below, container, false);
    }


    }
