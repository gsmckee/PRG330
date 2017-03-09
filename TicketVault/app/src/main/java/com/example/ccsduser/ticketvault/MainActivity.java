package com.example.ccsduser.ticketvault;

import android.icu.text.DecimalFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    double costPerTicket = 59.99;
    int numberOfTicket;
    double costTotal;
    String event;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText numTicket = (EditText)findViewById(R.id.editText);
        final Spinner event = (Spinner) findViewById(R.id.spinner);
        final EditText msg = ( EditText)findViewById(R.id.totalCost );
        Button buttonCost = (Button) findViewById(R.id.btn);
        final ImageView image = (ImageView) findViewById(R.id.imageView);
        buttonCost.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                numberOfTicket = Integer.parseInt(numTicket.getText().toString());
                //
                //String selected_index = event.getSelectedItem().toString();
                msg.setText( String.valueOf( event.getSelectedItemPosition() ) );
                int index_selected = event.getSelectedItemPosition();
                float price = 0.0f;
                switch( index_selected )
                {
                    case 0 : { costPerTicket = 59.99f; } break;
                    case 1 : { costPerTicket = 69.99f; } break;
                    case 2 : { costPerTicket = 0.99f; } break;
                    default: break;
                }
                costTotal = costPerTicket * numberOfTicket;
                //DecimalFormat cost = new DecimalFormat("###,###.##");
                image.setVisibility(View.VISIBLE);
                String text = "Total cost is = " + String.valueOf( costTotal);
                msg.setText( text );
//                if( index_selected == 0 ) {
//
//                } else if( index_selected == 1 )
//                {
//                } else if( index_selected == 2 ) {
//                } else {
//                    price = -1.0f;
//                }
            }
                //selected_index );



        } );


    }
}
