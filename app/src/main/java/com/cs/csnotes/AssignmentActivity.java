package com.cs.csnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;

public class AssignmentActivity extends AppCompatActivity {
    Button assignment1,assignment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment);
        assignment1=(Button) findViewById(R.id.assignment1);
        assignment2=(Button) findViewById(R.id.assignment2);


        assignment1.setOnClickListener(v -> {


            Intent intent =new Intent(AssignmentActivity.this,Assignment1.class);
            startActivity(intent);

        });

        assignment2.setOnClickListener(v -> {


            Intent intent =new Intent(AssignmentActivity.this,Assignment2.class);
            startActivity(intent);

        });


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.resources, menu);
        return true;
    }
}