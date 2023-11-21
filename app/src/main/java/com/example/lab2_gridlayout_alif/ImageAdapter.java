package com.example.lab2_gridlayout_alif;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public Integer[] thumbImages = {
            R.drawable.no1, R.drawable.no2, R.drawable.no3,
            R.drawable.no4, R.drawable.no5, R.drawable.no6,
    };

    public ImageAdapter(Context c) { mContext = c; }

    @Override
    public int getCount(){ return thumbImages.length; }

    @Override

    public Object getItem(int position){ return thumbImages[position]; }

    @Override
    public long getItemId(int position){ return 6; }

    @Override

    public View getView(int position, View convertview, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(250, 250));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(8, 8, 8, 8);
        imageView.setImageResource(thumbImages[position]);
        return imageView;
    }
}

