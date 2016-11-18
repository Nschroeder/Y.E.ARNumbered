package com.example.nschroeder.yearnumbered;

import android.content.Intent;
import android.graphics.Point;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.view.View;

import static android.view.MotionEvent.INVALID_POINTER_ID;


public class GameScreen extends AppCompatActivity {

    private static int touchX, touchY;
    private static int screenWidth, screenHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_screen);
        /*Display mdisp = getWindowManager().getDefaultDisplay();
        Point mdispSize = new Point();
        mdisp.getSize(mdispSize);
        int maxX = mdispSize.x;
        int maxY = mdispSize.y;*/


        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        screenHeight = displayMetrics.heightPixels;
        screenWidth = displayMetrics.widthPixels;
    }

    public void pauseGame(View view){
        Intent intent = new Intent(GameScreen.this, PauseMenu.class);
        startActivity(intent);
    }

    @Override
    public void onPause(){
        super.onPause();
        overridePendingTransition(0,0);
    }

    /*View view = findViewById(android.R.id.content);
    view.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {

        }
    };

    public void moveLeft() {
        ImageView imageView = (ImageView) findViewById(R.id.game);
        float x = imageView.getX();
        x-=10;
        imageView.setX(x);
    }
    public void getDistance(){
        int y,x;
        int slope;
        if(touchX > (screenWidth / 2)){
            x = touchX - (screenWidth / 2);
            y = screenHeight - touchY;
        }else{
            x = (screenWidth / 2) - touchX;
            y = screenHeight - touchY;
        }

        slope = y/x;
    }*/



}

