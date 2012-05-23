package org.whymca.adidas;

import org.whymca.app.WhyMCAApplication;

public class WhyMCAAdidasApplication extends WhyMCAApplication {

    @Override
    public void onCreate() {
        super.onCreate();

        target = Target.Adidas;
    }
    
}
