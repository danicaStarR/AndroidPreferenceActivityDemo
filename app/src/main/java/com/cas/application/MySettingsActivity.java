package com.cas.application;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class MySettingsActivity extends PreferenceActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preference);
    }
    
}
