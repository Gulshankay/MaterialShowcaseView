package uk.co.deanwild.materialshowcaseview.shape;


import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;

import uk.co.deanwild.materialshowcaseview.MaterialShowcaseView;
import uk.co.deanwild.materialshowcaseview.target.Target;

public class RectangleShape implements Shape {

    private boolean fullWidth = true;

    private float width = 0;
    private float height = 0;
    private boolean adjustToTarget = true;

    private Rect rect;
    private RectF rectF;
    private int padding = 30;

    public RectangleShape(int width, int height) {
        this.width = width;
        this.height = height;
        init();
    }

    public RectangleShape(Rect bounds) {
        this(bounds, false);
    }

    public RectangleShape(Rect bounds, boolean fullWidth) {
        this.fullWidth = fullWidth;
        height = bounds.height();
        if (fullWidth)
            width = Integer.MAX_VALUE;
        else width = bounds.width();
        init();
    }

    public boolean isAdjustToTarget() {
        return adjustToTarget;
    }

    public void setAdjustToTarget(boolean adjustToTarget) {
        this.adjustToTarget = adjustToTarget;
    }

    private void init() {
        rect = new Rect((int)-width / 2, (int)-height / 2, (int)width / 2, (int)height / 2);
        rectF = new RectF(rect);
    }

    @Override
    public void draw(Canvas canvas, Paint paint, int x, int y) {

        float a = rect.left + x - padding;
        float b = rect.top + y - padding;
        float c = rect.right + x + padding;
        float d = rect.bottom + y + padding;
        Rect rectX = new Rect(rect.left + x - padding, rect.top + y - padding, rect.right + x + padding,rect.bottom + y + padding);
        RectF rectFX = new RectF(rectX);
        if (!rect.isEmpty()) {
            canvas.drawRoundRect(
                    rectFX,
                    1,
                    1,
                    paint
            );
        }
    }

    @Override
    public void updateTarget(Target target) {
        if (adjustToTarget) {
            Rect bounds = target.getBounds();
            height = bounds.height();
            if (fullWidth)
                width = Integer.MAX_VALUE;
            else width = bounds.width();
            init();
        }
    }

    @Override
    public int getTotalRadius() {
        return (int)(height / 2) + padding;
    }

    @Override
    public void setPadding(int padding) {
        this.padding = padding;
    }

    @Override
    public void drawX(Canvas mCanvas, Paint outerCirclePaint, int mXPosition, int mYPosition) {
        if (!rect.isEmpty()) {
            mCanvas.drawRect(
                    rect.left + mXPosition,
                    rect.top + mYPosition,
                    rect.right + mXPosition,
                    rect.bottom + mYPosition,
                    outerCirclePaint
            );
        }
    }

    @Override
    public int getWidth() {
        return (int)width;
    }

    @Override
    public int getHeight() {
        return (int)height;
    }
}