package vn.edu.usth.facebookclient;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CommentActivity extends AppCompatActivity {

    private String[] content;
    private String[] username;
    private String[] time;
    private ImageView avatar_pic;
    private TextView name;
    private TextView comment;
    private LinearLayout comment_display;
    private LinearLayout comment_container;
    private String StringGenerated;

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
            name.setText(username[i]);
            comment.setText(content[i]);
            comment_container.addView(comment_display);
            Log.i("Comment", "Created");
        }

    }
}