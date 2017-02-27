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
    private Context applicationContext;

    public PhotoView(Context context)
    {
        super(context);
        this.applicationContext = context.getApplicationContext();
        init(context);
    }

    public void init(Context activityContext)
    {
        rootView = inflate(activityContext, R.layout.fragment_main_one, this);
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
