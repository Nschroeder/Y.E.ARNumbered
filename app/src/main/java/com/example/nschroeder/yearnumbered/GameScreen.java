package com.example.nschroeder.yearnumbered;

import android.content.Intent;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class GameScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_screen);
        Display mdisp = getWindowManager().getDefaultDisplay();
        Point mdispSize = new Point();
        mdisp.getSize(mdispSize);
        int maxX = mdispSize.x;
        int maxY = mdispSize.y;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();
        return true;
    }

    public void pauseGame(View view){
        Intent intent = new Intent(GameScreen.this, PauseMenu.class);
        startActivity(intent);
    }
    public void shopScreen (View view) {
        Intent intent2 = new Intent(GameScreen.this, ShopScreen.class);
        intent2.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(intent2);
    }

    @Override
    public void onPause(){
        super.onPause();
        overridePendingTransition(0,0);
    }

}

