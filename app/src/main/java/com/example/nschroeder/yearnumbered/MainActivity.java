package com.example.nschroeder.yearnumbered;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;

/**
 * Created by nschroeder on 10/12/2016.
 */

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startGame(android.view.View view){
        Intent intent = new Intent(this, GameScreen.class);
        startActivity(intent);
    }
}