package vn.edu.usth.facebookclient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageButton;

public class Post2Activity extends AppCompatActivity {
    private ImageButton btn_comment;
    protected void comment_view(){
        Intent intent = new Intent(this, CommentActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post2);
        ImageView back_btn;
        back_btn = (ImageView) findViewById(R.id.back_btn);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Post2Activity.this, MainActivity.class));
        btn_comment = (ImageButton) findViewById(R.id.comment);
        btn_comment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                comment_view();
            }
        });
    }

}