package com.example.myapplication;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner s = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> a = ArrayAdapter.createFromResource(this,
                R.array.numbers, android.R.layout.simple_spinner_item);
        s.setAdapter(a);

        s.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {
            public void onItemSelected(android.widget.AdapterView<?> p, android.view.View v, int pos, long id) {
                Toast.makeText(MainActivity.this, p.getItemAtPosition(pos).toString(), Toast.LENGTH_SHORT).show();
            }
            public void onNothingSelected(android.widget.AdapterView<?> p) { }
        });
    }
}
