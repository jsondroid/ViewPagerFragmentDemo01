package jsondroid.android.com.viewpagerfragmentdemo01;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragmentA extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    private View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (rootView == null) {
            rootView = inflater.inflate(R.layout.fragment_a, container, false);
        }
        return rootView;
    }


    @Override
    public void onStart() {
        Log.e("FragmentA---->","onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.e("FragmentA---->","onResume");
        super.onResume();
    }

    @Override
    public void onDestroyView() {
        Log.e("FragmentA---->","onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.e("FragmentA---->","onDestroy");
        super.onDestroy();
    }
}
