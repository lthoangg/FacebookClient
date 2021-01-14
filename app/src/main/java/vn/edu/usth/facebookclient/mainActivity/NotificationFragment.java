package vn.edu.usth.facebookclient.mainActivity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import vn.edu.usth.facebookclient.R;

public class NotificationFragment extends Fragment {

    public NotificationFragment() {
        // Required empty public constructor
    }
//
//    public static NotificationFragment newInstance() {
//        NotificationFragment fragment = new NotificationFragment();
//        return fragment;
//    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notification, container, false);
    }
}