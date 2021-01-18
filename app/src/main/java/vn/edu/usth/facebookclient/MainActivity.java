package vn.edu.usth.facebookclient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

import vn.edu.usth.facebookclient.mainActivity.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Facebook client";

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Toolbar toolbar;
    private TextView create_post;
    private ImageButton button;
    private int[] tabIcons = {R.drawable.home, R.drawable.notifi, R.drawable.menu};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        for (int i = 0; i < 3; i++){
            tabLayout.getTabAt(i).setIcon(tabIcons[i]);
        }
        Log.i(TAG, "onCreate()'ed");
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        button = (ImageButton) findViewById(R.id.search);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSearchActivity();
            }
        });
    }
    public void openSearchActivity(){
        Intent intent = new Intent(this, SearchActivity.class);
        startActivities(new Intent[]{intent});
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