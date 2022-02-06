package com.example.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textVW;
    private Button but;
    private EditText editText;

    private CheckBox cheek;
    private ToggleButton tuButton;
    private LinearLayout linearLayout;
    private Button butttonactivitiTwo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.liren_layout);
        butttonactivitiTwo= findViewById(R.id.buttton_activitiTwo);
        linearLayout = findViewById(R.id.linear);
        textVW = findViewById(R.id.textVW);
        but = findViewById(R.id.but);
        editText = findViewById(R.id.editeon_text);
        cheek = findViewById(R.id.cheek);
        tuButton = findViewById(R.id.tuButton);


        but.setOnClickListener(this);
        butttonactivitiTwo.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.but:
                editText.setText("Поздравляю");
                break;
            case R.id.buttton_activitiTwo:  // переключение на следующий лайаут
                setContentView(R.layout.phone);
                break;
        }
    }
}
