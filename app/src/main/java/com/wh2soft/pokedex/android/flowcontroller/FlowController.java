package com.wh2soft.pokedex.android.flowcontroller;

import android.content.Context;
import android.content.Intent;

import com.wh2soft.pokedex.android.ui.MainActivity;

/**
 * Created by wilmer on 4/08/16.
 */
public class FlowController {

    public static void launchMainActivity(Context context) {
        Intent starter = new Intent(context, MainActivity.class);
        context.startActivity(starter);
    }

}
