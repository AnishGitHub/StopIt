package com.anirudh.stopit;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class TabHostActivity extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_host);

        Resources res = getResources(); // Resource object to get Drawables
        TabHost tabHost = getTabHost(); // The activity TabHost
        TabHost.TabSpec spec; // Reusable TabSpec for each tab
        Intent intent; // Reusable Intent for each tab

        // Create an Intent to launch an Activity for the tab (to be reused)
        intent = new Intent().setClass(this, MyReportsActivity.class);
        spec = tabHost.newTabSpec("my_reports")
                .setIndicator("", res.getDrawable(R.mipmap.home))
                .setContent(intent);
        tabHost.addTab(spec);

        // Do the same for the other tabs

        intent = new Intent().setClass(this, CameraActivity.class);
        spec = tabHost.newTabSpec("camera")
                .setIndicator("", res.getDrawable(R.mipmap.camera))
                .setContent(intent);
        tabHost.addTab(spec);


        intent = new Intent().setClass(this, SettingsActivity.class);
        spec = tabHost
                .newTabSpec("contact")
                .setIndicator("",
                        res.getDrawable(R.mipmap.settings))
                .setContent(intent);
        tabHost.addTab(spec);

        //set tab which one you want open first time 0 or 1 or 2
        tabHost.setCurrentTab(0);


    }

}