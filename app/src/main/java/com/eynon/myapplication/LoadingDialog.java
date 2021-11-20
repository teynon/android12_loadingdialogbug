package com.eynon.myapplication;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.TextView;

public class LoadingDialog extends Dialog
{
    private String label = null;
    public LoadingDialog(Activity a) {
        super(a);
    }

    public LoadingDialog(Activity a, String text) {
        super(a);
        label = text;
    }

    // ---------------------------------------------------------------------------------------------
    // LIFECYCLE
    // ---------------------------------------------------------------------------------------------
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setupView();
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        if (label != null) {
            ((TextView)findViewById(R.id.tv_loadingText)).setText(label);
        }
    }

    private void setupView()
    {
        setContentView(R.layout.dialog_loading);
    }
}
