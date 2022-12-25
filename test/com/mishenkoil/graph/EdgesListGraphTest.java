package com.mishenkoil.graph;

import com.mishenkoil.drawing.DrawingApi;

public class EdgesListGraphTest extends AGraphTest {
    @Override
    protected Graph initGraph(DrawingApi drawingApi) {
        return new EdgesListGraph(drawingApi);
    }
}
