package com.example.listviewexample;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;


public class ArrayAdapterActivity extends ListActivity {

    static String[] ANIMALS = new String[] {"Ant", "Bear", "Bird", "Cat"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_adapter);

        ListView listView = getListView();

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_array_adapter, ANIMALS);
        setListAdapter(adapter);
        listView.setTextFilterEnabled(true);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ArrayAdapterActivity.this, ((TextView)view).getText(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    public static class Animal {

        String type;
        private int picId;
        public Animal (String type, int picId){
            this.type = type;
            this.picId = picId;
        }
        public String getType() {
            return type;
        }
        public void setType(String type) {
            this.type = type;
        }
        public int getPicId() {
            return picId;
        }
        public void setPicId(int picId)
    }
}
