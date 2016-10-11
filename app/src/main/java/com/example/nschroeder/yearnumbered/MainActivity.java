package com.example.nschroeder.yearnumbered;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button shop = (Button) findViewById(R.id.button);
        //Button pause = (Button) findViewById(R.id.button);

    }

    public void pauseGame(View view){
        Intent intent = new Intent(this, PauseMenu.class);
        startActivity(intent);
    }
    public void shopScreen (View view) {
        Intent intent2 = new Intent(this, PauseMenu.class);
        startActivity(intent2);
    }
}

