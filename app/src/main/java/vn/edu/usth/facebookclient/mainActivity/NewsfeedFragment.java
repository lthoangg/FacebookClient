package vn.edu.usth.facebookclient.mainActivity;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


import vn.edu.usth.facebookclient.CreatePostActivity;
import vn.edu.usth.facebookclient.Post1Activity;
import vn.edu.usth.facebookclient.Post2Activity;
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

        return v;
    }

}
