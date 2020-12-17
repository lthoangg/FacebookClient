package vn.edu.usth.facebookclient;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Facebook client";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MenuFragment fragment = new MenuFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.mainActivity, fragment).commit();
        Log.i(TAG, "onCreate()'ed");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart()'ed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause()'ed");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume()'ed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop()'ed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy()'ed");
    }

}