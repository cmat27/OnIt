package com.example.cmat.onit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class welcomeAct extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        imageView = (ImageView)findViewById(R.id.imageView);

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation);

        imageView.setAnimation(animation);


        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
//when animation ends it will kick in the main page "main activity
                finish();
                startActivity(new Intent(getApplicationContext(),MainActivity.class));

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });




    }
}
