package com.example.lenovo.indiastouristguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyRate extends AppCompatActivity {

    public Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_rate);
      btn=(Button) findViewById(R.id.btn);
              btn.setOnClickListener(new View.OnClickListener() {
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
