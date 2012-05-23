package org.whymca.nike;

import org.whymca.app.WhyMCAApplication;

public class WhyMCANikeApplication extends WhyMCAApplication {

    @Override
    public void onCreate() {
        super.onCreate();

        target = Target.Nike;
    }

}
