package com.example.bundles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class second_activity extends AppCompatActivity {

    TextView tvtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {                       //if their is no value so they do not show any data in this case
            String data = bundle.getString("data");         //type of data that we have to recieve from the main activity in extras
int phone =bundle.getInt("age",0);
            tvtext.setText(data + "number is:" +phone);
        }
    }
}