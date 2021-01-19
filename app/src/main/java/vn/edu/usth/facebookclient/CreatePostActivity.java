package vn.edu.usth.facebookclient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import vn.edu.usth.facebookclient.data.DBHandler;
import vn.edu.usth.facebookclient.data.Post;

public class CreatePostActivity extends AppCompatActivity {

    private ImageView back_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_post);

        back_btn = (ImageView) findViewById(R.id.back_btn);
        back_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CreatePostActivity.this, MainActivity.class));
            }
        });


        Button submit = findViewById(R.id.upload);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createPost(v);
                Toast.makeText(getApplicationContext(), "Create post successfully",Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void createPost(View v){
        DBHandler dbHandler = new DBHandler(this, null, null, 1);
        EditText editText = findViewById(R.id.editable);
        String caption = editText.getText().toString();
        Post new_post = new Post(caption);
        dbHandler.addHandle(new_post);
    }

}