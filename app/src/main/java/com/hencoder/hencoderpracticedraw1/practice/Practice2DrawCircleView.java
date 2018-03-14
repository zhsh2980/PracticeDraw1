package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    public Practice2DrawCircleView(Context context) {
        super(context);
        init();
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    Paint p1;
    Paint p2;

    private void init() {

        p1 = new Paint();
        p1.setColor(Color.BLACK);
        p1.setAntiAlias(true);

        p2 = new Paint();
        p2.setColor(Color.BLUE);
        p1.setAntiAlias(true);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆

        p1.setStyle(Paint.Style.FILL);
        canvas.drawCircle(300, 300, 150, p1);

        p2.setStyle(Paint.Style.FILL);
        canvas.drawCircle(300, 700, 150, p2);

        p1.setStrokeWidth(5f);
        p1.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(700, 300, 150, p1);

        p1.setStyle(Paint.Style.STROKE);
        p1.setStrokeWidth(30);
        canvas.drawCircle(700, 700, 150, p1);


    }
}
