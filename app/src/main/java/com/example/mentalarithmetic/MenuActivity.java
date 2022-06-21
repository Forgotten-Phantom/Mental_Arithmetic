package com.example.mentalarithmetic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    Fragment fragment = null;
    SeekBar numbersBar;
    SeekBar timerBar;
    Switch plus;
    Switch minus;
    Switch multiply;
    Switch divide;
    EditText numberOfActions;
    TextView numbersTo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numbersBar = findViewById(R.id.countOfNumbers);
        timerBar = findViewById(R.id.timerBar);
        numberOfActions = findViewById(R.id.numberOfActions);
        numbersTo = findViewById(R.id.textNumbersTo);
        plus = findViewById(R.id.plusSwitch);
        minus = findViewById(R.id.minusSwitch);
        multiply = findViewById(R.id.multiplySwitch);
        divide = findViewById(R.id.divideSwitch);


    }

    public void change(View view) {
        switch (view.getId()) {
            case R.id.playButton:

                break;

            case R.id.settingsButton:
                fragment = new SettingsFragment();
                break;

            case R.id.backButton:
                fragment = new MenuFragment();
                break;
        }

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentPlace, fragment);
        fragmentTransaction.commit();
    }
}