package com.example.lib_component.banner.transformer;

import android.support.v4.view.ViewCompat;
import android.view.View;

/**
 * Created by zengruofan on 17/10/18.
 * 渐入渐出
 */

public class AlphaPageTransformer extends ZCLPageTransformer {
    private float mMinScale = 0.4f;

    public AlphaPageTransformer() {
    }

    public AlphaPageTransformer(float minScale) {
        setMinScale(minScale);
    }

    @Override
    public void handleInvisiblePage(View view, float position) {
        ViewCompat.setAlpha(view, 0);
    }

    @Override
    public void handleLeftPage(View view, float position) {
        ViewCompat.setAlpha(view, mMinScale + (1 - mMinScale) * (1 + position));
    }

    @Override
    public void handleRightPage(View view, float position) {
        ViewCompat.setAlpha(view, mMinScale + (1 - mMinScale) * (1 - position));
    }

    public void setMinScale(float minScale) {
        if (minScale >= 0.0f && minScale <= 1.0f) {
            mMinScale = minScale;
        }
    }
}
