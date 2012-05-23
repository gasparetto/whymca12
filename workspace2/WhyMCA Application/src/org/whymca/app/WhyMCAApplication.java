package org.whymca.app;

import android.app.Application;

public class WhyMCAApplication extends Application {

    public enum Target {
        Adidas, Converse, Nike
    }

    public static Target target;

    public static Target getTarget() {
        return target;
    }

}
