package com.example.nschroeder.yearnumbered;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by nschroeder on 10/10/2016.
 */

public class PauseMenu extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pause);
    }

    Button quit = (Button) findViewById(R.id.home);
    public View.OnClickListener getQuit_listener() {
        return quit_listener;
    }

    Button shop = (Button) findViewById(R.id.shop);
    public View.OnClickListener getShop_listener() {
        return shop_listener;
    }

    Button resume = (Button) findViewById(R.id.);
    public View.OnClickListener getResume_listener() {
        return resume_listener;
    }

    protected View.OnClickListener shop_listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
    protected View.OnClickListener quit_listener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {

        }
    };
    protected View.OnClickListener resume_listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
}
