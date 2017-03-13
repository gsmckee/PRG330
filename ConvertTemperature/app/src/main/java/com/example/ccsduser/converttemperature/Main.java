package com.example.ccsduser.converttemperature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import javax.measure.Measure;
import javax.measure.converter.UnitConverter;
import static javax.measure.unit.NonSI.FAHRENHEIT;
import static javax.measure.unit.NonSI.MILE;
import static javax.measure.unit.SI.CELSIUS;

public class Main extends AppCompatActivity {
    double f;
    double c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final UnitConverter toFahrenheit= CELSIUS.getConverterTo(FAHRENHEIT);
        final UnitConverter toCelsius= FAHRENHEIT.getConverterTo(CELSIUS);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText text = (EditText) findViewById(R.id.editText);
        final RadioButton rb1 = (RadioButton) findViewById(R.id.cDegToFDeg);
        final RadioButton rb2 = (RadioButton) findViewById(R.id.fDegToCDeg);
        Button btn = (Button) findViewById(R.id.button);
        final TextView result = (TextView) findViewById(R.id.textView);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rb1.isChecked()) {
                    f = Integer.parseInt(text.getText().toString());
                    double fToC = toCelsius.convert(Measure.valueOf(f, CELSIUS).doubleValue(CELSIUS));
                    String converted = String.valueOf(fToC).toString();
                    result.setText(converted);
                }
                else if(rb2.isChecked()) {
                    c = Integer.parseInt(text.getText().toString());
                    double cToF = toFahrenheit.convert(Measure.valueOf(c, FAHRENHEIT).doubleValue(FAHRENHEIT));
                    String converted = String.valueOf(cToF).toString();
                    result.setText(converted);
                }
                rb1.setChecked(false);
                rb2.setChecked(false);
                text.setText(" ");
            }
        });
    }
}
