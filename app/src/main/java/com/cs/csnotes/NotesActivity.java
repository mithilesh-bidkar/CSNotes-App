package com.cs.csnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import com.cs.csnotes.R.layout;

public class NotesActivity extends AppCompatActivity {
    Button firstunit, secondunit, thirdunit, fourthunit,fifthunit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);
        firstunit=(Button) findViewById(R.id.firstunit);
        secondunit=(Button) findViewById(R.id.secondunit);
        thirdunit=(Button) findViewById(R.id.thirdunit);
        fourthunit=(Button) findViewById(R.id.fourthunit);
        fifthunit=(Button) findViewById(R.id.fifthunit);

        firstunit.setOnClickListener(v -> {


            Intent intent =new Intent(NotesActivity.this,firstunitActivity.class);
            startActivity(intent);

        });

        secondunit.setOnClickListener(v -> {


            Intent intent =new Intent(NotesActivity.this,secondunitActivity.class);
            startActivity(intent);

        });

        thirdunit.setOnClickListener(v -> {


            Intent intent =new Intent(NotesActivity.this,thirdunitActivity.class);
            startActivity(intent);

        });

        fourthunit.setOnClickListener(v -> {


            Intent intent =new Intent(NotesActivity.this,fourthunitActivity.class);
            startActivity(intent);

        });

        fifthunit.setOnClickListener(v -> {


            Intent intent =new Intent(NotesActivity.this,fifthunitActivity.class);
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
