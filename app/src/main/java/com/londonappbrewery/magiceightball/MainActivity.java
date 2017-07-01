package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Random RNumber = new Random();
        final ImageView ball = (ImageView) findViewById(R.id.Ball_image);
        final int[] ImgArr ={R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,
        R.drawable.ball4,R.drawable.ball5};
        Button AskButton = (Button) findViewById(R.id.Ask_button);
        AskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ball.setImageResource(ImgArr[RNumber.nextInt(5)]);
            }
        });
    }
}
