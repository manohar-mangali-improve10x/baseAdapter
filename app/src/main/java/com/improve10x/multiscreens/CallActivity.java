package com.improve10x.multiscreens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class CallActivity extends AppCompatActivity {
    ListView callLv;
    CallItems[]callItems;
    CallAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        intiViews();
        createData();
        setUpAdapter();
        connectAdapter();
    }

    private void createData() {
        callItems = new CallItems[6];
        CallItems item1 = new CallItems();
        item1.poster = "https://static.thenounproject.com/png/100859-200.png";
        item1.title = "Manu";
        item1.description = "↙india,6 min .ago";
        callItems[0] = item1;

        CallItems item2 = new CallItems();
        item2.poster = "https://static.thenounproject.com/png/100859-200.png";
        item2.title = "WiFi";
        item2.description = "Mobile, 1 hour.ago";
        callItems[1] = item2;

        CallItems item3 = new CallItems();
        item3.poster = "https://static.thenounproject.com/png/100859-200.png";
        item3.title = "919063031082";
        item3.description = "↙india , 15 min.ago";
        callItems[2] = item3;

        CallItems item4 = new CallItems();
        item4.poster = "https://static.thenounproject.com/png/100859-200.png";
        item4.title = "91755955254";
        item4.description = "↙india , 15 min.ago";
        callItems[3] = item4;

        CallItems item5 = new CallItems();
        item5.poster = "https://static.thenounproject.com/png/100859-200.png";
        item5.title = "+14586226356";
        item5.description = "↙india , 15 min.ago";
        callItems[4] = item5;

        CallItems item6 = new CallItems();
        item6.poster = "https://static.thenounproject.com/png/100859-200.png";
        item6.title = "916303109270";
        item6.description = "2days,ago";
        callItems[5] = item6;

    }

    private void setUpAdapter() {
        adapter = new CallAdapter(callItems);

    }

    private void connectAdapter() {
        callLv.setAdapter(adapter);

    }

    private void intiViews() {
        callLv = findViewById(R.id.call_lv);
    }
}