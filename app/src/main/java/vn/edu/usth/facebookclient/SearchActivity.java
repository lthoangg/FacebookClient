package vn.edu.usth.facebookclient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SearchActivity extends AppCompatActivity {

    private ImageButton searchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        searchButton = findViewById(R.id.back);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSearchActivity();
            }
        });
    }

    public void openSearchActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivities(new Intent[]{intent});
    }
}