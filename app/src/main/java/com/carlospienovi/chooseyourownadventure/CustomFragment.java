package com.carlospienovi.chooseyourownadventure;

import android.app.Fragment;

/**
 * Created by carlos.pienovi on 29/01/2015.
 */
public abstract class CustomFragment extends Fragment{

    public String getTagName() {
        return getClass().getSimpleName();
    }
}
