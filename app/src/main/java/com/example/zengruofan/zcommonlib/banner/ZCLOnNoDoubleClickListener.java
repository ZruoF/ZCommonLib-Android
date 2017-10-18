package com.example.zengruofan.zcommonlib.banner;

import android.view.View;

/**
 * Created by zengruofan on 17/10/16.
 * 单击事件
 */

public abstract class ZCLOnNoDoubleClickListener implements View.OnClickListener {
    private int mThrottleFirstTime = 1000;
    private long mLastClickTime = 0;

    public ZCLOnNoDoubleClickListener() {
    }

    public ZCLOnNoDoubleClickListener(int throttleFirstTime) {
        mThrottleFirstTime = throttleFirstTime;
    }

    @Override
    public void onClick(View v) {
        long currentTime = System.currentTimeMillis();
        if (currentTime - mLastClickTime > mThrottleFirstTime) {
            mLastClickTime = currentTime;
            onNoDoubleClick(v);
        }
    }

    public abstract void onNoDoubleClick(View v);
}
