package org.mdcconcepts.kidsi.teacher.teacherapplication.ProgressChart;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import org.mdcconcepts.kidsi.teacher.teacherapplication.Attendance.AttendanceAdapter;
import org.mdcconcepts.kidsi.teacher.teacherapplication.R;

public class ProgressChartActivity extends FragmentActivity  {

    ListView ListView_Attendance;

    static ViewPager mViewpager;

    Button ButtonController_ProgressNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_chart);

        ListView_Attendance=(ListView)findViewById(R.id.ListView_Attendance);

        String[] studentName = {
                "Mr.Om Patel",
                "Ms.Shweta Kulkarni",
                "Mr.Anirudha Kulkarni",
                "Ms.Sharayu Jagtap",
                "Mr.Sagar More"
        };

        int[] imageStudent = {
                R.drawable.ic_kid_two,
                R.drawable.ic_kid_one,
                R.drawable.ic_kid_three,
                R.drawable.ic_kid_five,
                R.drawable.ic_kid_four,

        };

        View footer= getLayoutInflater().inflate(R.layout.list_header_blank, null);

        ListView_Attendance.addFooterView(footer);

        AttendanceAdapter adapter=new AttendanceAdapter(ProgressChartActivity.this,studentName,imageStudent);

        ListView_Attendance.setAdapter(adapter);

        mViewpager=(ViewPager)findViewById(R.id.mViewpager);

        ViewPagerAdapter adapterViewPager = new ViewPagerAdapter(getSupportFragmentManager());

        mViewpager.setAdapter(adapterViewPager);


//        ButtonController_ProgressNext=(Button)mViewpager.findViewById(R.id.ButtonController_ProgressNext);
//


        mViewpager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                switch(position)
                {
                    case 0:


                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.health_chart, menu);
        return true;
    }
    public void selectPage(int page) {
        mViewpager.setCurrentItem(page);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
 }
