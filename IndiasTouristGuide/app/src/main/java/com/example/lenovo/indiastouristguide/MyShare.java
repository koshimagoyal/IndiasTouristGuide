package com.example.lenovo.indiastouristguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyShare extends AppCompatActivity {

    public Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_share);
        btn1=(Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                forward();
            }

        });

    }

    private void forward()
    {
        Intent my = new Intent(this,MyLogin.class);
        startActivity(my);
    }
}
