package com.carlospienovi.chooseyourownadventure;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;

import java.util.Random;

/**
 * Created by carlos.pienovi on 23/01/2015.
 */
public class GoToActivity {

    private static final int ALLEY_FRAGMENT = 0;
    private static final int ROOM_FRAGMENT = 1;

    public static void goToAlleyOrRoom(Context context) {
        Fragment nextActivity;
        if (randInt(ALLEY_FRAGMENT, ROOM_FRAGMENT) == ALLEY_FRAGMENT) {
            nextActivity = new AlleyFragment();
        } else {
            nextActivity = new RoomFragment();
        }
        ((ActionBarActivity) context).getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, nextActivity)
                .commit();
    }

    public static void winAlleyOrRoom(Context context) {
        if (randInt(1, 10) == 1) {
            //go to win
            ((ActionBarActivity) context).getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, new WinningFragment())
                    .commit();
        } else {
            //alley or room
            goToAlleyOrRoom(context);
        }
    }

    public static void loseAlleyOrRoom(Context context) {
        if (randInt(1, 10) == 1) {
            //go to lose
            ((ActionBarActivity) context).getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, new LosingFragment())
                    .commit();
        } else {
            //alley or room
            goToAlleyOrRoom(context);
        }
    }

    private static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
}
