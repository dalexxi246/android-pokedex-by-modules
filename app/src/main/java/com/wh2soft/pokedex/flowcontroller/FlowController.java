package com.wh2soft.pokedex.flowcontroller;

import android.content.Context;
import android.content.Intent;

import com.wh2soft.pokedex.ui.gameplay.GamePlayImageModeActivity;
import com.wh2soft.pokedex.ui.start.MainActivity;

/**
 * Created by wilmer on 4/08/16.
 */
public class FlowController {

    public static void launchMainActivity(Context context) {
        Intent starter = new Intent(context, MainActivity.class);
        context.startActivity(starter);
    }

    public static void launchGamePlay(Context context) {
        Intent starter = new Intent(context, GamePlayImageModeActivity.class);
        context.startActivity(starter);
    }

}
