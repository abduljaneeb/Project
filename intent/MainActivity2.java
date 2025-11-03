package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView img = findViewById(R.id.img1);

        // Get value from first activity
        String index = getIntent().getStringExtra("imageIndex");

        if (index.equals("1"))
            img.setImageResource(R.drawable.lambo);
        else if (index.equals("2"))
            img.setImageResource(R.drawable.pic);
        else if (index.equals("3"))
            img.setImageResource(R.drawable.tig);
        else
            img.setImageResource(R.drawable.sun);
    }
}
