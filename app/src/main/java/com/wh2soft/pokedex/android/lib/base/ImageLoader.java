package com.wh2soft.pokedex.android.lib.base;

import android.widget.ImageView;

/**
 * Created by ykro.
 */
public interface ImageLoader {
    void load(ImageView imageView, String URL, int width, int height);

    void load(ImageView imageView, int drawableSrc, int width, int height);
}
