package com.example.activitylifecycle;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class MainActivity extends ActionBarActivity {

	//1. Called when app opened
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Logs to console 
         * different methods for error, warning, debug, etc
         * Takes resources, so remove or comment out when app is finished 
         * Accepts a tag and a comment. Can filter LogCat by tag */
        Log.d("APP", "onCreate was called");
    }
    
    //2. called when app opened
    @Override
    protected void onStart(){
    	super.onStart();
    	Log.d("APP", "onStart was called");
    }
    
    //3. Called when app opened, resumed from onPause. app now running
    @Override
    protected void onResume(){
    	super.onResume();
    	Log.d("APP", "onResume was called");
    }
    
    /*
     * 4. Called when app has dialog disabling the screen,
     * switches to another activity
     */
    @Override
    protected void onPause(){
    	super.onPause();
    	Log.d("APP", "onPause was called");
    }
    
    //5. Called when app switches to another activity, or app
    @Override
    protected void onStop(){
    	super.onStop();
    	Log.d("APP", "onStop was called");
    }
    
    //6. Called manually with finish method, or when android runs out of mem
    //If switching portrait/landscape views, goes back to 1. onCreate
    //Then 2. onStart, and 3. onResume
    @Override
    protected void onDestroy(){
    	super.onDestroy();
    	Log.d("APP", "onDestroy was called");
    }
    
    //7. If app is stopped and restarts: switches from another app to yours
    //Then calls 2. onStart, and 3. onResume
    @Override
    protected void onRestart(){
    	super.onRestart();
    	Log.d("APP", "onRestart was called");
    }
    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

}
