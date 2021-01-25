package vn.edu.usth.facebookclient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.ImageButton;
import android.widget.ImageView;

import com.facebook.AccessToken;
import com.facebook.login.LoginManager;

import java.util.Arrays;

public class Post1Activity extends AppCompatActivity {
    private ImageButton btn_comment;
    private ImageView back_btn;
    protected void comment_view(){
        Intent intent = new Intent(Post1Activity.this, CommentActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post1);

        back_btn = findViewById(R.id.back);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Post1Activity.this, MainActivity.class));
            }
        });
        btn_comment = (ImageButton) findViewById(R.id.comment);
        btn_comment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                comment_view();
            }
        });
    }
}