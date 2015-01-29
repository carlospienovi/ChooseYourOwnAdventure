package com.carlospienovi.chooseyourownadventure;

import android.app.FragmentTransaction;
import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;

import java.util.Random;

/**
 * Created by carlos.pienovi on 23/01/2015.
 */
public class GoToActivity {

    private static final int ALLEY_FRAGMENT = 0;
    private static final int ROOM_FRAGMENT = 1;

    public static void goToAlleyOrRoom(Context context) {
        CustomFragment nextActivity;
        if (randInt(ALLEY_FRAGMENT, ROOM_FRAGMENT) == ALLEY_FRAGMENT) {
            nextActivity = new AlleyFragment();
        } else {
            nextActivity = new RoomFragment();
        }
        replaceFragment(context, nextActivity);
    }

    public static void winAlleyOrRoom(Context context) {
        if (randInt(1, 10) == 1) {
            //go to win
            replaceFragment(context, new WinningFragment());
        } else {
            //alley or room
            goToAlleyOrRoom(context);
        }
    }

    public static void loseAlleyOrRoom(Context context) {
        if (randInt(1, 10) == 1) {
            //go to lose
            replaceFragment(context, new LosingFragment());
        } else {
            //alley or room
            goToAlleyOrRoom(context);
        }
    }

    private static void replaceFragment(Context context, CustomFragment f) {
        FragmentTransaction ft = ((ActionBarActivity) context).getFragmentManager().beginTransaction();
        ft.addToBackStack(f.getTagName());
        ft.replace(R.id.container, f, f.getTagName()).commit();
    }

    private static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
}
