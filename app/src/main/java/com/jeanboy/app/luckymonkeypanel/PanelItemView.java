package com.jeanboy.app.luckymonkeypanel;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/**
 * Created by jeanboy on 2017/4/20.
 */

public class PanelItemView extends FrameLayout {

    private View overlay;

    public PanelItemView(Context context) {
        this(context, null);
    }

    public PanelItemView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PanelItemView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        inflate(context, R.layout.view_panel_item, this);
        overlay = findViewById(R.id.overlay);
    }

    public void setFocus(boolean isFocused) {
        if (overlay != null) {
            overlay.setVisibility(isFocused ? INVISIBLE : VISIBLE);
        }
    }

}
