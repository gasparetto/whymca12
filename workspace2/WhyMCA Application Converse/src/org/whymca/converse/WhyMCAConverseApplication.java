package org.whymca.converse;

import org.whymca.app.WhyMCAApplication;

public class WhyMCAConverseApplication extends WhyMCAApplication {

    @Override
    public void onCreate() {
        super.onCreate();

        target = Target.Converse;
    }
    
}
