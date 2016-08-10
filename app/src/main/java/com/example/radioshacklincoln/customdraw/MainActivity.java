package com.example.radioshacklincoln.customdraw;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v4.widget.SlidingPaneLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public class CustomDraw extends View{

        public Paint paint = new Paint();

        float pX = getWidth()/2;
        float pY = getHeight()/2;



        public CustomDraw(Context context, AttributeSet attrs) {
            super(context, attrs);

            /*TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.CustomDraw, 0, 0);
            try {
                pX = a.getFloat(R.styleable.CustomDraw_pX, 0);
                pY = a.getFloat(R.styleable.CustomDraw_pY, 0);

            } finally {
                a.recycle();
            }*/
        }


        @Override
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);


            paint.setAntiAlias(true);

            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.GREEN);

            canvas.drawRect(0, 0, 200, 300, paint);
            canvas.drawRect(56, 40, 200, 300, paint);


            Log.d("Valor: ", String.valueOf(Float.valueOf(+pX)));
        }
    }
}
