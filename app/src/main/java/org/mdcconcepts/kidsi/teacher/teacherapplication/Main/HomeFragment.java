package org.mdcconcepts.kidsi.teacher.teacherapplication.Main;

import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.app.Fragment;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.mdcconcepts.kidsi.teacher.teacherapplication.Attendance.AttendanceActivity;
import org.mdcconcepts.kidsi.teacher.teacherapplication.ProgressChart.ProgressChartActivity;
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

    ImageView ImageViewController_Chat;

    ImageView ImageViewController_Sticker;

    ImageView ImageViewController_Progress;

    Typeface font;

    LinearLayout LinearLayout_Dynamic;

    LinearLayout LinearLayout_One;

    LinearLayout LinearLayout_Two;

    LinearLayout LinearLayout_Divider;

    public HomeFragment() {
    }

    static View rootView = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        try {

            rootView = inflater.inflate(R.layout.fragment_home, container, false);


            TextViewController_Attendance = (TextView) rootView.findViewById(R.id.TextViewController_Attendance);

            TextViewController_Progress = (TextView) rootView.findViewById(R.id.TextViewController_Progress);

            TextViewController_Chat = (TextView) rootView.findViewById(R.id.TextViewController_Chat);

            TextViewController_Sticker = (TextView) rootView.findViewById(R.id.TextViewController_Sticker);


            ImageViewController_SchoolLogo = (ImageView) rootView.findViewById(R.id.ImageViewController_SchoolLogo);

            ImageViewController_Attendance = (ImageView) rootView.findViewById(R.id.ImageViewController_Attendance);

            ImageViewController_Chat = (ImageView) rootView.findViewById(R.id.ImageViewController_Chat);

            ImageViewController_Sticker = (ImageView) rootView.findViewById(R.id.ImageViewController_Sticker);

            ImageViewController_Progress = (ImageView) rootView.findViewById(R.id.ImageViewController_Progress);


            font = Typeface.createFromAsset(getActivity().getAssets(), Util.FontName);

            TextViewController_Attendance.setTypeface(font);

            TextViewController_Progress.setTypeface(font);

            TextViewController_Chat.setTypeface(font);

            TextViewController_Sticker.setTypeface(font);

            ImageViewController_Attendance.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(getActivity(), AttendanceActivity.class);
                    startActivity(i);
                }
            });

            ImageViewController_Progress.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(getActivity(), ProgressChartActivity.class);
                    startActivity(i);
                }
            });

            float alpha = 0.45f;

//            ImageViewController_Attendance.setAlpha(alpha);

            LinearLayout_Dynamic = (LinearLayout) rootView.findViewById(R.id.LinearLayout_Dynamic);

            LinearLayout_One = (LinearLayout) rootView.findViewById(R.id.LinearLayout_One);

            LinearLayout_Two= (LinearLayout) rootView.findViewById(R.id.LinearLayout_Two);

            LinearLayout_Divider= (LinearLayout) rootView.findViewById(R.id.LinearLayout_Divider);

            Animation animation = AnimationUtils.loadAnimation(getActivity(), R.anim.slide_in_right_home);

            animation.setAnimationListener(new Animation.AnimationListener() {
                @Override
                public void onAnimationStart(Animation animation) {
//                    ImageViewController_Attendance.setVisibility(View.INVISIBLE);
                }

                @Override
                public void onAnimationEnd(Animation animation) {

//                    LinearLayout_One.setVisibility(View.VISIBLE);
//                    Animation icon_animation = AnimationUtils.loadAnimation(getActivity(), R.anim.fade_out_icons);
//
//                   LinearLayout_One.setAnimation(icon_animation);

                    LinearLayout_One.setVisibility(View.VISIBLE);

                    LinearLayout_Two.setVisibility(View.VISIBLE);

                    LinearLayout_Divider.setVisibility(View.VISIBLE);

                    ObjectAnimator anim = ObjectAnimator.ofFloat(LinearLayout_One, "alpha", 0f, 1f);
                    anim.setDuration(1000);
                    anim.start();

                    anim = ObjectAnimator.ofFloat(LinearLayout_Divider, "alpha", 0f, 1f);
                    anim.setDuration(1000);
                    anim.start();

                    anim = ObjectAnimator.ofFloat(LinearLayout_Two, "alpha", 0f, 1f);
                    anim.setDuration(1000);
                    anim.start();
                }

                @Override
                public void onAnimationRepeat(Animation animation) {


                }
            });
            LinearLayout_Dynamic.setAnimation(animation);
            /**
             * Set School Logo
             */

            setTheme();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rootView;
    }


    public void setTheme() {

        GradientDrawable drawable = (GradientDrawable) LinearLayout_Dynamic.getBackground();
        drawable.setColor(0xffF58634);
        LinearLayout_Dynamic.setBackgroundResource(R.drawable.home_fragment_bg_selector);

    }
}
