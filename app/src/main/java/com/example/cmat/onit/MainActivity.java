package com.example.cmat.onit;


import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;

import android.widget.ImageButton;

import android.widget.Spinner;
import android.widget.Toast;
import android.view.View;

import android.widget.AdapterView.OnItemSelectedListener;

import static com.example.cmat.onit.R.id.view_button;

public class MainActivity extends AppCompatActivity implements OnItemSelectedListener {
      private Spinner SchoolOp;
    private ImageButton viewButton, postButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        SchoolOp = (Spinner)findViewById(R.id.school_op);
        SchoolOp.setOnItemSelectedListener(this);


        postButton = (ImageButton)findViewById(R.id.post_button);
        postButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0) {
                Intent postAction = new Intent(MainActivity.this, ItemInfo.class);
                startActivity(postAction);
            }
        });


        viewButton = (ImageButton)findViewById(view_button);
        viewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                       Intent  test = new Intent(MainActivity.this, BulletinBoard.class);
                startActivity(test);
            }
        });


    }//main end


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




