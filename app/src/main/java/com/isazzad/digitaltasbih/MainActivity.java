package com.isazzad.digitaltasbih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton add , reset  , sub , about ;
    TextView display ;
    int count = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = findViewById(R.id.addButton);
        reset = findViewById(R.id.reset);
        sub = findViewById(R.id.sub);
        display = findViewById(R.id.display);
        about = findViewById(R.id.about);

        //===========================================================
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                display.setText(""+count);

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                display.setText(""+count);

            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                display.setText(""+count);
                Toast.makeText(MainActivity.this,"Count reset done !",Toast.LENGTH_LONG).show();
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              //  Intent myabout = new Intent(MainActivity.this ,About.class);
              //  startActivity(myabout);

                Toast.makeText(MainActivity.this , "Developed by \n Sazzadul Islam", Toast.LENGTH_LONG).show();
            }
        });


    }
}