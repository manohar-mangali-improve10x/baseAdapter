package com.improve10x.multiscreens;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class FacebookAdapter extends BaseAdapter {
    public FacebookItems[] item;
    public FacebookAdapter(FacebookItems[] facebookItems) {
       item = facebookItems;
    }

    @Override
    public int getCount() {
        return item.length;
    }

    @Override
    public Object getItem(int position) {
        return item[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        FacebookItems items = (FacebookItems) getItem(position);
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.facebook_items,parent,false);
        TextView titleTxt = view.findViewById(R.id.title2_txt);
        titleTxt.setText(items.title);
        TextView timeTxt = view.findViewById(R.id.time2_txt);
        timeTxt.setText(items.time1);
        ImageView posterIv = view.findViewById(R.id.image_iv);
        Picasso.get().load(items.poster).into(posterIv);
        return view;
    }
}
