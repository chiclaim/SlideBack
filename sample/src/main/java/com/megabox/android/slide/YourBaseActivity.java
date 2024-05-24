package com.megabox.android.slide;

import androidx.appcompat.app.AppCompatActivity;

/**
 * 在 Base Activity 中集成 Slide 功能，通过组合的方式：
 * 1. 在 onContentChange 中调用 {@link SlideBack#attach()}
 * 2. 在 onDestroy 中调用 {@link SlideBack#detach()}
 */
public abstract class YourBaseActivity extends AppCompatActivity {

    private final SlideBack slideBack = new SlideBack(this);

    public void enableSlideBack(boolean flag) {
        slideBack.enableSlide(flag);
    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();
        slideBack.attach();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        slideBack.detach();
    }

}
