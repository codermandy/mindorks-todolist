package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MyNotesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_notes);

        Intent intent = getIntent();
        intent.getStringExtra("full_name");
        Log.d("MyNotesActivity",intent.getStringExtra("full_name"));
    }
}
