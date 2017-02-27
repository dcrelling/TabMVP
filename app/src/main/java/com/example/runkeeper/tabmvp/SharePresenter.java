package com.example.runkeeper.tabmvp;


import android.content.Context;
import android.view.View;

public class SharePresenter implements ShareContract.PhotoPresenter, ShareContract.MapPresenter, ShareContract.GraphicPresenter, ShareContract.TabPresenter
{

    private ShareContract.Controller controller;
    private ShareContract.PhotoView photoView;
    private ShareContract.MapView mapView;
    private ShareContract.GraphicView graphicView;
    private ShareContract.TabViewContainer tabViewContainer;


    public SharePresenter(ShareContract.Controller controller, ShareContract.PhotoView photoView, ShareContract.MapView mapView, ShareContract.GraphicView graphicView)
    {
        this.controller = controller;
        this.photoView = photoView;
        this.mapView = mapView;
        this.graphicView = graphicView;
        //this.tabViewContainer = tabViewContainer;
        mapView.setPresenter(this);
        photoView.setPresenter(this);
        graphicView.setPresenter(this);
//        tabViewContainer.setPresenter(this);
//        tabViewContainer.setUpViewPagerAndAdaptor();
    }

    public View getStartView()
    {
        return tabViewContainer.getRootView();
    }


    @Override
    public View getViewByTabPosition(int position)
    {
        switch (position)
        {
            case 0:
                return photoView.getRootView();

            case 1:
                return mapView.getRootView();

            case 2:
                return graphicView.getRootView();
            default:
                return null;
        }
    }

    public static class Factory
    {
        public static SharePresenter create(Context context, ShareContract.Controller controller)
        {
            ShareContract.MapView mapView = new MapView(context);
            ShareContract.PhotoView photoView = new PhotoView(context);
            ShareContract.GraphicView graphicView = new GraphicView(context);
            //ShareContract.TabViewContainer tabViewContainer = new TabViewContainer(context);
            SharePresenter presenter = new SharePresenter(controller, photoView, mapView, graphicView);
            return presenter;
        }
    }
}
