package com.example.runkeeper.tabmvp;


import android.view.View;

public interface ShareContract
{
    interface Controller
    {

    }

    interface TabPresenter
    {
        View getViewByTabPosition(int position);
    }

    interface PhotoPresenter extends BaseSharePresenter
    {

    }

    interface MapPresenter extends BaseSharePresenter
    {

    }

    interface GraphicPresenter extends BaseSharePresenter
    {

    }

    interface PhotoView extends BaseShareView
    {

    }

    interface MapView extends BaseShareView
    {

    }

    interface GraphicView extends BaseShareView
    {

    }

    interface TabViewContainer extends BaseShareView
    {
        void setUpViewPagerAndAdaptor();

    }

    interface BaseShareView
    {
        void setPresenter(ShareContract.BaseSharePresenter presenter);

        View getRootView();
    }

    interface BaseSharePresenter
    {

    }

}
