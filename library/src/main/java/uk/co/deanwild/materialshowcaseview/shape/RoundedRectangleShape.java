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
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public void updateTarget(Target target) {

    }

    @Override
    public int getTotalRadius() {
        return 0;
    }

    @Override
    public void setPadding(int padding) {

    }
}
