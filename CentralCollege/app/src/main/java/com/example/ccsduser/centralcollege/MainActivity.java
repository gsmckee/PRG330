package com.example.ccsduser.centralcollege;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int semCredit;
    double semCreditCost;
    double costTotal;
    String event;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView costPerCredit = (TextView) findViewById(R.id.textView2);
        final Spinner event = (Spinner) findViewById(R.id.spinner);
        final EditText numCredits = (EditText) findViewById(R.id.editText);
        final TextView msg = (TextView) findViewById(R.id.textView3 );
        Button buttonCost = (Button) findViewById(R.id.button);
        final ImageView image = (ImageView) findViewById(R.id.imageView);

        // setting the input type to null
        numCredits.setInputType(InputType.TYPE_NULL);
        event.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    // inside the event, setting the type to text
                    numCredits.setInputType(InputType.TYPE_CLASS_TEXT);
                    costPerCredit.setText(String.valueOf(event.getSelectedItemPosition()));
                    int index_selected = event.getSelectedItemPosition();
                    float price = 0.0f;
                    switch (index_selected) {
                        case 0: {
                            semCreditCost = 120.00f;
                        }
                        break;
                        case 1: {
                            semCreditCost = 100.00f;
                        }
                        break;
                        case 2: {
                            semCreditCost = 120.00f;
                        }
                        break;
                        default:
                            break;
                    }
                    String text = String.valueOf(semCreditCost);
                    costPerCredit.setText(text);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



                buttonCost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                semCredit = Integer.parseInt(numCredits.getText().toString());
                //
                //String selected_index = event.getSelectedItem().toString();
                String s1 = String.valueOf(event.getSelectedItem());
                costTotal = semCredit * semCreditCost;
                //DecimalFormat cost = new DecimalFormat("###,###.##");
                //image.setVisibility(View.VISIBLE);

                String text = "The cost of your " + s1 + " semester is " +
                        String.valueOf(costTotal);
                msg.setText(text);
            }
        });
    }
}
