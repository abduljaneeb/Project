package com.example.myapplication;

import android.content.Intent;   // ✅ add this import
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e = findViewById(R.id.text);
    }

    public void send(View v) {
        String index = e.getText().toString();
        Intent i = new Intent(this, MainActivity2.class); // ✅ capital I
        i.putExtra("imageIndex", index);
        startActivity(i);
    }
}
