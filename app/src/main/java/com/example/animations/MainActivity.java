package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view){
        ImageView BartimageView = (ImageView)findViewById(R.id.BartimageView);
        ImageView HomerimageView = (ImageView)findViewById(R.id.HomerimageView);
       BartimageView.animate().translationX(-1000).rotation(180).setDuration(2000);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}