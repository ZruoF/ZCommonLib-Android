package com.example.lib_component.banner;


import android.content.Context;
import android.widget.Scroller;

/**
 * Created by zengruofan on 17/10/17.
 */

public class ZCLBannerScroller extends Scroller {
    private int mDuration = 1000;

    public ZCLBannerScroller(Context context, int duration) {
        super(context);
        mDuration = duration;
    }

    @Override
    public void startScroll(int startX, int startY, int dx, int dy) {
        super.startScroll(startX, startY, dx, dy, mDuration);
    }

    @Override
    public void startScroll(int startX, int startY, int dx, int dy, int duration) {
        super.startScroll(startX, startY, dx, dy, mDuration);
    }
}
