package com.example.todo_project;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;

import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_CODE_ADD_TODO = 1;
    private TextView titleTextView;
    private TextView descTextView;
    private TextView descTextView2;
    private TextView descTextView1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        descTextView = findViewById(R.id.textView);
        descTextView1 = findViewById(R.id.textView2);
        descTextView2 = findViewById(R.id.textView3);



        descTextView.setTextSize(20);
        descTextView.setTextColor(Color.BLACK);
        descTextView.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));


        descTextView1.setTextSize(20);
        descTextView1.setTextColor(Color.BLACK);
        descTextView1.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));

        descTextView2.setTextSize(20);
        descTextView2.setTextColor(Color.BLACK);
        descTextView2.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));


    }

    public void openNewActivity(View view) {
        Intent intent = new Intent(this, AddTodo.class);
        startActivityForResult(intent, REQUEST_CODE_ADD_TODO);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_ADD_TODO && resultCode == RESULT_OK) {
            String description = data.getStringExtra("description");
            if (description.equals("deleteFirst")){
                descTextView.setText("");

            } else if (description.equals("deleteSecond")){
                descTextView1.setText("");

            } else if (description.equals("deleteThird")){
                descTextView2.setText("");

            }else{

            if (descTextView.getText().toString().isEmpty()) {
                descTextView.setText(description);
            } else if (descTextView1.getText().toString().isEmpty()) {
                descTextView1.setText(description);
            } else if (descTextView2.getText().toString().isEmpty()) {
                descTextView2.setText(description);
            } else {
                CharSequence text = "My Limit's exceeded, bruh!!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(this /* MyActivity */, text, duration);
                toast.show();
            }
        }}
    }

}
