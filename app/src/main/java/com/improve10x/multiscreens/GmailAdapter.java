package com.improve10x.multiscreens;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class GmailAdapter extends BaseAdapter {
   public GmailItems[] items;
   public GmailAdapter(GmailItems[]gmailItems){
       items = gmailItems;
   }


    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
       GmailItems item = (GmailItems) getItem(i);
        LayoutInflater  inflater = LayoutInflater.from(viewGroup.getContext());
        View view1 = inflater.inflate(R.layout.gmail_items,viewGroup,false);
        TextView titleTxt = view1.findViewById(R.id.title3_txt);
        titleTxt.setText(item.title);
        TextView discTxt = view1.findViewById(R.id.dis3_txt);
        discTxt.setText(item.description);
        TextView timeTxt = view1.findViewById(R.id.time_txt);
        timeTxt.setText(item.time);
        ImageView posterIv = view1.findViewById(R.id.poster1_iv);
        Picasso.get().load(item.poster).into(posterIv);
        return view1;
    }
}
