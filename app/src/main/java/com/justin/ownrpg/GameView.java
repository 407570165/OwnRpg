package com.justin.ownrpg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;

public class GameView extends View {
    float posX;
    float posY;
    public GameView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint =new Paint();
        canvas.drawLine(500,0,0,600,paint);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.dog);
        canvas.drawBitmap(bitmap,posX,posY,paint);
        Log.d("length: ",bitmap.getWidth()+" "+bitmap.getHeight());
    }

    public float getPosX() {
        return posX;
    }

    public float getPosY() {
        return posY;
    }

    public void setPosX(float posX) {
        if (posX>0&&posX<1200)
        this.posX = posX;
    }

    public void setPosY(float posY) {
        if (posY>0&&posY<1500)
        this.posY = posY;
    }
}
