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

public class Home extends AppCompatActivity {
    Button bt_music,bt_profile;
    ListView listView;
    String mTitle[]={"Nguyễn Văn Hải","Header","Header","Header","Header","Header","Header","Header","Header"};
    String mTitle2[]={"Hello my name is Hai","Hello my name is Hai","Hello my name is Hai","Hello my name is Hai","Hello my name is Hai","Hello my name is Hai","Hello my name is Hai","Hello my name is Hai","Hello my name is Hai"};
    String mTitle3[]={"1m ago","1m ago","1m ago","1m ago","1m ago","1m ago","1m ago","1m ago","1m ago"};
    int img[]={R.drawable.anhhai,R.drawable.anhhai,R.drawable.anhhai,R.drawable.anhhai,R.drawable.anhhai,R.drawable.anhhai,R.drawable.anhhai,R.drawable.anhhai,R.drawable.anhhai};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        listView=findViewById(R.id.lvProfile);

        bt_music = (Button) findViewById(R.id.bt_music);
        bt_profile = (Button) findViewById(R.id.bt_profile);
        bt_music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten= new Intent(Home.this, CustListView.class);
                startActivity(inten);
            }
        });
        bt_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten= new Intent(Home.this, Profile.class);
                startActivity(inten);
            }
        });



        MyAdapter adapter = new MyAdapter(this,mTitle, mTitle2, mTitle3,img);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent , View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(Home.this, "Description", Toast.LENGTH_SHORT).show();
                }
                if ( position == 0) {
                    Toast.makeText(Home.this, "Description", Toast.LENGTH_SHORT).show();
                }
                if ( position == 0) {
                    Toast.makeText(Home.this, "Description", Toast.LENGTH_SHORT).show();
                }
                if ( position == 0) {
                    Toast.makeText(Home.this, "Description", Toast.LENGTH_SHORT).show();
                }
                if ( position == 0) {
                    Toast.makeText(Home.this, "Description", Toast.LENGTH_SHORT).show();
                }
                if ( position == 0) {
                    Toast.makeText(Home.this, "Description", Toast.LENGTH_SHORT).show();
                }
                if ( position == 0) {
                    Toast.makeText(Home.this, "Description", Toast.LENGTH_SHORT).show();
                }
                if ( position == 0) {
                    Toast.makeText(Home.this, "Description", Toast.LENGTH_SHORT).show();
                }
                if ( position == 0) {
                    Toast.makeText(Home.this, "Description", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
    class MyAdapter extends ArrayAdapter<String>{

        Context context;
        String rTitle[];
        String rTitle2[];
        String rTitle3[];
        int rimg[];
        MyAdapter(Context c,String title[],String title2[],String title3[], int img[] ){
            super(c,R.layout.row2,title);
            this.context=c;
            this.rTitle=title;
            this.rTitle2=title2;
            this.rTitle3=title3;
            this.rimg=img;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row2,parent, false);
            ImageView images = row.findViewById(R.id.hinh);
            TextView myTitle = row.findViewById(R.id.title1);
            TextView myTitle2 = row.findViewById(R.id.title3);
            TextView myTitle3 = row.findViewById(R.id.time);

            images.setImageResource(rimg[position]);
            myTitle.setText(rTitle[position]);
            myTitle2.setText(rTitle2[position]);
            myTitle3.setText(rTitle3[position]);

            return row;
        }
    }


}