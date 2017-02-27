package com.example.runkeeper.tabmvp.views;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.runkeeper.tabmvp.R;
import com.example.runkeeper.tabmvp.ShareContract;

/**
 * Created by davidcrelling on 2/24/17.
 */

public class GraphicView extends CoordinatorLayout implements ShareContract.GraphicView
{

    private View rootView;
    private ShareContract.GraphicPresenter presenter;
    private Context context;

    public GraphicView(Context context)
    {
        super(context);
        this.context = context;
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
