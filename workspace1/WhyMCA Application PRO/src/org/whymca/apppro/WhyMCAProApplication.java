package org.whymca.apppro;

import org.whymca.app.WhyMCAApplication;

public class WhyMCAProApplication extends WhyMCAApplication {

    @Override
    public void onCreate() {
        super.onCreate();

        target = Target.PRO;
    }

}
