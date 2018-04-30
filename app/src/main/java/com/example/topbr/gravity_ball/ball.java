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

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ball);
        start = findViewById(R.id.button);
        rest = findViewById(R.id.button2);
        final ImageView character = findViewById(R.id.character);
        final ImageView star = findViewById(R.id.star);
        character.setX(0);
        character.setY(0);
        rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                TextView text = findViewById(R.id.Timer);
                text.setText("0");
                character.setX(0);
                character.setY(0);
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
                       callRight();
                    }
                });
                left.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(final View v) {
                        callLeft();
                    }
                });
                up.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(final View v) {
                        callUp();
                    }
                });
                down.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(final View v) {
                        callDown();
                    }
                });
            }
        });

    }
    void callRight() {
        ImageView character = findViewById(R.id.character);
        ImageView star = findViewById(R.id.star);
        float x = character.getX();
        character.setX(x + 20);
        if (character.getX() == star.getX()
                && character.getY() == star.getY()) {
            if (star.getX() > 540) {
                float temp = star.getX();
                star.setX(temp - 100);
            } else {
                float temp = star.getX();
                star.setX(temp + 100);
            }
            if (star.getY() > 480) {
                float temp = star.getY();
                star.setY(temp - 100);
            } else {
                float temp = star.getY();
                star.setY(temp + 100);
            }
        }
    }
    void callLeft() {
        ImageView character = findViewById(R.id.character);
        ImageView star = findViewById(R.id.star);
        float x = character.getX();
        character.setX(x - 20);
        if (character.getX() >= star.getX() - 50 && character.getX() <= star.getX() + 50

                && character.getY() == star.getY()) {
            if (star.getX() > 540) {
                float temp = star.getX();
                star.setX(temp - 100);
            } else {
                float temp = star.getX();
                star.setX(temp + 100);
            }
            if (star.getY() > 480) {
                float temp = star.getY();
                star.setY(temp - 100);
            } else {
                float temp = star.getY();
                star.setY(temp + 100);
            }
        }
    }
    void callUp() {
        ImageView character = findViewById(R.id.character);
        ImageView star = findViewById(R.id.star);
        float y = character.getY();
        character.setY(y + 20);
        if (character.getX() == star.getX()
                && character.getY() == star.getY()) {
            if (star.getX() > 540) {
                float temp = star.getX();
                star.setX(temp - 100);
            } else {
                float temp = star.getX();
                star.setX(temp + 100);
            }
            if (star.getY() > 480) {
                float temp = star.getY();
                star.setY(temp - 100);
            } else {
                float temp = star.getY();
                star.setY(temp + 100);
            }
        }
    }
    void callDown() {
        ImageView character = findViewById(R.id.character);
        ImageView star = findViewById(R.id.star);
        float y = character.getY();
        character.setY(y - 20);
        if (character.getX() == star.getX()
                && character.getY() == star.getY()) {
            if (star.getX() > 540) {
                float temp = star.getX();
                star.setX(temp - 100);
            } else {
                float temp = star.getX();
                star.setX(temp + 100);
            }
            if (star.getY() > 480) {
                float temp = star.getY();
                star.setY(temp - 100);
            } else {
                float temp = star.getY();
                star.setY(temp + 100);
            }
        }
    }
}


