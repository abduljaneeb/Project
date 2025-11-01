package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageView i1 , i2 , i3 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i1 = findViewById(R.id.img1);
        i2 = findViewById(R.id.img2);
        i3 = findViewById(R.id.img3);
        }

        public void change(View v){
        int id = v.getId();
        if (id == R.id.img1) {
            i1.setVisibility(View.GONE);
            i2.setVisibility(View.VISIBLE);
        }else  if (id == R.id.img2) {
            i2.setVisibility(View.GONE);
            i3.setVisibility(View.VISIBLE);
        }else if (id == R.id.img3){
            i3.setVisibility(View.GONE);
            i1.setVisibility(View.VISIBLE);
        }
    }
}
