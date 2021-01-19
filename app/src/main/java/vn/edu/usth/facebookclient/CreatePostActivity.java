package vn.edu.usth.facebookclient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class CreatePostActivity extends AppCompatActivity {

    private ImageView back_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        back_btn = (ImageView) findViewById(R.id.back_btn);
        back_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_post);


        EditText editText = findViewById(R.id.editable);
        Button submit = findViewById(R.id.upload);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "hello",Toast.LENGTH_SHORT).show();
            }
        });
    }

}