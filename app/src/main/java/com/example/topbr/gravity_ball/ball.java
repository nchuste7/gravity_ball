package com.example.topbr.gravity_ball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class ball extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button left;

        Button right;

        Button up;

        Button down;

        final ImageView character;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ball);

        character = findViewById(R.id.character);
        left = findViewById(R.id.left);
        right = findViewById(R.id.right);
        up = findViewById(R.id.up);
        down = findViewById(R.id.down);
        character.setX(0);
        character.setY(0);
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                float x = character.getX();
                character.setX(x + 20);
            }
        });
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                float x = character.getX();
                character.setX(x - 20);
            }
        });
        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                float y = character.getY();
                character.setY(y + 20);
            }
        });
        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                float y = character.getY();
                character.setY(y - 20);
            }
        });
    }
}


