package org.whymca.app;

import android.app.Application;

public class WhyMCAApplication extends Application {

    public enum Target {
        LITE, PRO
    }

    public static Target target;

    public static Target getTarget() {
        return target;
    }

}
