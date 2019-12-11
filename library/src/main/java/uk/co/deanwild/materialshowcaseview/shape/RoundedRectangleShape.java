package uk.co.deanwild.materialshowcaseview.shape;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.shapes.RoundRectShape;

import uk.co.deanwild.materialshowcaseview.target.Target;

public class RoundedRectangleShape implements Shape {
    private boolean setFullWidth = false;

    private int width = 0;
    private int height = 0;
    private boolean adjustToTarget = false;

    private RoundRectShape roundRect;
    private int padding;

    @Override
    public void draw(Canvas canvas, Paint paint, int x, int y) {

    }



    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void updateTarget(Target target) {
        if (adjustToTarget) {
//            roundRect bounds = target.getBounds();
//            height = bounds.height();
//            if ()
        }
    }

    @Override
    public int getTotalRadius() {
        return (height / 2) + padding;
    }

    @Override
    public void setPadding(int padding) {
        this.padding = padding;
    }

    @Override
    public void drawX(Canvas mCanvas, Paint outerCirclePaint, int mXPosition, int mYPosition) {

    }
}
