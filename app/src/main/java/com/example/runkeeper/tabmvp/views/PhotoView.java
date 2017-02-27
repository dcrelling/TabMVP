package com.example.runkeeper.tabmvp.views;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.runkeeper.tabmvp.R;
import com.example.runkeeper.tabmvp.ShareContract;

/**
 * Created by davidcrelling on 2/24/17.
 */

public class PhotoView extends RelativeLayout implements ShareContract.PhotoView
{
    private View rootView;
    private ShareContract.PhotoPresenter presenter;
    private Context context;

    public PhotoView(Context context)
    {
        super(context);
        this.context = context;
        init();
    }

    public void init()
    {
        rootView = inflate(context, R.layout.fragment_main_one, this);
    }

    @Override
    public void setPresenter(ShareContract.BaseSharePresenter presenter)
    {
        this.presenter = (ShareContract.PhotoPresenter) presenter;
    }

    @Override
    public View getRootView()
    {
        return rootView;
    }
}
