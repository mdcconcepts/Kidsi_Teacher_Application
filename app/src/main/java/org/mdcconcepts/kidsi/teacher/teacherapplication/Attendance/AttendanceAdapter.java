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

    private final String[] parentName;

    private final int[] imageParent;

    TextView TextViewController_ParentName_Online;

    TextView TextViewController_ParentMobile;

    ImageView ImageViewController_ProfilePic;

    public AttendanceAdapter(Context c,String[] parentName,int[] imageParent) {
        mContext = c;
        this.parentName = parentName;
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

//            TextViewController_ParentName_Online=(TextView)grid.findViewById(R.id.TextViewController_ParentName_Online);
//            TextViewController_ParentMobile=(TextView)grid.findViewById(R.id.TextViewController_ParentMobile);
//
//            ImageViewController_ProfilePic =(ImageView)grid.findViewById(R.id.ImageViewController_ProfilePic);
//
//            TextViewController_ParentName_Online.setTypeface(font);
//            TextViewController_ParentMobile.setTypeface(font);
//
//            TextViewController_ParentName_Online.setText(parentName[position]);
//            TextViewController_ParentMobile.setText(parentMobileNumber[position]);
//            ImageViewController_ProfilePic.setImageResource(imageParent[position]);

        } else {
            grid = (View) convertView;
        }
        return grid;
    }
}
