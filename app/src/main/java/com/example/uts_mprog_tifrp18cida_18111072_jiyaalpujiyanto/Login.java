package com.example.uts_mprog_tifrp18cida_18111072_jiyaalpujiyanto;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
Button b1;
EditText ed1,ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
                b1=(Button)findViewById(R.id.btn_submit);
                ed1 =(EditText)findViewById(R.id.editText);
                ed2=(EditText)findViewById(R.id.editText2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().equals("Jiya") && ed2.getText().toString().equals("admin")){
                    String str=ed1.getText().toString();
                    Intent intent=new Intent(getApplicationContext(), Dashboard.class);
                    intent.putExtra("message_key",str);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(), "ID atau password salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}