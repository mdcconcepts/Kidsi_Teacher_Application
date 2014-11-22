package org.mdcconcepts.kidsi.teacher.teacherapplication.ProgressChart;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Toast;

import org.mdcconcepts.kidsi.teacher.teacherapplication.R;

/**
 * Created by Admin on 11/13/2014.
 */
public class Progress_Chart_Fragment extends Fragment {


    SeekBar Progress_Play;

    SeekBar Progress_Draw;

    SeekBar Progress_Sing;

    ImageView ImageView_Sing;

    ImageView ImageView_Draw;

    ImageView ImageView_Play;

    int step_size = 5;

    public static Fragment newInstance(int page, String title) {
        Progress_Chart_Fragment fragmentFirst = new Progress_Chart_Fragment();
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
        View view = inflater.inflate(R.layout.fragment_progress_chart,
                container, false);
        final Button ButtonController_ProgressNext = ((Button) view
                .findViewById(R.id.ButtonController_ProgressNext));

        Progress_Play = (SeekBar) view.findViewById(R.id.Progress_Play);

        Progress_Draw = (SeekBar) view.findViewById(R.id.Progress_Draw);

        Progress_Sing = (SeekBar) view.findViewById(R.id.Progress_Sing);

        ImageView_Play = (ImageView) view.findViewById(R.id.ImageView_Play);

        ImageView_Draw = (ImageView) view.findViewById(R.id.ImageView_Draw);

        ImageView_Sing = (ImageView) view.findViewById(R.id.ImageView_Sing);

        Progress_Draw.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                if (progress == 0 || progress == 1) {
                    ImageView_Draw.setImageResource(R.drawable.draw_zero);
//                    Toast.makeText(getActivity(), String.valueOf(progress), Toast.LENGTH_LONG).show();
//                    seekBar.setProgress(5);
                } else if (progress >= 2 && progress <= 5) {
                    ImageView_Draw.setImageResource(R.drawable.draw_one);
//                    Toast.makeText(getActivity(), String.valueOf(progress), Toast.LENGTH_LONG).show();
//                    seekBar.setProgress(5);
                } else if (progress >= 6 && progress <= 10) {
                    ImageView_Draw.setImageResource(R.drawable.draw_two);
//                    Toast.makeText(getActivity(), String.valueOf(progress), Toast.LENGTH_LONG).show();
//                    seekBar.setProgress(10);
                } else if (progress >= 11 && progress <= 15) {
                    ImageView_Draw.setImageResource(R.drawable.draw_three);
//                    Toast.makeText(getActivity(), String.valueOf(progress), Toast.LENGTH_LONG).show();
//                    seekBar.setProgress(15);
                } else if (progress >= 16 && progress <= 20) {
                    ImageView_Draw.setImageResource(R.drawable.draw_four);
//                    Toast.makeText(getActivity(), String.valueOf(progress), Toast.LENGTH_LONG).show();
//                    seekBar.setProgress(15);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        Progress_Play.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {


                if (progress == 0 || progress == 1) {
                    ImageView_Play.setImageResource(R.drawable.play_zero);
//                    Toast.makeText(getActivity(), String.valueOf(progress), Toast.LENGTH_LONG).show();
//                    seekBar.setProgress(5);
                } else if (progress >= 2 && progress <= 5) {
                    ImageView_Play.setImageResource(R.drawable.play_one);
//                    Toast.makeText(getActivity(), String.valueOf(progress), Toast.LENGTH_LONG).show();
//                    seekBar.setProgress(5);
                } else if (progress >= 6 && progress <= 10) {
                    ImageView_Play.setImageResource(R.drawable.play_two);
//                    Toast.makeText(getActivity(), String.valueOf(progress), Toast.LENGTH_LONG).show();
//                    seekBar.setProgress(10);
                } else if (progress >= 11 && progress <= 15) {
                    ImageView_Play.setImageResource(R.drawable.play_three);
//                    Toast.makeText(getActivity(), String.valueOf(progress), Toast.LENGTH_LONG).show();
//                    seekBar.setProgress(15);
                } else if (progress >= 16 && progress <= 20) {
                    ImageView_Play.setImageResource(R.drawable.play_four);
//                    Toast.makeText(getActivity(), String.valueOf(progress), Toast.LENGTH_LONG).show();
//                    seekBar.setProgress(15);
                }

//                progress = ((int) Math.round(progress / step_size)) * step_size;
//                seekBar.setProgress(progress);
//                Toast.makeText(getActivity(),String.valueOf(progress),Toast.LENGTH_LONG).show();
//                Toast.makeText(getActivity(),ImageView_Play.getDrawable().toString(),Toast.LENGTH_LONG).show();
//
//                Toast.makeText(getActivity(),getActivity().getResources().getDrawable(R.drawable.play_one).toString(),Toast.LENGTH_LONG).show();

//                if (ImageView_Play.getDrawable().equals(getActivity().getResources().getDrawable(R.drawable.play_one))) {
//
//                    Toast.makeText(getActivity(), "Play One", Toast.LENGTH_LONG).show();


//                }
//                } else if (ImageView_Play.getDrawable().equals(getActivity().getResources().getDrawable(R.drawable.play_two))) {
//
//                    Toast.makeText(getActivity(),"Play Two",Toast.LENGTH_LONG).show();
//                    ImageView_Play.setImageResource(R.drawable.play_three);
//
//                } else if (ImageView_Play.getDrawable().equals(getActivity().getResources().getDrawable(R.drawable.play_three))) {
//                    Toast.makeText(getActivity(),"Play Three",Toast.LENGTH_LONG).show();
//                    ImageView_Play.setImageResource(R.drawable.play_four);
//                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        Progress_Sing.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {

                if (progress == 0 || progress == 1) {
                    ImageView_Sing.setImageResource(R.drawable.sing_zero);
//                    Toast.makeText(getActivity(), String.valueOf(progress), Toast.LENGTH_LONG).show();
//                    seekBar.setProgress(5);
                } else if (progress >= 2 && progress <= 5) {
                    ImageView_Sing.setImageResource(R.drawable.sing_one);
//                    Toast.makeText(getActivity(), String.valueOf(progress), Toast.LENGTH_LONG).show();
//                    seekBar.setProgress(5);
                } else if (progress >= 6 && progress <= 10) {
                    ImageView_Sing.setImageResource(R.drawable.sing_two);
//                    Toast.makeText(getActivity(), String.valueOf(progress), Toast.LENGTH_LONG).show();
//                    seekBar.setProgress(10);
                } else if (progress >= 11 && progress <= 15) {
                    ImageView_Sing.setImageResource(R.drawable.sing_three);
//                    Toast.makeText(getActivity(), String.valueOf(progress), Toast.LENGTH_LONG).show();
//                    seekBar.setProgress(15);
                } else if (progress >= 16 && progress <= 20) {
                    ImageView_Sing.setImageResource(R.drawable.sing_four);
//                    Toast.makeText(getActivity(), String.valueOf(progress), Toast.LENGTH_LONG).show();
//                    seekBar.setProgress(15);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        ButtonController_ProgressNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getActivity(), "onClick", Toast.LENGTH_LONG).show();
//                mViewpager.setCurrentItem(1);
                ((ProgressChartActivity) getActivity()).selectPage(1);
            }
        });


        return view;
    }

}
