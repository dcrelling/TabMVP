package com.example.runkeeper.tabmvp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

/**
 * Created by davidcrelling on 2/24/17.
 */

public class PhotoView extends RelativeLayout implements ShareContract.PhotoView
{
    private View rootView;
    private ShareContract.PhotoPresenter presenter;

    public PhotoView(Context context)
    {
        super(context);
        init();
    }

    public void init()
    {
        rootView = inflate(getContext(), R.layout.fragment_main_one, this);
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
