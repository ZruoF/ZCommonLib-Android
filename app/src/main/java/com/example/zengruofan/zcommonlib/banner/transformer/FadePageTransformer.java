package com.example.zengruofan.zcommonlib.banner.transformer;

import android.support.v4.view.ViewCompat;
import android.view.View;

/**
 * Created by zengruofan on 17/10/18.
 * 渐入渐出
 */

public class FadePageTransformer extends ZCLPageTransformer {
    @Override
    public void handleInvisiblePage(View view, float position) {
    }

    @Override
    public void handleLeftPage(View view, float position) {
        ViewCompat.setTranslationX(view, -view.getWidth() * position);
        ViewCompat.setAlpha(view, 1 + position);
    }

    @Override
    public void handleRightPage(View view, float position) {
        ViewCompat.setTranslationX(view, -view.getWidth() * position);
        ViewCompat.setAlpha(view, 1 - position);
    }
}
