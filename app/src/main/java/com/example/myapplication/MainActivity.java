package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.lang.annotation.Annotation;

public class MainActivity extends AppCompatActivity {

    ImageView Logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Logo = (ImageView)findViewById(R.id.logo);
        // THIS FOR THE ANIMATION
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anmation);
        Logo.setAnimation(animation);

        final Intent intent = new Intent(this,HomeActivity.class);
        Thread thread = new Thread(){
            @Override
            public void run() {

                try{

                    sleep(5000);
                }catch (InterruptedException e){

                    e.printStackTrace();
                }
                startActivity(intent);
            }
        };

        thread.start();
    }
}
