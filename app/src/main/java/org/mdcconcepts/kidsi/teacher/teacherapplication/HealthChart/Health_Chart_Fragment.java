package org.mdcconcepts.kidsi.teacher.teacherapplication.HealthChart;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;

import org.mdcconcepts.kidsi.teacher.teacherapplication.ProgressChart.ProgressChartActivity;
import org.mdcconcepts.kidsi.teacher.teacherapplication.R;

/**
 * Created by Admin on 11/13/2014.
 */
public class Health_Chart_Fragment extends Fragment {

    Button ButtonController_Health_Next;

    Button ButtonController_Health_Prev;

    SeekBar Progress_Milk;

    SeekBar Progress_Food;

    SeekBar Progress_Sleep;

    ImageView ImageView_Milk;

    ImageView ImageView_Food;

    ImageView ImageView_Sleep;

    public static Fragment newInstance(int page, String title) {
        Health_Chart_Fragment fragmentFirst = new Health_Chart_Fragment();
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
        View view = inflater.inflate(R.layout.fragment_health_chart,
                container, false);

        ButtonController_Health_Next=(Button)view.findViewById(R.id.ButtonController_Health_Next);

        ButtonController_Health_Prev=(Button)view.findViewById(R.id.ButtonController_Health_Prev);

        Progress_Milk=(SeekBar)view.findViewById(R.id.Progress_Milk);

        Progress_Food=(SeekBar)view.findViewById(R.id.Progress_Food);

        Progress_Sleep=(SeekBar)view.findViewById(R.id.Progress_Sleep);

        ImageView_Milk=(ImageView)view.findViewById(R.id.ImageView_Milk);

        ImageView_Food=(ImageView)view.findViewById(R.id.ImageView_Food);

        ImageView_Sleep=(ImageView)view.findViewById(R.id.ImageView_Sleep);

        Progress_Milk.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                if (progress == 0 || progress == 1) {
                    ImageView_Milk.setImageResource(R.drawable.milk_zero);
                } else if (progress >= 2 && progress <= 5) {
                    ImageView_Milk.setImageResource(R.drawable.milk_one);
                } else if (progress >= 6 && progress <= 10) {
                    ImageView_Milk.setImageResource(R.drawable.milk_two);
                } else if (progress >= 11 && progress <= 15) {
                    ImageView_Milk.setImageResource(R.drawable.milk_three);
                } else if (progress >= 16 && progress <= 20) {
                    ImageView_Milk.setImageResource(R.drawable.milk_four);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        Progress_Food.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {

                if (progress == 0 || progress == 1) {
                    ImageView_Food.setImageResource(R.drawable.food_zero);
                } else if (progress >= 2 && progress <= 5) {
                    ImageView_Food.setImageResource(R.drawable.food_one);
                } else if (progress >= 6 && progress <= 10) {
                    ImageView_Food.setImageResource(R.drawable.food_two);
                } else if (progress >= 11 && progress <= 15) {
                    ImageView_Food.setImageResource(R.drawable.food_three);
                } else if (progress >= 16 && progress <= 20) {
                    ImageView_Food.setImageResource(R.drawable.food_four);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        Progress_Sleep.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {

                if (progress == 0 || progress == 1) {
                    ImageView_Sleep.setImageResource(R.drawable.sleep_zero);
                } else if (progress >= 2 && progress <= 5) {
                    ImageView_Sleep.setImageResource(R.drawable.sleep_one);
                } else if (progress >= 6 && progress <= 10) {
                    ImageView_Sleep.setImageResource(R.drawable.sleep_two);
                } else if (progress >= 11 && progress <= 15) {
                    ImageView_Sleep.setImageResource(R.drawable.sleep_three);
                } else if (progress >= 16 && progress <= 20) {
                    ImageView_Sleep.setImageResource(R.drawable.sleep_four);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        ButtonController_Health_Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ProgressChartActivity) getActivity()).selectPage(2);
            }
        });

        ButtonController_Health_Prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ProgressChartActivity) getActivity()).selectPage(0);
            }
        });
        return view;
    }

}