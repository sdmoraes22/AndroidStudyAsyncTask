package com.example.exerciciosasynctask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btn_iniciar);
        textView = findViewById(R.id.txt_counter);
    }

    public void iniciar(View view) {
        CounterTask task = new CounterTask(button, textView);

        task.execute(10);


    }
}
