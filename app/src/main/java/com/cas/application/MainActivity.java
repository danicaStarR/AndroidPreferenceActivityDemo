package com.cas.application;
 
import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.graphics.Color;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Toast;

public class MainActivity extends Activity { 
     
    LinearLayout lloyout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lloyout = findViewById(R.id.layout);
        
        
        setColor();
    }

    @Override
    protected void onResume() {
        super.onResume();
        
        setColor();
    }
    
    
    
    private void setColor() {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        String s = sp.getString("color","RED");
        t(s);
        
        switch(s) {
            case "RED":
                lloyout.setBackgroundColor(Color.RED);
            break;
            case "GREEN":
                lloyout.setBackgroundColor(Color.GREEN);
            break;
            default:
                
            break;
        }
    }
    private void t(String o) {
        Toast.makeText(MainActivity.this,o,Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.settings) {
            // TODO: open activity
            Intent intent = new Intent(MainActivity.this,MySettingsActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    
    
	
} 
