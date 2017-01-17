package com.example.cmat.onit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.view.View;
public class MainActivity extends AppCompatActivity {

    private Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner1.setOnItemSelectedListener(new ItemSelectedListener());


    }

    public class ItemSelectedListener implements AdapterView.OnItemSelectedListener {
        String firstItem = String.valueOf(spinner1.getSelectedItem());

        public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {


            if (firstItem.equals(String.valueOf(spinner1.getSelectedItem()))) {

            } else {
                Toast.makeText(parent.getContext(),
                        "YOU HAVE SELECTED: " + parent.getItemAtPosition(pos).toString(),
                        Toast.LENGTH_LONG).show();
            }



        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    }
}
