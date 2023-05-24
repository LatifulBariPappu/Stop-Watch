package com.example.stopwatch;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Chronometer chronometer;
    private long PauseOffSet = 0;
    private boolean isPlaying = false;
    private ToggleButton toggleButton;
    private Button reset_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
