package com.vi.indicatorlib;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;

/**
 * Created by nguyenvanlinh
 * Date: 1/5/18.
 * BSV Android Dev
 */

public class Dot {
    private Paint paint;

    private PointF center;

    private int currentRadius;

    public Dot() {
        this.paint = new Paint();
        paint.setAntiAlias(true);
        center = new PointF();
    }

    public void setColor(int color){
        paint.setColor(color);
    }

    public void setAlpha (int alpha) {
        paint.setAlpha(alpha);
    }

    public int getCurrentRadius() {
        return currentRadius;
    }

    public void setCurrentRadius(int radius) {
        this.currentRadius = radius;
    }

    public void setCenter(float x, float y) {
        center.set(x, y);
    }

    public void draw(Canvas canvas) {
        canvas.drawCircle(center.x, center.y, currentRadius, paint);
    }
}
