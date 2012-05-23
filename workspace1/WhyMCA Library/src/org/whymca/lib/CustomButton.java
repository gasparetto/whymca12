package org.whymca.lib;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

public class CustomButton extends Button {

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);

        new TypefaceHelper(context, attrs).setTypeface(this);
    }

    public CustomButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        new TypefaceHelper(context, attrs).setTypeface(this);
    }

}
