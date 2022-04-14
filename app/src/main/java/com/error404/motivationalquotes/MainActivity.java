package com.error404.motivationalquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listv=findViewById(R.id.listv);
        String[] names={"sacheera","madhushan","sacheera","madhushan","sacheera","madhushan","sacheera","madhushan","sacheera","madhushan","sacheera","madhushan","sacheera","madhushan"};
        ListAdapter list=new ArrayAdapter<String>(this,R.layout.single,names);
        listv.setAdapter(list);
    }
}