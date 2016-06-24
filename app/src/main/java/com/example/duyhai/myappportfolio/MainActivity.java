package com.example.duyhai.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchApp(View v) {
        Button pressBtn = (Button) v;
        Toast.makeText(getApplicationContext(), "This button will launch my " + pressBtn.getText().toString() + " app!", Toast.LENGTH_SHORT).show();
    }
}
