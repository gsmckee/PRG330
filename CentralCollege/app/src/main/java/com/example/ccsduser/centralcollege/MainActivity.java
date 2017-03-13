package com.example.ccsduser.centralcollege;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        event.setOnItemSelectedListener(new View)  {
            @Override
            public void itemSelected(View v){
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
        });
        buttonCost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                semCredit = Integer.parseInt(numCredits.getText().toString());
                //
                //String selected_index = event.getSelectedItem().toString();

                costTotal = semCredit * semCreditCost;
                //DecimalFormat cost = new DecimalFormat("###,###.##");
                //image.setVisibility(View.VISIBLE);
                String text = "The cost of your " + String.valueOf(event) + "semester is " +
                        String.valueOf(costTotal);
                msg.setText(text);
            }
        });
    }
}
