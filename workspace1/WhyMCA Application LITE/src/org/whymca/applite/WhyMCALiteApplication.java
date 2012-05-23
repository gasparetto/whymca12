package org.whymca.applite;

import org.whymca.app.WhyMCAApplication;

public class WhyMCALiteApplication extends WhyMCAApplication {

    @Override
    public void onCreate() {
        super.onCreate();

        target = Target.LITE;
    }

}
