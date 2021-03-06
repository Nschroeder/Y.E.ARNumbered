package com.example.nschroeder.yearnumbered;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by nschroeder on 10/10/2016.
 */

public class PauseMenu extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pause);
    }

    public void resumeGame (android.view.View view){
        onBackPressed();
    }

    public void shopScreen (android.view.View view){
        Intent intent1 = new Intent(this, ShopScreen.class);
        intent1.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(intent1);
    }
    public void mainMenu (android.view.View view){
        Intent intent2 = new Intent(this, MainActivity.class);
        intent2.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(intent2);
    }
}
