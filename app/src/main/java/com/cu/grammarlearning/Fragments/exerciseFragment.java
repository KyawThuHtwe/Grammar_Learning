package com.cu.grammarlearning.Fragments;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.cu.grammarlearning.AdvanceActivity;
import com.cu.grammarlearning.BasicActivity;
import com.cu.grammarlearning.IntermediateActivity;
import com.cu.grammarlearning.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class exerciseFragment extends Fragment {

    String[] exercise=new String[]{"Basic","Intermediate","Advance"};
    ListView exercise_list;

    public static exerciseFragment newInstance() {
        exerciseFragment fragment = new exerciseFragment();
        return fragment;
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        exercise_list=view.findViewById(R.id.exercise_list);
        exercise_list.setAdapter(new Adapter());
        exercise_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                try {
                    if (position == 0) {
                        Intent intent = new Intent(getContext(), BasicActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                    }else if (position == 1) {
                        Intent intent = new Intent(getContext(), IntermediateActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                    }else if (position == 2) {
                        Intent intent = new Intent(getContext(), AdvanceActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                    }
                }catch (Exception e){
                    Toast.makeText(getContext(),e.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });
        return view;
    }
    public class Adapter extends BaseAdapter {

        @Override
        public int getCount() {
            return exercise.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view=getLayoutInflater().inflate(R.layout.custom_item,null);
            TextView textView=view.findViewById(R.id.data);
            textView.setText(exercise[position]);
            return view;
        }
    }
}