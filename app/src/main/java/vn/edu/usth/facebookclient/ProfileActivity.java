package vn.edu.usth.facebookclient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import android.view.View;
import android.widget.ImageButton;
import android.widget.SearchView;
import android.widget.TextView;


public class ProfileActivity extends AppCompatActivity {
    private final String TAG = "Profile Acitivity";

    private SearchView searchButton;
    private ImageButton backButton;
    private TextView createcap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Log.i(TAG, "onCreate()'ed");
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        backButton = findViewById(R.id.back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        createcap = findViewById(R.id.create_cap);
        createcap.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileActivity.this, CreatePostActivity.class));
            }
        });
    }

    private void toSearchActivity(){
        startActivity(new Intent(ProfileActivity.this, SearchActivity.class));
    }

    public static class PostActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            //Receive image from intent
            int image = getIntent().getIntExtra("image", R.drawable.attendance);
            ImageView ava = (ImageView) findViewById(R.id.imageView);
            ava.setImageResource(image);
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_post1);
        }
    }
}

