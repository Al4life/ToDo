package com.example.todo_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class AddTodo extends AppCompatActivity {
    private EditText editDesc;
    String display="ToDo Added!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_todo);

       // editTitle = findViewById(R.id.editText);
        editDesc = findViewById(R.id.editDesc);

        Button add = findViewById(R.id.createTodo);

        Button delFirst=findViewById(R.id.button);
        Button delSecond=findViewById(R.id.button2);
        Button delThird=findViewById(R.id.button3);


        delFirst.setBackgroundColor(getResources().getColor(R.color.red));
        delSecond.setBackgroundColor(getResources().getColor(R.color.red));
        delThird.setBackgroundColor(getResources().getColor(R.color.red));;





        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String enteredDesc = editDesc.getText().toString();
                Intent resultIntent = new Intent();
                resultIntent.putExtra("description", enteredDesc);
                setResult(RESULT_OK, resultIntent);
                finish();
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(AddTodo.this, display, duration);
                toast.show();

            }
        });

        delFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String enteredDesc = "deleteFirst";
                Intent resultIntent = new Intent();
                resultIntent.putExtra("description", enteredDesc);
                setResult(RESULT_OK, resultIntent);
                finish();
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(AddTodo.this, "First ToDo Deleted!", duration);
                toast.show();

            }
        });
        delSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String enteredDesc = "deleteSecond";
                Intent resultIntent = new Intent();
                resultIntent.putExtra("description", enteredDesc);
                setResult(RESULT_OK, resultIntent);
                finish();
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(AddTodo.this, "Second ToDo Deleted!", duration);
                toast.show();

            }
        });
        delThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String enteredDesc = "deleteThird";
                Intent resultIntent = new Intent();
                resultIntent.putExtra("description", enteredDesc);
                setResult(RESULT_OK, resultIntent);
                finish();
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(AddTodo.this, "Last ToDo Deleted!", duration);
                toast.show();

            }
        });




    }

    public void returnBack(View view) {
        finish();
    }
}
