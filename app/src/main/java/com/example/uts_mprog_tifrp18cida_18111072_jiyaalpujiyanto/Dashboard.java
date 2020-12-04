package com.example.uts_mprog_tifrp18cida_18111072_jiyaalpujiyanto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Dashboard extends AppCompatActivity {
TextView receiver_msg;
TextView timeL;
ListView simpleList;

    String interest[] = {"Interest","Gaming","Reading"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        receiver_msg=(TextView)findViewById(R.id.nama);
        timeL=(TextView)findViewById(R.id.date);

        Intent intent = getIntent();

        String str=intent.getStringExtra("message_key");

        receiver_msg.setText(str);

        SimpleDateFormat sdf=new SimpleDateFormat("dd.MM.yyyy 'at' HH:mm:ss z");
        String currentDateandTime = sdf.format(new Date());
        timeL.setText(currentDateandTime);


        simpleList = (ListView)findViewById(R.id.interest);
        ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, interest);
        simpleList.setAdapter(arrayAdapter);
    }
}