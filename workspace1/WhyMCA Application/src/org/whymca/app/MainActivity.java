package org.whymca.app;

import org.whymca.app.WhyMCAApplication.Target;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void onLiteFunctionClick(View v) {
        startActivity(new Intent(this, LiteFunctionActivity.class));
    }

    public void onProFunctionClick(View v) {
        if (WhyMCAApplication.getTarget() == Target.PRO) {
            try {
                startActivity(new Intent(this, Class.forName("org.whymca.apppro.ProFunctionActivity")));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            new AlertDialog.Builder(this).setMessage(R.string.buy_the_pro_version).setNeutralButton("OK", null).show();
        }
    }

    public void onAboutClick(View v) {
        String message = getString(R.string.app_name) + "\n" + getString(R.string.app_version) + "\n";
        new AlertDialog.Builder(this).setMessage(message).setNeutralButton("OK", null).show();
    }

}