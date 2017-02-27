package com.example.runkeeper.tabmvp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class ShareActivity extends AppCompatActivity implements ShareContract.Controller
{

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
  //  private SectionsPagerAdapter mSectionsPagerAdapter;
    private SharePresenter presenter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        presenter = SharePresenter.Factory.create(getApplicationContext(), this);
        TabViewContainer tabViewContainer = new TabViewContainer(this);
        tabViewContainer.setPresenter(presenter);
        tabViewContainer.setUpViewPagerAndAdaptor();
        setContentView(tabViewContainer.getRootView());



        //setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        // Create the adapter that will return a fragment for each of the three
//        // primary sections of the activity.
//        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
//
//        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
//        tabLayout.addTab(tabLayout.newTab().setText("Tab 1"));
//        tabLayout.addTab(tabLayout.newTab().setText("Tab 2"));
//        tabLayout.addTab(tabLayout.newTab().setText("Tab 3"));
//        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
//
//        // Set up the ViewPager with the sections adapter.
//        mViewPager = (ViewPager) findViewById(R.id.container);
//        mViewPager.setAdapter(mSectionsPagerAdapter);
//
//        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener()
//        {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab)
//            {
//                mViewPager.setCurrentItem(tab.getPosition());
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab)
//            {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab)
//            {
//
//            }
//        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

//
//    /**
//     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
//     * one of the sections/tabs/pages.
//     */
//    //todo dcrelling this can probably be moved into the TabViewContainer class
//    public class SectionsPagerAdapter extends FragmentPagerAdapter
//    {
//
//        public SectionsPagerAdapter(FragmentManager fm)
//        {
//            super(fm);
//        }
//
//        @Override
//        public Fragment getItem(int position)
//        {
//            // getItem is called to instantiate the fragment for the given page.
//            switch (position)
//            {
//                case 0:
//                    return PhotoFragment.newInstance(0);
//
//                case 1:
//                    return MapFragment.newInstance(1);
//
//                case 2:
//                    return GraphicFragment.newInstance(2);
//                default:
//                    return null;
//            }
//        }
//
//        @Override
//        public int getCount()
//        {
//            // Show 3 total pages.
//            return 3;
//        }
//
//        @Override
//        public CharSequence getPageTitle(int position)
//        {
//            switch (position)
//            {
//                case 0:
//                    return "SECTION 1";
//                case 1:
//                    return "SECTION 2";
//                case 2:
//                    return "SECTION 3";
//            }
//            return null;
//        }
//    }
}
