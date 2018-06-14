package com.kylegnally.draganddraw;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class BoxDrawingView extends View {

    // used when creating the View in code
    public BoxDrawingView(Context context){
        this(context, null);
    }

    // used when inflating the View from XML
    public BoxDrawingView(Context context, AttributeSet attrs){
        super(context, attrs);
    }
}
