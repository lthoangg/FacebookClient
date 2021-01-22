package vn.edu.usth.facebookclient.mainActivity;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import vn.edu.usth.facebookclient.CreatePostActivity;
import vn.edu.usth.facebookclient.Post1Activity;
import vn.edu.usth.facebookclient.Post2Activity;
import vn.edu.usth.facebookclient.ProfileActivity;
import vn.edu.usth.facebookclient.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NewsfeedFragment# newInstance} factory method to
 * create an instance of this fragment.
 */
public class NewsfeedFragment extends Fragment {
    public NewsfeedFragment() {
        // Required empty public constructor
    }
    private TextView create_cap;
    private LinearLayout post_1;
    private LinearLayout post_2;
    private ImageView ava_1;
    private ImageView ava_2;
    private TextView username1;
    private TextView username2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_newsfeed, container, false);
        create_cap = (TextView) v.findViewById(R.id.create_cap);
        create_cap.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CreatePostActivity.class);
                startActivity(intent);
            }
        });

        post_1 = (LinearLayout) v.findViewById(R.id.post_1);
        post_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Post1Activity.class);
                startActivity(intent);
            }
        });
        post_2 = (LinearLayout) v.findViewById(R.id.post_2);
        post_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Post2Activity.class);
                startActivity(intent);
            }
        });
        ava_1 = (ImageView) v.findViewById(R.id.ava_lth);
        ava_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ProfileActivity.class);
                //Pass ava image to profile activity
                intent.putExtra("image", R.drawable.lth);
                startActivity(intent);
            }
        });
        ava_2 = (ImageView) v.findViewById(R.id.ava_someone);
        ava_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ProfileActivity.class);
                //Pass ava image to profile activity
                intent.putExtra("image", R.drawable.imageavatar);
                startActivity(intent);
            }
        });
        username1 = (TextView) v.findViewById(R.id.username1);
        username1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ProfileActivity.class);
                //Pass ava image to profile activity
                intent.putExtra("image", R.drawable.lth);
                startActivity(intent);
            }
        });
        username2 = (TextView) v.findViewById(R.id.username2);
        username2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ProfileActivity.class);
                //Pass ava image to profile activity
                intent.putExtra("image", R.drawable.lth);
                startActivity(intent);
            }
        });
        return v;
    }

}
