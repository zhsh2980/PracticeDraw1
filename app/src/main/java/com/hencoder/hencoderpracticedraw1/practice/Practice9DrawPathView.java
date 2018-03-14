package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        Path path = new Path();
//        练习内容：使用 canvas.drawPath() 方法画心形

        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);

        path.moveTo(300, 380);
        path.arcTo(200, 200, 300, 300, -225, 225, false);

        //forceMoveTo 很关键, true 意味着断笔,图形不会封闭
        path.arcTo(300, 200, 400, 300, -180, 225, false);
        canvas.drawPath(path, paint);
    }
}
