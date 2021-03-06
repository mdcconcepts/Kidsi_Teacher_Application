package org.mdcconcepts.kidsi.teacher.teacherapplication.customitems;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import org.mdcconcepts.kidsi.teacher.teacherapplication.R;
import org.mdcconcepts.kidsi.teacher.teacherapplication.Util.Util;


/**
 * Created by mdcconcepts on 11/3/2014.
 */
public class ExitDialogBox extends Dialog {

    Button ButtonController_Yes;

    Button ButtonController_No;

    Typeface font;

    Activity _mContext;

    TextView TextViewController_Exit;

    public ExitDialogBox(Activity context) {

        super(context);
        this._mContext=context;
//        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
		setCancelable(false);

        setContentView(R.layout.dialog_exit);

        ButtonController_Yes=(Button)findViewById(R.id.ButtonController_Yes);

        ButtonController_No =(Button)findViewById(R.id.ButtonController_No);

        TextViewController_Exit=(TextView)findViewById(R.id.TextViewController_Exit);

        font=Typeface.createFromAsset(_mContext.getAssets(), Util.FontName);

        ButtonController_Yes.setTypeface(font);

        ButtonController_No.setTypeface(font);

        TextViewController_Exit.setTypeface(font);

        ButtonController_Yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
                _mContext.finish();
            }
        });

        ButtonController_No.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

    }

}
