package org.whymca.lib;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class CustomTextView extends TextView {

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        new TypefaceHelper(context, attrs).setTypeface(this);
    }

    public CustomTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        new TypefaceHelper(context, attrs).setTypeface(this);
    }

}
