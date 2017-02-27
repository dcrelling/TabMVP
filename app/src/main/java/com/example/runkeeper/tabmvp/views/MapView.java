package com.example.runkeeper.tabmvp.views;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.runkeeper.tabmvp.R;
import com.example.runkeeper.tabmvp.ShareContract;

/**
 * Created by davidcrelling on 2/24/17.
 */

public class MapView extends RelativeLayout implements ShareContract.MapView
{
    private View rootView;
    private ShareContract.MapPresenter presenter;
    private Context context;

    public MapView(Context context)
    {
        super(context);
        this.context = context;
        init();
    }

    private void init()
    {
        rootView = inflate(context, R.layout.fragment_main_two, this);
    }

    @Override
    public void setPresenter(ShareContract.BaseSharePresenter presenter)
    {
        this.presenter = (ShareContract.MapPresenter) presenter;
    }

    @Override
    public View getRootView()
    {
        return rootView;
    }
}
