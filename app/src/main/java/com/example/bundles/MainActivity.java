package com.example.bundles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ettext , ettext2;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ettext =findViewById(R.id.ettext);
        ettext2 =findViewById(R.id.ettext2);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),second_activity.class);
                intent.putExtra("data", ettext.getText().toString());
                int phone = Integer.parseInt(ettext2.getText().toString());
                intent.putExtra("phone", phone);
                startActivity(intent);
            }
        });
    }
}