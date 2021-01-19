package vn.edu.usth.facebookclient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class ProfileActivity extends AppCompatActivity {
    private final String TAG = "Profile Acitivity";

    private ImageButton searchButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Log.i(TAG, "onCreate()'ed");
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        searchButton = findViewById(R.id.search);
        searchButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                toSearchActivity();
            }
        });
    }

    private void toSearchActivity(){
        startActivity(new Intent(ProfileActivity.this, SearchActivity.class));
    }
}

