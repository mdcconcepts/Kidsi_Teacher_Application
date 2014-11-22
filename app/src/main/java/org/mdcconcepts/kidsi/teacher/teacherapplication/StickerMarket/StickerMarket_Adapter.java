package org.mdcconcepts.kidsi.teacher.teacherapplication.StickerMarket;

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
 * Created by Admin on 11/18/2014.
 */
public class StickerMarket_Adapter extends BaseAdapter {

    private Context mContext;

    Typeface font;



    ImageView imageViewController_Sticker;

    public StickerMarket_Adapter(Context c) {
        mContext = c;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return 10;
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

            grid = inflater.inflate(R.layout.sticker_layout, null);

            font = Typeface.createFromAsset(mContext.getAssets(), Util.FontName);


        } else {
            grid = (View) convertView;
        }
        return grid;
    }
}