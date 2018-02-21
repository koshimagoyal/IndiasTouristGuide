package com.example.lenovo.indiastouristguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView tv;
    private ProgressBar p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView) findViewById(R.id.texthello);
        p=(ProgressBar) findViewById(R.id.prog);
        Animation myanim= AnimationUtils.loadAnimation(this,R.anim.splash_anim);
        tv.startAnimation(myanim);
        p.startAnimation(myanim);
        final Intent my = new Intent(this,Tourist.class);
        Thread timer = new Thread(){
            public  void run()
            {
                try {
                    sleep(5000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally {
                    startActivity(my);
                    finish();
                }
            }
        };
        timer.start();
    }
}
