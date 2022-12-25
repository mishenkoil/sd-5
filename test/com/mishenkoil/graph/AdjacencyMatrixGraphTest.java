package com.mishenkoil.graph;

import com.mishenkoil.drawing.DrawingApi;

public class AdjacencyMatrixGraphTest extends AGraphTest {
    @Override
    protected Graph initGraph(DrawingApi drawingApi) {
        return new AdjacencyMatrixGraph(drawingApi);
    }
}
