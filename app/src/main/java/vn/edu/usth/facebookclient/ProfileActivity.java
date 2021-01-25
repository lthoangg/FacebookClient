package vn.edu.usth.facebookclient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import android.view.View;
import android.widget.ImageButton;
import android.widget.SearchView;


public class ProfileActivity extends AppCompatActivity {
    private final String TAG = "Profile Acitivity";

    private SearchView searchButton;
    private ImageButton backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Log.i(TAG, "onCreate()'ed");
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        searchButton = findViewById(R.id.search_bar);
        searchButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                toSearchActivity();
            }
        });

        backButton = findViewById(R.id.back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
                startActivities(new Intent[]{intent});
            }
        });
    }

    private void toSearchActivity(){
        startActivity(new Intent(ProfileActivity.this, SearchActivity.class));
    }

    public static class PostActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_post1);
        }
    }
}

