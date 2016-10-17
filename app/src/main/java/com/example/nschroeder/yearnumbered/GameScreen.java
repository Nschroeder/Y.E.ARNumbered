package com.example.nschroeder.yearnumbered;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class GameScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_screen);
    }

    public void pauseGame(View view){
        Intent intent = new Intent(GameScreen.this, PauseMenu.class);
        startActivity(intent);
    }
    public void shopScreen (View view) {
        Intent intent2 = new Intent(GameScreen.this, ShopScreen.class);
        startActivity(intent2);
    }
}

