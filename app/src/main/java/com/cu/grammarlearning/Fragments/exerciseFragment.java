package com.cu.grammarlearning.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.cu.grammarlearning.QuizActivity;
import com.cu.grammarlearning.R;


public class exerciseFragment extends Fragment {


    String[] quiz=new String[]{"Countable/Uncountable Noun","Adjective Ending","V-ing Infinitive3"
    ,"Unreal Present Future","Phrasal Verb","Modal Verb/ Obligation/Lack Of Obligation","Active.....Passive","Although.....In spite Of"
    ,"Both.....and","Direct.....Indirect","If.....Unless","Neither......Nor","Not only.....But also"
    ,"Relative clause","So that.....Such that","When.....V-ing","Article","Present Simple"
    ,"Present Continuous","Present Perfect","Present Perfect Continuous","Past Simple","Past Continuous"
    ,"Past Perfect","Past Perfect Continuous","Future Simple","Future Continuous","Future Perfect"};
    ListView quiz_list;

    public static exerciseFragment newInstance() {
        exerciseFragment fragment = new exerciseFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_exercise, container, false);

        quiz_list=view.findViewById(R.id.quiz_list);
        quiz_list.setAdapter(new Adapter());
        quiz_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                try {
                    Intent intent = new Intent(getContext(), QuizActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtra("Q",quiz[position]);
                    intent.putExtra("Type","Exercise");
                    startActivity(intent);
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
            return quiz.length;
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
            textView.setText(quiz[position]);
            return view;
        }
    }
}