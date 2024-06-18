package com.megabox.android.slide;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.megabox.android.slide.sample.R;
/**
 * @author lihong
 * @since 2016/10/28
 */
public class ListViewActivity extends YourBaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_layout);
        ListView listView = findViewById(R.id.list_view);

//        ListView listView = new ListView(this);
        listView.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                return 30;
            }

            @Override
            public Object getItem(int position) {
                return null;
            }

            @Override
            public long getItemId(int position) {
                return 0;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                if (convertView == null) {
                    TextView textView = (TextView) LayoutInflater.from(ListViewActivity.this)
                        .inflate(android.R.layout.simple_list_item_1, parent, false);

                    textView.setGravity(Gravity.CENTER_VERTICAL);
                    textView.setPadding(30, 0, 0, 0);
                    textView.setTextSize(20);
                    textView.setTextColor(Color.BLACK);
                    convertView = textView;
                }

                TextView textView = (TextView) convertView;
                textView.setText("Item " + String.valueOf(position + 1));

                return convertView;
            }
        });

//        setContentView(listView);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ListViewActivity.this, ListViewActivity.class);
                startActivity(intent);
            }
        });
    }
}
