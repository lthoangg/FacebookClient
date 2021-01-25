package vn.edu.usth.facebookclient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Comment;

public class CommentActivity extends AppCompatActivity {

    private String[] content;
    private String[] username;
    private String[] time;
    private ImageView avatar_pic;
    private TextView name;
    private TextView comment;
    private TextView timestamp;
    private LinearLayout comment_display;
    private LinearLayout comment_container;
    private TextView finish;
    private ImageButton btn;
    private EditText u_content;
    private LinearLayout ln;

    public static String[] add(int n, String[] arr, String x)
    {
        int i;

        // create a new array of size n+1
        String newarr[] = new String[n + 1];

        for (i = 0; i < n; i++)
            newarr[i] = arr[i];

        newarr[n] = x;

        return newarr;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);

        content = new String[]{"This is a comment", "This is another comment", "Another oneeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", "Another! =)))"};
        username = new String[]{"LQN", "DTK", "LTH", "NTT"};
        time = new String[]{"5h", "69h", "Just now", "1m"};
        int id = getResources().getIdentifier("drawable/d0tb7.jpg", null, null);

        for (int i = 0; i<content.length; i++){
            comment_container = (LinearLayout) findViewById(R.id.comment_container);
            comment_display=(LinearLayout)this.getLayoutInflater().inflate(R.layout.comment,null);
            name = comment_display.findViewById(R.id.username);
            comment = comment_display.findViewById(R.id.comment);
            timestamp = comment_display.findViewById(R.id.time);
            name.setText(username[i]);
            comment.setText(content[i]);
            timestamp.setText(time[i]);
            comment_container.addView(comment_display);

            Log.i("Comment", "Generated");
        }

        finish = (TextView) findViewById(R.id.return_post);
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btn = (ImageButton) findViewById(R.id.comment_submit);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                u_content = (EditText) findViewById(R.id.input_commment);
                Log.i("Comment", "Created new comment: " + u_content.getText().toString());
                add(content.length, content, u_content.getText().toString());
                add(username.length, content, u_content.getText().toString());

                u_content.setText("");
//                Intent reload = new Intent(getApplicationContext(), CommentActivity.class);
//                startActivity(reload);
                recreate();
            }

        });


    }
}