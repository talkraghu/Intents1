package com.therags.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Oranges extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oranges);

        Bundle applesData  = getIntent().getExtras();

        if(null != applesData)
        {
            String appleInput = applesData.getString("appleInput");
            if(null != appleInput)
            {
                TextView textView = (TextView) findViewById(R.id.orange_text);
                textView.setText(appleInput);
            }
        }

    }

    public void onClick(View view)
    {
        Intent applesIntent = new Intent(this, Apples.class);
        startActivity(applesIntent);

    }
}
