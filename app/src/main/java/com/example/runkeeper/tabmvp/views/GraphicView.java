package com.example.runkeeper.tabmvp.views;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.runkeeper.tabmvp.R;
import com.example.runkeeper.tabmvp.ShareContract;

/**
 * Created by davidcrelling on 2/24/17.
 */

public class GraphicView extends RelativeLayout implements ShareContract.GraphicView
{

    private View rootView;
    private ShareContract.GraphicPresenter presenter;
    private Context applicationContext;

    public GraphicView(Context context)
    {
        super(context);
        this.applicationContext = context.getApplicationContext();
        init(context);
    }

    private void init(Context activityContext)
    {
        rootView = inflate(activityContext, R.layout.fragment_main_three, this);
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
