package com.amulyakhare.td.sample.sample;

import android.graphics.drawable.Drawable;

/**
 * @author amulya
 * @datetime 17 Oct 2014, 3:50 PM
 */
public class DataItem {

    /*https://github.com/amulyakhare/TextDrawable*/
    /*https://github.com/amulyakhare/TextDrawable*/
    /*https://github.com/amulyakhare/TextDrawable*/

    private String label;

    private Drawable drawable;

    private int navigationInfo;

    public DataItem(String label, Drawable drawable, int navigationInfo) {
        this.label = label;
        this.drawable = drawable;
        this.navigationInfo = navigationInfo;
    }

    public String getLabel() {
        return label;
    }

    public Drawable getDrawable() {
        return drawable;
    }

    public int getNavigationInfo() {
        return navigationInfo;
    }
}
