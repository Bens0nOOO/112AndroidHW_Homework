package com.example.count0321;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void button2_Click(View view){
        int counter;
        TextView value = (TextView) findViewById(R.id.textView);
        counter = Integer.parseInt(value.getText().toString());
        counter++;
        value.setText(Integer.toString(counter));
    }

    public void button4_Click(View view){
        TextView value = (TextView) findViewById(R.id.textView);
        value.setText(R.string.initial_value);
    }

    public void btn3_Click(View view){
        int counter;
        TextView value = (TextView) findViewById(R.id.textView);
        counter = Integer.parseInt(value.getText().toString());

        if (counter>0){

            counter--;
            value.setText(Integer.toString(counter));
        }
    }
}