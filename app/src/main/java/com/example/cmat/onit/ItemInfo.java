package com.example.cmat.onit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import static android.widget.AdapterView.*;

public class ItemInfo extends AppCompatActivity  {

    private Spinner item_Op;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_info);

        item_Op = (Spinner)findViewById(R.id.itemOp);
        item_Op.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String test = parent.getItemAtPosition(position).toString();


                Toast.makeText(parent.getContext(),
                        "You selected : " + test,
                        Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }


        });

    }
}


