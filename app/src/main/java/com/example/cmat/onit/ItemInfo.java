package com.example.cmat.onit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

public class ItemInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_info);


        final Spinner feedbackSpinner = (Spinner) findViewById(R.id.SpinnerItemType);
        String feedbackType = feedbackSpinner.getSelectedItem().toString();
    }
}
