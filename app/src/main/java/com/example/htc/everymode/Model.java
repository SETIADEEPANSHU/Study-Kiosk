package com.example.htc.everymode;

import android.graphics.Bitmap;

/**
 * Created by htc on 2/3/17.
 */
public class Model {
    String name;
    Bitmap imaBitmap;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bitmap getImage() {
        return imaBitmap;
    }

    public void setImage(Bitmap imaBitmap) {
        this.imaBitmap = imaBitmap;
    }
}