package com.improve10x.multiscreens;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MessageAdapter extends BaseAdapter {
    public MessagesItems[] item;

    public MessageAdapter(MessagesItems[] messagesItems) {
        item = messagesItems;
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
        MessengerItemViewHolder viewHolder;
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            convertView = inflater.inflate(R.layout.message_items, parent, false);
            viewHolder = new MessengerItemViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (MessengerItemViewHolder) convertView.getTag();
        }
        MessagesItems items = (MessagesItems) getItem(position);
        viewHolder.titleTxt.setText(items.title);
        viewHolder.timeTxt.setText(items.dis);
        Picasso.get().load(items.poster).into(viewHolder.posterIv);
        return convertView;
    }
}


