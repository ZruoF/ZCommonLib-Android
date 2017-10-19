package com.example.zengruofan.zcommonlib;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.zengruofan.zcommonlib.banner.BannerSelectedActivity;
import com.example.zengruofan.zcommonlib.webviewna.HybridViewActivity;

public class MainActivity extends Activity {

    private Button mBtnWebNa;
    private Button mBannerSelect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnWebNa = (Button) findViewById(R.id.btn_webna);
        mBtnWebNa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, HybridViewActivity.class);
                startActivity(intent);
            }
        });

        mBannerSelect = (Button) findViewById(R.id.btn_banner_select);
        mBannerSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, BannerSelectedActivity.class);
                startActivity(intent);
            }
        });
    }
}
