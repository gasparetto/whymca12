package org.whymca.app;

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

    public void onProFunctionClick(View v) {
        startActivity(new Intent(this, ProFunctionActivity.class));
    }

    public void onAboutClick(View v) {
        String message = getString(R.string.app_name) + "\n" + getString(R.string.app_version) + "\n";
        new AlertDialog.Builder(this).setMessage(message).setNeutralButton("OK", null).show();
    }

}