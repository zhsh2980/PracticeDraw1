package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
        init();
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    Paint textPaint;
    Paint rectPaint;

    private void init() {

        textPaint = new Paint();
        rectPaint = new Paint();
        textPaint.setColor(Color.WHITE);
        textPaint.setTextSize(25);

        rectPaint.setColor(Color.GREEN);
        rectPaint.setStyle(Paint.Style.FILL);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        Path path = new Path();

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(3);
        paint.setStyle(Paint.Style.STROKE);
        path.moveTo(100, 50);
        path.lineTo(100, 550);
        path.lineTo(800, 550);
        canvas.drawPath(path, paint);

        canvas.drawText("Froyo", 120, 580, textPaint);
        canvas.drawText("Froyo", 220, 580, textPaint);
        canvas.drawText("Froyo", 320, 580, textPaint);
        canvas.drawText("Froyo", 420, 580, textPaint);
        canvas.drawText("Froyo", 520, 580, textPaint);
        canvas.drawText("Froyo", 620, 580, textPaint);
        canvas.drawText("Froyo", 720, 580, textPaint);

        canvas.drawRect(110,540,190,550,rectPaint);
        canvas.drawRect(210,500,290,550,rectPaint);
        canvas.drawRect(310,500,390,550,rectPaint);
        canvas.drawRect(410,340,490,550,rectPaint);
        canvas.drawRect(510,240,590,550,rectPaint);
        canvas.drawRect(610,140,690,550,rectPaint);
        canvas.drawRect(710,400,790,550,rectPaint);

    }
}
