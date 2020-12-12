package com.example.appcaronline1.activityhistory;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.appcaronline1.R;
import com.google.android.material.tabs.TabLayout;

public class ActivityHistory extends AppCompatActivity {
    TabLayout tabLayout_422;
    ViewPager viewPager_422;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_history);
        tabLayout_422=(TabLayout)findViewById(R.id.tablayout_history);
        viewPager_422=(ViewPager)findViewById(R.id.viewpaper_history);

        tabLayout_422.addTab(tabLayout_422.newTab().setText("Đi lại"));
        tabLayout_422.addTab(tabLayout_422.newTab().setText("Giao hàng"));
        tabLayout_422.setTabGravity(TabLayout.GRAVITY_FILL);

        final HistoryAdapter adapter = new HistoryAdapter(this,getSupportFragmentManager(), tabLayout_422.getTabCount());
        viewPager_422.setAdapter(adapter);

        viewPager_422.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout_422));

        tabLayout_422.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager_422.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}