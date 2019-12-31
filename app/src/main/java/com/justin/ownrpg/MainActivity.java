package com.justin.ownrpg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView bRight;
    private ImageView bLeft;
    private ImageView bUp;
    private ImageView bDown;
    private GameView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
        /*bRight = findViewById(R.id.arrow_right);
        bLeft = findViewById(R.id.arrow_left);
        bUp = findViewById(R.id.arrow_up);
        bDown = findViewById(R.id.arrow_down);*/
        gameView = findViewById(R.id.game);
    }
    public void findView(){
        findViewById(R.id.arrow_down).setOnClickListener(this);
        findViewById(R.id.arrow_right).setOnClickListener(this);
        findViewById(R.id.arrow_up).setOnClickListener(this);
        findViewById(R.id.arrow_left).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case (R.id.arrow_left):
                Log.d("MainActivity","onClick: LEFT");
                gameView.setPosX(gameView.getPosX()-50);
                gameView.invalidate();
                break;
            case (R.id.arrow_right):
                Log.d("MainActivity","onClick: RIGHT");
                gameView.setPosX(gameView.getPosX()+50);
                gameView.invalidate();
                break;
            case (R.id.arrow_down):
                Log.d("MainActivity","onClick: DOWN");
                gameView.setPosY(gameView.getPosY()+50);
                gameView.invalidate();
                break;
            case (R.id.arrow_up):
                Log.d("MainActivity","onClick: UP");
                gameView.setPosY(gameView.getPosY()-50);
                gameView.invalidate();
                break;
        }
    }
}
