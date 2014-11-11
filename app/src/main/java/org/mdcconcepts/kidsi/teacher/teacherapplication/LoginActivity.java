package org.mdcconcepts.kidsi.teacher.teacherapplication;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import org.mdcconcepts.kidsi.teacher.teacherapplication.Util.AppSharedPreferences;
import org.mdcconcepts.kidsi.teacher.teacherapplication.Util.Util;
import org.mdcconcepts.kidsi.teacher.teacherapplication.customitems.ConnectionDetector;
import org.mdcconcepts.kidsi.teacher.teacherapplication.customitems.InternetConnectionDialog;
import org.mdcconcepts.kidsi.teacher.teacherapplication.customitems.JSONParser;


public class LoginActivity extends Activity {

    EditText EditText_Username;

    EditText EditText_Password;

    Button ButtonController_Login;

    TextView TextViewController_Title;

    Typeface font;

    public ImageView Incomming_Bus;

    private ImageView Kid;

    private ProgressBar progressBar;

    ConnectionDetector connectionDetector;

    Boolean isConnected;

    JSONParser jsonParser = new JSONParser();

    private static final String TAG_SUCCESS = "success";
    private static final String TAG_MESSAGE = "message";


    TextView TextViewController_ForgotPassword;
    String err = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        try
        {
            EditText_Username = (EditText) findViewById(R.id.username);

            EditText_Password = (EditText) findViewById(R.id.password);

            EditText_Username.setText(AppSharedPreferences.getUname(LoginActivity.this));

            EditText_Password.setText(AppSharedPreferences.getPassword(LoginActivity.this));

            TextViewController_Title = (TextView) findViewById(R.id.TextViewController_Title);

            TextViewController_ForgotPassword = (TextView) findViewById(R.id.TextViewController_ForgotPassword);

            Incomming_Bus = (ImageView) findViewById(R.id.Incomming_Bus);

            Kid = (ImageView) findViewById(R.id.Kid);

            font = Typeface.createFromAsset(getAssets(), Util.FontName);

            ButtonController_Login = (Button) findViewById(R.id.ButtonController_Login);

            connectionDetector = new ConnectionDetector(LoginActivity.this);

            ButtonController_Login.setTypeface(font);

            EditText_Username.setTypeface(font);

            EditText_Password.setTypeface(font);

            TextViewController_Title.setTypeface(font);

            TextViewController_ForgotPassword.setTypeface(font);

            ButtonController_Login.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    // TODO Auto-generated method stub
                    try {

                        boolean connected = false;
                        isConnected = connectionDetector.isConnectingToInternet();
                        if (isConnected) {
                            if (EditText_Username.getText().toString().trim().isEmpty()) {
                                EditText_Username.setError("Please enter username");

                            } else if (EditText_Password.getText().toString().trim().isEmpty()) {
                                EditText_Password.setError("Please enter password");

                            } else {
//                                Toast.makeText(getApplicationContext(),"Onclick",Toast.LENGTH_LONG).show();
                                animate_bus();
//
//                                new AttemptLogin().execute();
                            }
                        } else {
                            InternetConnectionDialog internetConnectionDialog = new InternetConnectionDialog(LoginActivity.this);
                            internetConnectionDialog.show();

                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        catch (Exception e)
        {

        }

    }
    public void animate_bus() {

        ButtonController_Login.setEnabled(false);
        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
//        int height = displaymetrics.heightPixels;
        int width = displaymetrics.widthPixels;

        width = (int) (width * 0.80);
        Animation animation1 = new TranslateAnimation(0.0f, width, 0.0f, 0.0f);
        animation1.setDuration(5000);
        Incomming_Bus.startAnimation(animation1);
        animation1.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationEnd(Animation animation) {
                Intent i = new Intent(getApplicationContext(), LoadingActivity.class);
                startActivity(i);
                overridePendingTransition(
                        R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                Incomming_Bus.setVisibility(View.INVISIBLE);
            }

            public void onAnimationStart(Animation a) {

                Kid.setVisibility(View.INVISIBLE);
            }

            public void onAnimationRepeat(Animation a) {
            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.login, menu);
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
