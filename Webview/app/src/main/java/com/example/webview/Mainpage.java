package com.example.webview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Mainpage extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);

        Button btn1 = findViewById(R.id.button);
        Button btn2 = findViewById(R.id.button2);

    btn1.setOnClickListener(new View.OnClickListener() {
        @Override

        public void onClick(View v) {

            Intent inten1 = new Intent ( Mainpage.this, MainActivity.class);
        startActivity(inten1);
    }

    });

    btn2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent inten2 = new Intent ( Mainpage.this, Dublinsystem.class);
            startActivity(inten2);



    }

    });

}

}






