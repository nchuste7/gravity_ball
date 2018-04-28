package com.example.topbr.gravity_ball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;


public class ball extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button left;

        Button right;

        Button up;

        Button down;

        Button start;

        Button rest;
        final ImageView character;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ball);

        character = findViewById(R.id.character);
        start = findViewById(R.id.button);
        rest = findViewById(R.id.button2);
        character.setX(0);
        character.setY(0);
        rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                TextView text = findViewById(R.id.Timer);
                text.setText("0");
            }
        });
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                TextView text = findViewById(R.id.Timer);
                text.setText("0");
                Button left = findViewById(R.id.left);
                Button right = findViewById(R.id.right);
                Button up = findViewById(R.id.up);
                Button down = findViewById(R.id.down);
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
        });
    }
}


