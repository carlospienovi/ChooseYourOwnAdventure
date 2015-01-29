package com.carlospienovi.chooseyourownadventure;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class RoomFragment extends CustomFragment {


    Button mEnterDoorOne, mEnterDoorTwo;

    public RoomFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_room, container, false);
        mEnterDoorOne = (Button) rootView.findViewById(R.id.button_enter_door_1);
        mEnterDoorOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToActivity.loseAlleyOrRoom(getActivity());
            }
        });

        mEnterDoorTwo = (Button) rootView.findViewById(R.id.button_enter_door_2);
        mEnterDoorTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToActivity.winAlleyOrRoom(getActivity());
            }
        });
        return rootView;
    }
}
