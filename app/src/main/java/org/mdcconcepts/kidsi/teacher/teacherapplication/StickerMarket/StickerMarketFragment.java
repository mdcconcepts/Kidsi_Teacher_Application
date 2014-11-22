package org.mdcconcepts.kidsi.teacher.teacherapplication.StickerMarket;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;

import org.mdcconcepts.kidsi.teacher.teacherapplication.Attendance.AttendanceAdapter;
import org.mdcconcepts.kidsi.teacher.teacherapplication.ProgressChart.ProgressChartActivity;
import org.mdcconcepts.kidsi.teacher.teacherapplication.R;

/**
 * Created by Admin on 11/18/2014.
 */
public class StickerMarketFragment extends Fragment {

    GridView sticker_grid;

    StickerMarket_Adapter adapter;

    Button ButtonController_StickerPrev;

    public static Fragment newInstance(int page, String title) {
        StickerMarketFragment fragmentFirst = new StickerMarketFragment();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        fragmentFirst.setArguments(args);
        return fragmentFirst;
    }

    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sticker_market,
                container, false);

        sticker_grid = (GridView)view.findViewById(R.id.sticker_grid);

        adapter=new StickerMarket_Adapter(getActivity());

        sticker_grid.setAdapter(adapter);

        ButtonController_StickerPrev=(Button)view.findViewById(R.id.ButtonController_StickerPrev);

        ButtonController_StickerPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ProgressChartActivity) getActivity()).selectPage(1);
            }
        });
        return view;
    }
}
