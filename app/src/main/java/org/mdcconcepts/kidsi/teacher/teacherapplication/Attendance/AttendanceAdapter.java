package org.mdcconcepts.kidsi.teacher.teacherapplication.Attendance;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.mdcconcepts.kidsi.teacher.teacherapplication.R;
import org.mdcconcepts.kidsi.teacher.teacherapplication.Util.Util;

/**
 * Created by Admin on 11/11/2014.
 */
public class AttendanceAdapter extends BaseAdapter {

    private Context mContext;

    Typeface font;

    private final String[] studentName;

    private final int[] imageParent;

    TextView TextViewController_StudentName;

    TextView TextViewController_ParentMobile;

    ImageView imageViewController_ProfilePic;

    public AttendanceAdapter(Context c,String[] studentName,int[] imageParent) {
        mContext = c;
        this.studentName = studentName;
        this.imageParent=imageParent;
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return 5;
    }
    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub

        View grid;

        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            grid = new View(mContext);

            grid = inflater.inflate(R.layout.attendance_item_layout, null);

            font =Typeface.createFromAsset(mContext.getAssets(), Util.FontName);

            TextViewController_StudentName=(TextView)grid.findViewById(R.id.TextViewController_StudentName);

            TextViewController_StudentName.setTypeface(font);

            imageViewController_ProfilePic =(ImageView)grid.findViewById(R.id.imageViewController_ProfilePic);

            TextViewController_StudentName.setText(studentName[position]);

            imageViewController_ProfilePic.setImageResource(imageParent[position]);

        } else {
            grid = (View) convertView;
        }
        return grid;
    }
}
