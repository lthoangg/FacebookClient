package vn.edu.usth.facebookclient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.facebook.AccessToken;
import com.facebook.login.LoginManager;

import java.util.Arrays;

public class Post1Activity extends AppCompatActivity {
    private ImageButton btn_comment;
    protected void comment_view(){
        Intent intent = new Intent(this, CommentActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post1);
        btn_comment = (ImageButton) findViewById(R.id.comment);
        btn_comment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                comment_view();
            }
        });

    }
}