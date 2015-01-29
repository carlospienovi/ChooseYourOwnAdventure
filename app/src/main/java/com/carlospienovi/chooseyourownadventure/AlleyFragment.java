package com.carlospienovi.chooseyourownadventure;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class AlleyFragment extends CustomFragment {

    Button mGoLeftButton, mContinueButton, mGoRightButton;

    public AlleyFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_alley, container, false);
        goRightButton(rootView);
        goLeftButton(rootView);
        continueButton(rootView);
        return rootView;
    }

    private void goLeftButton(View rootView) {
        mGoLeftButton = (Button) rootView.findViewById(R.id.button_go_left);
        mGoLeftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToActivity.loseAlleyOrRoom(getActivity());
            }
        });
    }

    private void goRightButton(View rootView) {
        mGoRightButton = (Button) rootView.findViewById(R.id.button_go_right);
        mGoRightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToActivity.winAlleyOrRoom(getActivity());
            }
        });
    }

    private void continueButton(View rootView) {
        mContinueButton = (Button) rootView.findViewById(R.id.button_continue);
        mContinueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToActivity.goToAlleyOrRoom(getActivity());
            }
        });
    }
}
