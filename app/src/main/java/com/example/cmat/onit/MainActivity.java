package com.example.cmat.onit;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

public class MainActivity extends AppCompatActivity implements OnItemSelectedListener {
      private Spinner SchoolOp;
    private ImageButton viewButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewButton = (ImageButton) findViewById(R.id.view_button);


        SchoolOp = (Spinner)findViewById(R.id.school_op);
        SchoolOp.setOnItemSelectedListener(this);

}
    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int pos, long id)
    {

        String test = parent.getItemAtPosition(pos).toString();


        Toast.makeText(parent.getContext(),
                "You selected : " + test,
                Toast.LENGTH_SHORT).show();

    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0)
    {

    }



}




