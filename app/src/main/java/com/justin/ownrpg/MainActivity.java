package com.justin.ownrpg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView bRight;
    private ImageView bLeft;
    private ImageView bUp;
    private ImageView bDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bRight = findViewById(R.id.arrow_right);
        bLeft = findViewById(R.id.arrow_left);
        bUp = findViewById(R.id.arrow_up);
        bDown = findViewById(R.id.arrow_down);
    }
    public void findView(){
        bRight.setOnClickListener(this);
        bLeft.setOnClickListener(this);
        bUp.setOnClickListener(this);
        bDown.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
