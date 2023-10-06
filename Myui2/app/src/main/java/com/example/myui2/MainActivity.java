package com.example.myui2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstedittext;
    EditText secondedittext;
    TextView resulttextview;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          firstedittext = findViewById(R.id.firstedittext);
          secondedittext = findViewById(R.id.secondedittext);
          resulttextview = findViewById(R.id.resulttextview);
          button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstInt = Integer.parseInt(firstedittext.getText().toString());
                int secondInt = Integer.parseInt(secondedittext.getText().toString());
                int result = firstInt + secondInt;
                resulttextview.setText(result+" ");
            }
        });
    }
}