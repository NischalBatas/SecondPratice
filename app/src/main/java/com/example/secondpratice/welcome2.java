package com.example.secondpratice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

public class welcome2 extends AppCompatActivity {

    String[] secondArry= {"a","b","c","d","e"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome2);

        ArrayAdapter adp1=new ArrayAdapter(this,R.layout.items_layout,secondArry);
        GridView lv=findViewById(R.id.lv_id);
        lv.setAdapter(adp1);
    }
}
