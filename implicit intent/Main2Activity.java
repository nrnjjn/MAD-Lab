package com.example.indent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class Main2Activity extends AppCompatActivity {
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button second=findViewById(R.id.button2);
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(intent);
            }
        });
    }
}
