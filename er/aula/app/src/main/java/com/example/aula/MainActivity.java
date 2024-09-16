package com.example.aula;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    Button button;
    TextView text;
    int numero =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btnClick);
        text = findViewById(R.id.textView);
        text.setText("1");



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Random random = new Random();
                Button b = (Button) view;
                int nInicial=1;
                int nFinal=100;
                int nsorteado=random.nextInt(nFinal-nInicial)+nInicial;
                text.setText(String.valueOf(nsorteado));
            }
        });
    }
}