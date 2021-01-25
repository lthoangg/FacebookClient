package vn.edu.usth.facebookclient.mainActivity;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import vn.edu.usth.facebookclient.Post1Activity;
import vn.edu.usth.facebookclient.Post2Activity;
import vn.edu.usth.facebookclient.R;

public class NotificationFragment extends Fragment {

    public NotificationFragment() {
        // Required empty public constructor
    }
    private LinearLayout noti1;
    private LinearLayout noti2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =inflater.inflate(R.layout.fragment_notification, container, false);
        noti1 = (LinearLayout) v.findViewById(R.id.noti1);
        noti1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Post1Activity.class);
                startActivity(intent);
            }
        });
        noti2 = (LinearLayout) v.findViewById(R.id.noti2);
        noti2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Post2Activity.class);
                startActivity(intent);
            }
        });
        return v;
    }

}