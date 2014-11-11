package org.mdcconcepts.kidsi.teacher.teacherapplication.Main;

import android.app.Fragment;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.mdcconcepts.kidsi.teacher.teacherapplication.Attendance.AttendanceActivity;
import org.mdcconcepts.kidsi.teacher.teacherapplication.R;
import org.mdcconcepts.kidsi.teacher.teacherapplication.Util.Util;

/**
 * Created by Admin on 11/10/2014.
 */
public class HomeFragment extends Fragment {

    TextView TextViewController_Attendance;

    TextView TextViewController_Progress;

    TextView TextViewController_Chat;

    TextView TextViewController_Sticker;

    ImageView ImageViewController_SchoolLogo;

    ImageView ImageViewController_Attendance;

    Typeface font;

    public HomeFragment() {
    }

    static View rootView = null;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        try {

            rootView = inflater.inflate(R.layout.fragment_home, container, false);

            TextViewController_Attendance=(TextView)rootView.findViewById(R.id.TextViewController_Attendance);

            TextViewController_Progress=(TextView)rootView.findViewById(R.id.TextViewController_Progress);

            TextViewController_Chat=(TextView)rootView.findViewById(R.id.TextViewController_Chat);

            TextViewController_Sticker=(TextView)rootView.findViewById(R.id.TextViewController_Sticker);

            ImageViewController_SchoolLogo=(ImageView)rootView.findViewById(R.id.ImageViewController_SchoolLogo);

            ImageViewController_Attendance=(ImageView)rootView.findViewById(R.id.ImageViewController_Attendance);

            font =Typeface.createFromAsset(getActivity().getAssets(), Util.FontName);

            TextViewController_Attendance.setTypeface(font);

            TextViewController_Progress.setTypeface(font);

            TextViewController_Chat.setTypeface(font);

            TextViewController_Sticker.setTypeface(font);

            ImageViewController_Attendance.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i=new Intent(getActivity(), AttendanceActivity.class);
                    startActivity(i);
                }
            });

            /**
             * Set School Logo
             */

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return rootView;
    }
}
