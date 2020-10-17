package com.nvh.login_logup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class CustListView extends AppCompatActivity {
    Button bt_profile,bt_home;
    ListView listView;
    String mTitle[]={"Nguyễn Văn Hải","Người nào đó","Big City Boy","Hai Thế Giới","Ông trời làm tội anh chưa","Người nào đó","Big City Boy","Hai Thế Giới","Ông trời làm tội anh chưa","Người nào đó","Big City Boy","Hai Thế Giới","Ông trời làm tội anh chưa"};
    String mTitle2[]={"1811505310213","JustaTea","BinZ","Wowy","QNT","JustaTea","BinZ","Wowy","QNT","JustaTea","BinZ","Wowy","QNT"};
    int img[]={R.drawable.ic_play,R.drawable.ic_play,R.drawable.ic_play,R.drawable.ic_play,R.drawable.ic_play,R.drawable.ic_play,R.drawable.ic_play,R.drawable.ic_play,R.drawable.ic_play,R.drawable.ic_play,R.drawable.ic_play,R.drawable.ic_play,R.drawable.ic_play};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cust_list_view);
        listView=findViewById(R.id.listview);

        bt_profile = (Button) findViewById(R.id.bt_profile);
        bt_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten= new Intent(CustListView.this, Profile.class);
                startActivity(inten);
            }
        });

        bt_home = (Button) findViewById(R.id.bt_home);
        bt_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten= new Intent(CustListView.this, Home.class);
                startActivity(inten);
            }
        });

        MyAdapter adapter = new MyAdapter(this,mTitle, mTitle2,img);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent , View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(CustListView.this, "Nguyễn Văn Hải", Toast.LENGTH_SHORT).show();
                }
                if ( position == 0) {
                    Toast.makeText(CustListView.this, "Người nào đó", Toast.LENGTH_SHORT).show();
                }
                if ( position == 0) {
                    Toast.makeText(CustListView.this, "Big City Boy", Toast.LENGTH_SHORT).show();
                }
                if ( position == 0) {
                    Toast.makeText(CustListView.this, "Hai thế giới", Toast.LENGTH_SHORT).show();
                }
                if ( position == 0) {
                    Toast.makeText(CustListView.this, "Ông trời làm tội anh chưa", Toast.LENGTH_SHORT).show();
                }
                if ( position == 0) {
                    Toast.makeText(CustListView.this, "Người nào đó", Toast.LENGTH_SHORT).show();
                }
                if ( position == 0) {
                    Toast.makeText(CustListView.this, "Big City Boy", Toast.LENGTH_SHORT).show();
                }
                if ( position == 0) {
                    Toast.makeText(CustListView.this, "Hai thế giới", Toast.LENGTH_SHORT).show();
                }
                if ( position == 0) {
                    Toast.makeText(CustListView.this, "Ông trời làm tội anh chưa", Toast.LENGTH_SHORT).show();
                }
                if ( position == 0) {
                    Toast.makeText(CustListView.this, "Người nào đó", Toast.LENGTH_SHORT).show();
                }
                if ( position == 0) {
                    Toast.makeText(CustListView.this, "Big City Boy", Toast.LENGTH_SHORT).show();
                }
                if ( position == 0) {
                    Toast.makeText(CustListView.this, "Hai thế giới", Toast.LENGTH_SHORT).show();
                }
                if ( position == 0) {
                    Toast.makeText(CustListView.this, "Ông trời làm tội anh chưa", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
    class MyAdapter extends ArrayAdapter<String>{

        Context context;
        String rTitle[];
        String rTitle2[];
        int rimg[];
        MyAdapter(Context c,String title[],String title2[], int img[] ){
            super(c,R.layout.row,title);
            this.context=c;
            this.rTitle=title;
            this.rTitle2=title2;
            this.rimg=img;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row,parent, false);
            ImageView images = row.findViewById(R.id.img);
            TextView myTitle = row.findViewById(R.id.text1);
            TextView myTitle2 = row.findViewById(R.id.text2);

            images.setImageResource(rimg[position]);
            myTitle.setText(rTitle[position]);
            myTitle2.setText(rTitle2[position]);

            return row;
        }
    }


}