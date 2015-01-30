package com.carlospienovi.chooseyourownadventure;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.support.v7.app.ActionBarActivity;

import java.util.Random;

/**
 * Created by carlos.pienovi on 23/01/2015.
 */
public class GoToActivity {

    private static final int ALLEY_FRAGMENT = 0;
    private static final int ROOM_FRAGMENT = 1;

    public static void goToAlleyOrRoom(Context context) {
        if (randInt(ALLEY_FRAGMENT, ROOM_FRAGMENT) == ALLEY_FRAGMENT) {
            replaceFragment(context, new AlleyFragment(), AlleyFragment.TAG);
        } else {
            replaceFragment(context, new RoomFragment(), RoomFragment.TAG);
        }
    }

    public static void winAlleyOrRoom(Context context) {
        if (randInt(1, 10) == 1) {
            //go to win
            replaceFragment(context, new WinningFragment(), WinningFragment.TAG);
        } else {
            //alley or room
            goToAlleyOrRoom(context);
        }
    }

    public static void loseAlleyOrRoom(Context context) {
        if (randInt(1, 10) == 1) {
            //go to lose
            replaceFragment(context, new LosingFragment(),LosingFragment.TAG);
        } else {
            //alley or room
            goToAlleyOrRoom(context);
        }
    }

    private static void replaceFragment(Context context, Fragment f, String tag) {
        FragmentTransaction ft = ((ActionBarActivity) context).getFragmentManager().beginTransaction();
        ft.addToBackStack(tag);
        ft.replace(R.id.container, f, tag).commit();
    }

    private static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
}
