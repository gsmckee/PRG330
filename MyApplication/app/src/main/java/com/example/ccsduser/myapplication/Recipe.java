package com.example.ccsduser.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static com.example.ccsduser.myapplication.R.id.btn_main;

/**
 * Created by CCSDuser on 2/22/2017.
 */

public class Recipe extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe);
        Button b = (Button)findViewById(R.id.btn_main);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Recipe.this, MainActivity.class));
            }
        });
    }
}
