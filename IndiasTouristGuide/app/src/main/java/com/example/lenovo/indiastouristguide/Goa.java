package com.example.lenovo.indiastouristguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class Goa extends AppCompatActivity {

    public View north,south;
    public ProgressBar pb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goa);
        north=(View)findViewById(R.id.north);
        south=(View)findViewById(R.id.south);
        pb= (ProgressBar) findViewById(R.id.pb);
        north.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forwardNorth();
            }

        });

        south.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                forwardSouth();
            }

        });
    }
    public void forwardNorth(){

        pb.setVisibility(View.VISIBLE);
        Intent my = new Intent(this,North.class);
        startActivity(my);
    }

    public void forwardSouth(){
        pb.setVisibility(View.VISIBLE);
        Intent my = new Intent(this,South.class);
        startActivity(my);
    }
}
