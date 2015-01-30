package com.carlospienovi.chooseyourownadventure;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class WinningFragment extends Fragment {

    public static final String TAG = WinningFragment.class.getSimpleName();

    public WinningFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_winning, container, false);
        return rootView;
    }
}
