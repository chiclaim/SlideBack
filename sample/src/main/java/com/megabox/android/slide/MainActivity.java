package com.megabox.android.slide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.megabox.android.slide.sample.R;

public class MainActivity extends YourBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // 首页禁用滑动返回(默认没有上一个页面就无法滑动返回)
        enableSlideBack(false);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_click_me).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
                startActivity(intent);
            }
        });
    }
}
