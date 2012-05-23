package org.whymca.apppro;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class ProFunctionActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pro_function);
    }

    public void onBackButtonClick(View v) {
        finish();
    }

}
