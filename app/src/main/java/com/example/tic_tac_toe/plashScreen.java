package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class plashScreen extends AppCompatActivity {
TextView textshow;
ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plash_screen);
        showView();
        Animation translate = AnimationUtils.loadAnimation(this,R.anim.translat);
        textshow.startAnimation(translate);
        Animation scale = AnimationUtils.loadAnimation(this,R.anim.scale);
        image.startAnimation(scale);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(plashScreen.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },4000);
    }
    public void showView(){
        textshow=findViewById(R.id.textShow);
        image=findViewById(R.id.image);
    }
}
