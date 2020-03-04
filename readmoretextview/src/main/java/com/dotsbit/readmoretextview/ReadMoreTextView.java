package com.dotsbit.readmoretextview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ReadMoreTextView
        extends FrameLayout
{
    private Context mContext;


    //*******************************************************
    public ReadMoreTextView(@NonNull Context context)
    //*******************************************************
    {
        super(context);
        init(context, null);
    }

    //*******************************************************
    public ReadMoreTextView(@NonNull Context context, @Nullable AttributeSet attrs)
    //*******************************************************
    {
        super(context, attrs);
        init(context, attrs);

    }

    //*******************************************************
    public ReadMoreTextView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr)
    //*******************************************************

    {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    //*******************************************************
    public ReadMoreTextView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes)
    //*******************************************************
    {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context, attrs);
    }


    //*******************************************************
    public void init(Context context, AttributeSet attributeSet)
    //*******************************************************
    {
        inflate(context, R.layout.textview_layout, this);
        mContext = context;
        initControl();
    }

    private void initControl()
    {

    }

    public void setTex(String text)
    {
        TextView textView = findViewById(R.id.text);
        textView.setText(text);
    }
}
