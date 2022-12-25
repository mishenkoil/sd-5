package com.mishenkoil.drawing;

import java.util.List;

import com.mishenkoil.drawing.figures.Circle;
import com.mishenkoil.drawing.figures.Line;
import com.mishenkoil.drawing.figures.Point;

/**
 * Interface for drawing implementations.
 * Note that all implementations are singleton,
 * so you can  draw only one picture at time.
 */
public interface DrawingApi {

    void resetDrawing();

    void setDrawingAreaSize(int width, int height);
    int getDrawingAreaWidth();
    int getDrawingAreaHeight();

    void drawCircle(Point center, int radius);
    void drawLine(Point from, Point to);

    List<Circle> getCircles();
    List<Line> getLines();

    String getTitle();
    void setTitle(String title);

    void showDrawing();
}
