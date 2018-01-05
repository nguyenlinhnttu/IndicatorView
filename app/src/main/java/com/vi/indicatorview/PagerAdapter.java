package com.vi.indicatorview;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by nguyenvanlinh
 * Date: 1/5/18.
 * BSV Android Dev
 */

public class PagerAdapter extends android.support.v4.view.PagerAdapter {

    private Context mContext;

    public PagerAdapter(Context context) {
        mContext = context;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.page, container, false);
        TextView tvPage = layout.findViewById(R.id.tv_page);
        tvPage.setText(String.valueOf(position));
        if (position == 0) {
            layout.setBackgroundColor(mContext.getResources().getColor(R.color.color0));
        } else if (position == 1) {
            layout.setBackgroundColor(mContext.getResources().getColor(R.color.color1));
        } else if (position == 2) {
            layout.setBackgroundColor(mContext.getResources().getColor(R.color.color2));
        } else if (position == 3) {
            layout.setBackgroundColor(mContext.getResources().getColor(R.color.color3));
        } else if (position == 4) {
            layout.setBackgroundColor(mContext.getResources().getColor(R.color.color4));
        }

        container.addView(layout);
        return layout;
    }
}