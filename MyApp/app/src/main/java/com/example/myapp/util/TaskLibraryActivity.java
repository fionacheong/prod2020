package com.example.myapp.util;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class TaskLibraryActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    FloatingActionButton addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_library);

        recyclerView = findViewById(R.id.recyclerView);
        addButton = findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TaskLibraryActivity.this, LibraryAddActivity.class);
                startActivity(intent);
            }
        });

    }
}