package com.therags.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Apples extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apples);
    }

    public void onClick(View view)
    {
        Intent orangeIntent = new Intent(this, Oranges.class);

        EditText tv = (EditText) findViewById(R.id.apples_textInput);
        String input = tv.getText().toString();

        orangeIntent.putExtra("appleInput", input);

        startActivity(orangeIntent);
    }
}
