package com.example.indent;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent j=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=5oH9Nr3bKfw"));
        startActivity(j);
    }
}
