package org.mdcconcepts.kidsi.teacher.teacherapplication.Attendance;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;

import org.mdcconcepts.kidsi.teacher.teacherapplication.R;

public class AttendanceActivity extends Activity {

    GridView grid;

    AttendanceAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);

        String[] parentName = {
                "Mrs.Poonam",
        };



        int[] imageParent = {
                R.drawable.ic_username,
        };
        grid = (GridView) findViewById(R.id.grid);
        adapter=new AttendanceAdapter(AttendanceActivity.this,parentName,imageParent);
        grid.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.attendance, menu);
        return true;
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
