package com.example.topbr.gravity_ball;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.TimerTask;
import java.util.Timer;


public class ball extends AppCompatActivity {

private int scoreNumber = 0;


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
                TextView endText = findViewById(R.id.gameOver);
                text.setText("0");
                endText.setVisibility(View.INVISIBLE);
                character.setX(20);
                character.setY(50);
                scoreNumber = 0;
                TextView scoreText = findViewById(R.id.score);
                scoreText.setText(String.valueOf(scoreNumber));
            }
        });
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                final TextView text = findViewById(R.id.Timer);
                final TextView endText = findViewById(R.id.gameOver);
                //timer for app
                new CountDownTimer(60000, 1000) {

                    public void onTick(long millisUntilFinished) {
                        text.setText(String.valueOf(millisUntilFinished / 1000));

                    }

                    public void onFinish() {
                        endText.setVisibility(View.VISIBLE);
                    }

                }.start();


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
        if (character.getX() >= star.getX() - 50 && character.getX() <= star.getX() + 50
                && character.getY() >= star.getY() - 50
                && character.getY() <= star.getY() + 50) {
            scoreNumber++;
            TextView scoreText = findViewById(R.id.score);
            scoreText.setText(String.valueOf(scoreNumber));
            if (star.getX() > 540) {
                float temp = star.getX();
                star.setX(temp - 125);
            } else {
                float temp = star.getX();
                star.setX(temp + 100);
            }
            if (star.getY() > 480) {
                float temp = star.getY();
                star.setY(temp - 100);
            } else {
                float temp = star.getY();
                star.setY(temp + 190);
            }
        }
    }

    void callLeft() {
        ImageView character = findViewById(R.id.character);
        ImageView star = findViewById(R.id.star);
        float x = character.getX();
        character.setX(x - 20);
        if (character.getX() >= star.getX() - 50 && character.getX() <= star.getX() + 50
                && character.getY() >= star.getY() - 50
                && character.getY() <= star.getY() + 50) {
            scoreNumber++;
            TextView scoreText = findViewById(R.id.score);
            scoreText.setText(String.valueOf(scoreNumber));
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
        if (character.getX() >= star.getX() - 50 && character.getX() <= star.getX() + 50
                && character.getY() >= star.getY() - 50
                && character.getY() <= star.getY() + 50) {
            scoreNumber++;
            TextView scoreText = findViewById(R.id.score);
            scoreText.setText(String.valueOf(scoreNumber));
            if (star.getX() > 540) {
                float temp = star.getX();
                star.setX(temp - 150);
            } else {
                float temp = star.getX();
                star.setX(temp + 130);
            }
            if (star.getY() > 480) {
                float temp = star.getY();
                star.setY(temp - 120);
            } else {
                float temp = star.getY();
                star.setY(temp + 210);
            }
        }
    }
    void callDown() {
        ImageView character = findViewById(R.id.character);
        ImageView star = findViewById(R.id.star);
        float y = character.getY();
        character.setY(y - 20);
        if (character.getX() >= star.getX() - 50 && character.getX() <= star.getX() + 50
                && character.getY() >= star.getY() - 50
                && character.getY() <= star.getY() + 50) {
            scoreNumber++;
            TextView scoreText = findViewById(R.id.score);
            scoreText.setText(String.valueOf(scoreNumber));
            if (star.getX() > 540) {
                float temp = star.getX();
                star.setX(temp - 200);
            } else {
                float temp = star.getX();
                star.setX(temp + 120);
            }
            if (star.getY() > 480) {
                float temp = star.getY();
                star.setY(temp - 170);
            } else {
                float temp = star.getY();
                star.setY(temp + 100);
            }
        }
    }
}


