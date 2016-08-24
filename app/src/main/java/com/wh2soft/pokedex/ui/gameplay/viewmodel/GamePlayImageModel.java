package com.wh2soft.pokedex.ui.gameplay.viewmodel;

import android.graphics.Picture;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by wilmer on 15/08/16.
 */
public class GamePlayImageModel implements Serializable {

    @SerializedName("picture")
    public Picture picture;
    @SerializedName("name")
    public String name;
}
