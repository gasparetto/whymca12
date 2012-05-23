package org.whymca.lib;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class TypefaceHelper {
    private Context context;
    private String typefaceName;

    public TypefaceHelper(Context context, AttributeSet attrs) {
        this.context = context;
        this.typefaceName = null;

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CustomTextView);
        for (int i = 0; i < a.getIndexCount(); i++) {
            int attr = a.getIndex(i);
            switch (attr) {
            case R.styleable.CustomTextView_typeface:
                this.typefaceName = a.getString(attr);
                break;
            }
        }
        a.recycle();
    }

    public void setTypeface(TextView view) {
        if (view.isInEditMode())
            return;

        if (this.typefaceName != null) {
            Typeface font = Typeface.createFromAsset(context.getAssets(), "fonts/" + this.typefaceName);
            // Typeface font = get(context, "fonts/" + this.typefaceName);
            view.setTypeface(font);
        }
    }

    // private static final Hashtable<String, Typeface> cache = new Hashtable<String, Typeface>();
    //
    // private static Typeface get(Context c, String assetPath) {
    // synchronized (cache) {
    // if (!cache.containsKey(assetPath)) {
    // Typeface t = Typeface.createFromAsset(c.getAssets(), assetPath);
    // cache.put(assetPath, t);
    // }
    // return cache.get(assetPath);
    // }
    // }

}
