package com.improve10x.multiscreens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MessengerActivity extends AppCompatActivity {
    MessagesItems[]messagesItems;
    ListView messageLv;
    MessageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messenger);
        initViews();
        createData();
        setUpData();
        connectAdapter();
    }

    private void connectAdapter() {
        messageLv.setAdapter(adapter);

    }

    private void setUpData() {
        adapter = new MessageAdapter(messagesItems);
        
    }

    private void createData() {
        messagesItems = new MessagesItems[6];
        MessagesItems item1 = new MessagesItems();
        item1.poster = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item1.title = "Sam Scott";
        item1.dis = "Hey how's  it going";
        messagesItems[0] = item1;

        MessagesItems item2 = new MessagesItems();
        item2.poster = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item2.title = "Mai Tran";
        item2.dis = "Mai sent a Sticker";
        messagesItems[1] = item2;

        MessagesItems item3 = new MessagesItems();
        item3.poster = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item3.title = "Emmie Bearos";
        item3.dis = "Hi again:(";
        messagesItems[2] = item3;

        MessagesItems item4 = new MessagesItems();
        item4.poster = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item4.title = "Jorge";
        item4.dis = "can't wait!";
        messagesItems[3] = item4;

        MessagesItems item5 = new MessagesItems();
        item5.poster = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item5.title = "Manu Manohar";
        item5.dis = "Nice";
        messagesItems[4] = item5;

        MessagesItems item6 = new MessagesItems();
        item6.poster = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item6.title = "Surf Team";
        item6.dis = "Hello😎";
        messagesItems[5] = item6;


    }

    private void initViews() {
        messageLv = findViewById(R.id.message_lv);
        
    }
}