package com.example.easysendtrans.ScreenHome;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.easysendtrans.R;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class IntroViewPagerIklan extends PagerAdapter {

    Context mContext1 ;
    List<ScreenIklan> mListScreen1;

    public IntroViewPagerIklan(Context mContext1,List<ScreenIklan> mListScreen1) {
        this.mContext1 = mContext1;
        this.mListScreen1 = mListScreen1; }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) mContext1.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layoutIklan = inflater.inflate(R.layout.layout_screen_iklan,null);

        ImageView ImgIklan = layoutIklan.findViewById(R.id.imageIklan);

        ImgIklan.setImageResource(mListScreen1.get(position).getScreenIklan());

        container.addView(layoutIklan);

        return layoutIklan;
    }

    @Override
    public int getCount() {
        return mListScreen1.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
