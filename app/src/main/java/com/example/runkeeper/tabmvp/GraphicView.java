package com.example.runkeeper.tabmvp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

/**
 * Created by davidcrelling on 2/24/17.
 */

public class GraphicView extends RelativeLayout implements ShareContract.GraphicView
{

    private View rootView;
    private ShareContract.GraphicPresenter presenter;

    public GraphicView(Context context)
    {
        super(context);
        init();
    }

    public GraphicView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init();
    }

    public GraphicView(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init()
    {
        rootView = inflate(getContext(), R.layout.fragment_main_three, this);
    }

    @Override
    public void setPresenter(ShareContract.BaseSharePresenter presenter)
    {
        this.presenter = (ShareContract.GraphicPresenter) presenter;
    }

    @Override
    public View getRootView()
    {
        return rootView;
    }
}
