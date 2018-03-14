package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);

        paint.setColor(Color.RED);
        canvas.drawArc(50,10,350,310,-180,135,true,paint);
        paint.setColor(Color.YELLOW);
        canvas.drawArc(60,20,360,320,-45,45,true,paint);
        paint.setColor(Color.BLACK);
        canvas.drawArc(60,20,360,320,15,25,true,paint);
        paint.setColor(Color.GRAY);
        canvas.drawArc(60,20,360,320,45,25,true,paint);
        paint.setColor(Color.GREEN);
        canvas.drawArc(60,20,360,320,75,35,true,paint);
        paint.setColor(Color.BLUE);
        canvas.drawArc(60,20,360,320,145,60,true,paint);
    }
}
