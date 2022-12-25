package com.mishenkoil.drawing.awt;

import com.mishenkoil.drawing.ADrawingApiTest;
import com.mishenkoil.drawing.DrawingApi;

public class AwtDrawingApiTest extends ADrawingApiTest {
    @Override
    protected DrawingApi initApi() {
        return new AwtDrawingApi();
    }
}
