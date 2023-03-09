package com.improve10x.multiscreens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class FacebookActivity extends AppCompatActivity {
    ListView facebookLv;
    FacebookItems[] facebookItems;
    FacebookAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);
        initViews();
        createData();
        setUpData();
        connectAdapter();
    }

    private void connectAdapter() {
        facebookLv.setAdapter(adapter);

    }

    private void setUpData() {
        adapter = new FacebookAdapter(facebookItems);

    }

    private void createData() {
        facebookItems = new FacebookItems[7];
        FacebookItems item1 = new FacebookItems();
        item1.poster = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item1.title = "Angela Jaemi Favorito Huit reacted to your story";
        item1.time1 = "1 hour ago";
        facebookItems[0] = item1;

        FacebookItems item2 = new FacebookItems();
        item2.poster = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item2.title = "Kimwana Michael, Linh An and Channell Boxley asked to join I Love Still Life Painting!.";
        item2.time1 = "1 hour ago";
        facebookItems[1] = item2;

        FacebookItems item3 = new FacebookItems();
        item3.poster = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item3.title = "Lloyd Cafe Cadena is live now:LAPIT NA MAG END OF SEASON!!!.";
        item3.time1 = "1 hour ago";
        facebookItems[2] = item3;

        FacebookItems item4 = new FacebookItems();
        item4.poster = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item4.title = "Sia Ellise Mejorada commented on a post in Hachi's Buy and Sell Group.";
        item4.time1 = "1 hour ago";
        facebookItems[3] = item4;

        FacebookItems item5 = new FacebookItems();
        item5.poster = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item5.title = "Mavreen Anne Romero and others added to their stories";
        item5.time1 = "1 hour ago";
        facebookItems[4] = item5;

        FacebookItems item6 = new FacebookItems();
        item6.poster = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item6.title = "Sosy Sophie, Rampage Traveland Tours and LetsircEcarg Nodner Nillillam listed in CAMSUR... 2 hours ago Bobby Alvarez and others added to their stories.";
        item6.time1 = "1 hour ago";
        facebookItems[5] = item6;

        FacebookItems item7 = new FacebookItems();
        item7.poster = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item7.title = "Angela Jaemi Favorito Huit reacted to your story";
        item7.time1 = "1 hour ago";
        facebookItems[6] = item7;

    }

    private void initViews() {
        facebookLv = findViewById(R.id.facebook_lv);

    }
}