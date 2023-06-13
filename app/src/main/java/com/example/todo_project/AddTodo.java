package com.example.todo_project;

import android.os.Bundle;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class AddTodo extends AppCompatActivity {

    public static String enteredText = "";


    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.add_todo);

            //Set an onClick Listener for Create Todo button
            Button add= findViewById(R.id.createTodo);

            EditText editText=(EditText)findViewById(R.id.editText);

            add.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    enteredText= String.valueOf(editText);

                }

            });

        }

}
