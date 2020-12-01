package com.cu.grammarlearning.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.cu.grammarlearning.Adapters.ViewPagerAdapter;
import com.cu.grammarlearning.QuizActivity;
import com.cu.grammarlearning.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

import java.util.ArrayList;

public class quizFragment extends Fragment {

    ViewPager viewPager;
    ArrayList<String> array_timer;
    String selected_timer="5 Minutes";

    public static quizFragment newInstance() {
        quizFragment fragment = new quizFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_quiz, container, false);

        array_timer=new ArrayList<>();
        array_timer.clear();
        array_timer.add("1 Minutes");
        array_timer.add("2 Minutes");
        array_timer.add("3 Minutes");
        array_timer.add("4 Minutes");
        array_timer.add("5 Minutes");
        array_timer.add("6 Minutes");
        array_timer.add("7 Minutes");
        array_timer.add("8 Minutes");
        array_timer.add("9 Minutes");
        array_timer.add("10 Minutes");
        viewPager=view.findViewById(R.id.viewPager);
        viewPager.setAdapter(new ViewPagerAdapter(array_timer,getContext()));
        viewPager.setPadding(150,0,150,0);
        viewPager.setCurrentItem(4);
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                selected_timer=array_timer.get(position);
                //Toast.makeText(getContext(),array_timer.get(position),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        Button start=view.findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(getContext(), QuizActivity.class);
                    intent.putExtra("Type","Quiz");
                    intent.putExtra("Q","Quiz");
                    intent.putExtra("Retry","");
                    intent.putExtra("Timer",selected_timer);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }catch (Exception e){
                    Toast.makeText(getContext(),e.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });
        return view;
    }

}