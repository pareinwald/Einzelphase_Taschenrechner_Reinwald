package com.example.patrick.einzelphase_taschenrechner_reinwald;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button division = (Button) findViewById(R.id.buttonDividiere);
        final EditText dividend = (EditText) findViewById(R.id.editTextDivident);
        final EditText divisor = (EditText) findViewById(R.id.editTextDivisor);
        final TextView erg = (TextView) findViewById(R.id.textViewErg);


        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               float help =0, divi=0,divo=0;

                if(!dividend.getText().toString().isEmpty() && !divisor.getText().toString().isEmpty())
                {


                    try {
                        divi = Float.parseFloat(dividend.getText().toString());
                        divo = Float.parseFloat(divisor.getText().toString());
                    } catch (Exception e){
                        erg.setText(e.getMessage());
                    }

                    if(divo != 0)
                    {
                        help=divi/divo;
                        erg.setText(""+help);
                    }
                    else
                    {
                        erg.setText("Division durch 0 nicht zulässig");
                    }

                }
                else
                {
                    erg.setText("Bitte Werte eingeben");
                }
            }
        });
    }
}
