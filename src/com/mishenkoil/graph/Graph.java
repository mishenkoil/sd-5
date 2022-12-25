package com.mishenkoil.graph;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.mishenkoil.drawing.DrawingApi;
import com.mishenkoil.drawing.figures.Point;

public abstract class Graph {
    /**
     * Bridge to drawing api
     */
    protected final DrawingApi drawingApi;

    public Graph(DrawingApi drawingApi) {
        this.drawingApi = drawingApi;
    }

    public abstract void addEdge(int from, int to);

    public abstract void drawGraph();

    protected Map<Integer, Point> calculatePoints(Set<Integer> vertices, Point center, int radius) {
        Map<Integer, Point> points = new HashMap<>();
        int i = 0;
        for (Integer vertex : vertices) {
            double angle = 2 * Math.PI * i / vertices.size();
            Point v = new Point(
                    (int)(center.x() + radius * Math.sin(angle)),
                    (int)(center.y() - radius * Math.cos(angle))
            );
            points.put(vertex, v);
            i++;
        }
        return points;
    }
}
