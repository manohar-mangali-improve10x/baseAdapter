package com.improve10x.multiscreens;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MessengerItemViewHolder {
    public TextView titleTxt;
    public ImageView posterIv;
    public TextView timeTxt;

    public MessengerItemViewHolder(View convertView) {
        titleTxt = convertView.findViewById(R.id.title3_txt);
        timeTxt = convertView.findViewById(R.id.di1s_txt);
        posterIv = convertView.findViewById(R.id.poster1_iv);
    }
}
