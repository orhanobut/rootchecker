package com.orhanobut.android.rootcheckerlib;

import android.app.Activity;
import android.os.Bundle;

import com.orhanobut.android.rootchecker.RootChecker;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (RootChecker.isDeviceRooted()) {
            // device is rooted
        }
    }
}
