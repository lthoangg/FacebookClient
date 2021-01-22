package vn.edu.usth.facebookclient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class ProfileActivity extends AppCompatActivity {
    private final String TAG = "Profile Acitivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Log.i(TAG, "onCreate()'ed");
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public static class PostActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            //Receive image from intent
            int image = getIntent().getIntExtra("image", R.drawable.attendance);
            ImageView ava = (ImageView) findViewById(R.id.imageView3);
            ava.setImageResource(image);
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_post1);
        }
    }
}

