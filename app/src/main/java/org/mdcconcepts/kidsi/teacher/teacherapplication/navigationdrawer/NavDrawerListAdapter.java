package org.mdcconcepts.kidsi.teacher.teacherapplication.navigationdrawer;

/**
 * Created by ssk on 10/19/2014.
 */

import android.app.Activity;
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

import java.util.ArrayList;

public class NavDrawerListAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<NavDrawerItem> navDrawerItems;

    Typeface font;
    public NavDrawerListAdapter(Context context, ArrayList<NavDrawerItem> navDrawerItems){
        this.context = context;
        this.navDrawerItems = navDrawerItems;
    }

    @Override
    public int getCount() {
        return navDrawerItems.size();
    }

    @Override
    public Object getItem(int position) {
        return navDrawerItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        try {
            if (convertView == null) {
                LayoutInflater mInflater = (LayoutInflater)
                        context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
                convertView = mInflater.inflate(R.layout.drawer_list_item, null);
            }

            ImageView imgIcon = (ImageView) convertView.findViewById(R.id.icon);
            TextView txtTitle = (TextView) convertView.findViewById(R.id.title);



            font=Typeface.createFromAsset(context.getAssets(), Util.FontName);

            imgIcon.setImageResource(navDrawerItems.get(position).getIcon());

            txtTitle.setText(navDrawerItems.get(position).getTitle());

            txtTitle.setTypeface(font);

            // displaying count
            // check whether it set visible or not

        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return convertView;
    }

}
