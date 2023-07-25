package com.cs.csnotes;

import android.content.ClipData;
import android.content.Intent;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    Button Notes, Assignments, Resources, syllabus;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        syllabus = findViewById(R.id.syllabus);
        Notes = (Button) findViewById(R.id.Notes);
        Assignments = (Button) findViewById(R.id.Assignments);
        Resources = (Button) findViewById(R.id.Resources);

        syllabus.setOnClickListener(v -> {


            Intent intent = new Intent(MainActivity.this, syllabus.class);
            startActivity(intent);

        });


        Assignments.setOnClickListener(v -> {


            Intent intent = new Intent(MainActivity.this, AssignmentActivity.class);
            startActivity(intent);

        });

        Resources.setOnClickListener(v -> {


            Intent intent = new Intent(MainActivity.this, ResourcesActivity.class);
            startActivity(intent);

        });

        Notes.setOnClickListener(v -> {


            Intent intent = new Intent(MainActivity.this, NotesActivity.class);
            startActivity(intent);

        });
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.resources, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_settings:
            Intent intent = new Intent(MainActivity.this, settings.class);
            startActivity(intent);
            return true;

            case R.id.about:
                Intent intent1 = new Intent(MainActivity.this, about.class);
                startActivity(intent1);
                return true;

        }
        super.onOptionsItemSelected(item);
        return true;
    }


}









