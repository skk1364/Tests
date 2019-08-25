package com.noori.tests.view.component;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class EditTextNormal extends android.support.v7.widget.AppCompatEditText {
    public EditTextNormal(Context context) {
        super(context);
        setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/Normal.ttf"));
    }

    public EditTextNormal(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/Normal.ttf"));
    }

    public EditTextNormal(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/Normal.ttf"));
    }
}
