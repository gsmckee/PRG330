package com.example.ccsduser.convertpatientweight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import javax.measure.converter.UnitConverter;
import javax.measure.Measure;
import javax.measure.quantity.Mass;
import static javax.measure.unit.NonSI.

public class Main extends AppCompatActivity {
    double lb;
    double kg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final EditText weight = (EditText) findViewById(R.id.patientWeight);
        final RadioButton lb2kg = (RadioButton) findViewById(R.id.lb2Kg);
        final RadioButton kg2Lb = (RadioButton) findViewById(R.id.kg2lb);
        Button total = (Button) findViewById(R.id.convertWeight);
        final TextView result = (TextView) findViewById(R.id.result);
        total.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
