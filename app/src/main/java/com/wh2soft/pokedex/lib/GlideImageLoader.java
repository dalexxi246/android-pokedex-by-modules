package com.wh2soft.pokedex.lib;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.wh2soft.pokedex.lib.base.ImageLoader;

/**
 * Created by ykro.
 */
public class GlideImageLoader implements ImageLoader {
    private RequestManager glideRequestManager;

    public void setLoaderContext(Context context) {
        this.glideRequestManager = Glide.with(context);
    }

    @Override
    public void load(ImageView imageView, String URL, int width, int height) {
        if (width > 0 && height > 0) {
            glideRequestManager
                    .load(URL)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .override(width, height)
                    .centerCrop()
                    .into(imageView);
        } else {
            glideRequestManager
                    .load(URL)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .centerCrop()
                    .into(imageView);
        }
    }

    @Override
    public void load(ImageView imageView, int drawableSrc, int width, int height) {
        if (width > 0 && height > 0) {
            glideRequestManager
                    .fromResource()
                    .asBitmap()
                    .load(drawableSrc)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .override(width, height)
                    .centerCrop()
                    .into(imageView);
        } else {
            glideRequestManager
                    .fromResource()
                    .asBitmap()
                    .load(drawableSrc)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .centerCrop()
                    .into(imageView);
        }
    }
}
