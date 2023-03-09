package com.improve10x.multiscreens;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class CallAdapter extends BaseAdapter {
    public CallItems[] items;
    public CallAdapter(CallItems[]callItems){
        items = callItems;
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CallItems item = (CallItems) getItem(position);
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.call_item,parent,false);
        TextView titleTxt = view.findViewById(R.id.number_txt);
        titleTxt.setText(item.title);
        TextView desTxt = view.findViewById(R.id.time_txt);
        desTxt.setText(item.description);
        ImageView posterLv = view.findViewById(R.id.person_iv);
        Picasso.get().load(item.poster).into(posterLv);
        return view;
    }
}
