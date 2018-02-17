package com.example.manisaiprasad.mksnakes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int[] myDices={
            R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.four,
            R.drawable.five,
            R.drawable.six

    };

    public void rollTapped(View view){
        Log.i("Button", "rollTapped: ");
        Random ran = new Random();
        int x = ran.nextInt(6);
        Log.i("Num Gen", "NUM genrated is "+x);

        ImageView dice =(ImageView) findViewById(R.id.dices);
        dice.animate().alpha(0).setDuration(3000);
        dice.animate().alpha(1).setDuration(3000);
        dice.setImageResource(myDices[x]);


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
