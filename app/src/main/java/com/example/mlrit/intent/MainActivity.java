package com.example.mlrit.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    EditText et1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.b1);
        et1=(EditText)findViewById(R.id.et1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this,Main2Activity.class);

                Bundle b=new Bundle();
                b.putString("k",et1.getText().toString());
                i.putExtras(b);
                //setIntent(i);
               // putExtras
                startActivity(i);
            }
        });
    }
}
