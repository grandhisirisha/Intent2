package com.example.mlrit.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity
{
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv=(TextView)findViewById(R.id.tv);
        Intent i=getIntent();
        Bundle b=i.getExtras();
       String s1= b.getString("k");
        tv.setText(s1);

    }
}
