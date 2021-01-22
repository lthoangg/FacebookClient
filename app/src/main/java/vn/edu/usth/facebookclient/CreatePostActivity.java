package vn.edu.usth.facebookclient;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.InputStream;

import vn.edu.usth.facebookclient.data.DBHandler;
import vn.edu.usth.facebookclient.data.Post;

public class CreatePostActivity extends AppCompatActivity {
    private ImageView back_btn;
    private static final int SELECT_PHOTO =100 ;
    private ImageView contain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_post);

        back_btn = (ImageView) findViewById(R.id.back_btn);
        back_btn.setOnClickListener(new View.OnClickListener() {
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
            }
        });
        contain = findViewById(R.id.image_contain);

    }

    private void createPost(View v) {
        DBHandler dbHandler = new DBHandler(this, null, null, 1);
        EditText editText = findViewById(R.id.editable);
        String caption = editText.getText().toString();
        Post new_post = new Post(caption);
        dbHandler.addHandle(new_post);
        Toast.makeText(getApplicationContext(), "Create post successfully", Toast.LENGTH_SHORT).show();
    }

    public void openCamera(View view) {
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent, SELECT_PHOTO);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == SELECT_PHOTO) {
            if (resultCode == RESULT_OK) {
                Uri selectImage = data.getData();
                InputStream inputStream = null;
                try {
                    assert selectImage != null;
                    inputStream = getContentResolver().openInputStream(selectImage);
                } catch (FileNotFoundException f) {
                    f.printStackTrace();
                }
                BitmapFactory.decodeStream(inputStream);
                contain.setImageURI(selectImage);
            }
        }
    }
}