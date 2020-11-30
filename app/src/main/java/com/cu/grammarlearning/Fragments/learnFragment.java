package com.cu.grammarlearning.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.cu.grammarlearning.R;
import com.cu.grammarlearning.ViewActivity;

/**
 * A placeholder fragment containing a simple view.
 */
public class learnFragment extends Fragment {


    String[] exercise=new String[]{"Phrase, Clause, and Sentence","Cleft Sentences","Collocations","Comparison"
    ,"Conditionals","Correlative Conjunctions","Degrees of Comparison","Direct Indirect","Double Negative Pattern"
    ,"Either or","Ergative Verbs","Enough to ... so that","So that enough to","Gerunds","Infinitives"
    ,"Idioms","It is/ was","Inversion","Linking Verbs","Nouns in Apposition","too to not enough to"
    ,"Neither of","Neither ... nor","Not only .... but also","Noun Clauses","No sooner ... than","Participles"
    ,"Passives","Phrasal Verbs","Prepositions","Parallel Structure","Relative Clauses","So that ... such that"
    ,"So .. that","Subject, Object and Complement","So that ... too to","Stative Verbs","Tenses","too to ... so that"
    ,"If ... Unless","Regular and Irregular Verbs","Finite and Non-finite Verbs","When ... V-ing","Without"
    ,"Auxiliary Verbs","Action Verbs","Adverb Clauses","After","Although ... In spite of","Active ... Passive"
    ,"Causative Verbs"};
    ListView exercise_list;

    public static learnFragment newInstance() {
        learnFragment fragment = new learnFragment();
        return fragment;
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_learn, container, false);
        exercise_list=view.findViewById(R.id.exercise_list);
        exercise_list.setAdapter(new Adapter());
        exercise_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                try {
                    Intent intent = new Intent(getContext(), ViewActivity.class);
                    intent.putExtra("Learn",exercise[position]);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
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