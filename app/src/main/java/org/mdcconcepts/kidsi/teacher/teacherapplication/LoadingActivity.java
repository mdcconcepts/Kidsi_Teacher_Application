package org.mdcconcepts.kidsi.teacher.teacherapplication;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import org.mdcconcepts.kidsi.teacher.teacherapplication.Main.HomeActivity;
import org.mdcconcepts.kidsi.teacher.teacherapplication.R;
import org.mdcconcepts.kidsi.teacher.teacherapplication.Util.Util;

public class LoadingActivity extends Activity {


    String uname, password;

    public ImageView to_school;

    private ImageView Kids_Drop;

    TextView TextViewController_Loading;

    Typeface font;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        to_school = (ImageView) findViewById(R.id.to_school);

        Kids_Drop = (ImageView) findViewById(R.id.kids_drop);

        TextViewController_Loading=(TextView)findViewById(R.id.TextViewController_Loading);

        font=Typeface.createFromAsset(getAssets(), Util.FontName);

        TextViewController_Loading.setTypeface(font);

        animate_bus();
    }

    public void animate_bus() {


        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
//        int height = displaymetrics.heightPixels;
        int width = displaymetrics.widthPixels;

        width = (int) (width * 0.65);

        Animation animation1 = new TranslateAnimation(0.0f, width, 0.0f, 0.0f);
        animation1.setDuration(5000);
        to_school.startAnimation(animation1);
        animation1.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationEnd(Animation animation) {
//                Intent i = new Intent(getApplicationContext(), LoadingActivity.class);
//                startActivity(i);
//                overridePendingTransition(
//                        R.anim.slide_in_right, R.anim.slide_out_left);
//                finish();

                animation.setFillAfter(true);
                Kids_Drop.setVisibility(View.VISIBLE);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent mainIntent = new Intent(LoadingActivity.this, HomeActivity.class);
                        LoadingActivity.this.startActivity(mainIntent);
                        LoadingActivity.this.finish();
                    }
                },1000);


            }

            public void onAnimationStart(Animation a) {

                Kids_Drop.setVisibility(View.INVISIBLE);
            }

            public void onAnimationRepeat(Animation a) {
            }

        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.loading, menu);
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
