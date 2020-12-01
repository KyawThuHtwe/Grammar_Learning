package com.cu.grammarlearning.Adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.cu.grammarlearning.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class ViewPagerAdapter extends PagerAdapter {

    private ArrayList<String> pagerData;
    private LayoutInflater inflater;
    private Context context;

    public ViewPagerAdapter(ArrayList<String> pagerData, Context context) {
        this.pagerData = pagerData;
        this.context = context;
    }

    @Override
    public int getCount() {
        return pagerData.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.slider_layout,container,false);
        final TextView title;
        title=view.findViewById(R.id.timer);
        title.setText(pagerData.get(position).toString());

        container.addView(view,0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}

