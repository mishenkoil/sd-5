package com.mishenkoil.drawing.fx;

import com.mishenkoil.drawing.ADrawingApiTest;
import com.mishenkoil.drawing.DrawingApi;

public class FxDrawingApiTest extends ADrawingApiTest {
    @Override
    protected DrawingApi initApi() {
        return new FxDrawingApi();
    }
}
