package com.example.todo_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    TextView textView=findViewById(R.id.textView);
    String textToBeDisplayed= AddTodo.enteredText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView.setText(textToBeDisplayed);

        


    }

    public void openNewActivity(View view) {
        Intent intent = new Intent(this, AddTodo.class);
        startActivity(intent);
    }
}
