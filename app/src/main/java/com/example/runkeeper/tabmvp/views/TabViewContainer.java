package com.example.runkeeper.tabmvp.views;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;

import com.example.runkeeper.tabmvp.R;
import com.example.runkeeper.tabmvp.ShareContract;

import static com.example.runkeeper.tabmvp.R.id.container;


public class TabViewContainer extends CoordinatorLayout implements ShareContract.TabViewContainer
{

    private ViewPager mViewPager;
    private ShareContract.TabPresenter tabPresenter;
    private View rootView;
    private TabLayout tabLayout;
    private Context applicationContext;

    public TabViewContainer(Context context)
    {
        super(context);
        this.applicationContext = context.getApplicationContext();
        init(context);
    }

    private void init(Context activityContext)
    {
        rootView = inflate(activityContext, R.layout.activity_main, this);
        tabLayout = (TabLayout) rootView.findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Tab 1"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab 2"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab 3"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener()
        {
            @Override
            public void onTabSelected(TabLayout.Tab tab)
            {
                mViewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab)
            {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab)
            {

            }
        });
    }


    @Override
    public void setPresenter(ShareContract.BaseSharePresenter presenter)
    {
        this.tabPresenter = (ShareContract.TabPresenter) presenter;
    }

    @Override
    public View getRootView()
    {
        return rootView;
    }

    @Override
    public void setUpViewPagerAndAdaptor()
    {
        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) rootView.findViewById(container);
        mViewPager.setAdapter(new CustomViewPagerAdaptor());
    }

    private class CustomViewPagerAdaptor extends PagerAdapter
    {

        public CustomViewPagerAdaptor()
        {

        }


        @Override
        public Object instantiateItem(ViewGroup collection, int position)
        {
            View v = getView(position);
            collection.addView(v);
            return v;
        }

        @Override
        public int getCount()
        {
            return 3;
        }

        @Override
        public boolean isViewFromObject(View view, Object object)
        {
            return view == object;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object)
        {
            container.removeView((View) object);
        }

        private View getView(int position)
        {
            return tabPresenter.getViewByTabPosition(position);
        }
    }

}
