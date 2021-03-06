package com.example.porori;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class DataPolicy extends Activity {

    ImageButton ba,hom,plu,peo;
    Button da,term;

    View.OnClickListener cl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datapolicy);

        ba = (ImageButton) findViewById(R.id.back);
        hom = (ImageButton) findViewById(R.id.home);
        plu = (ImageButton) findViewById(R.id.plus);
        peo = (ImageButton) findViewById(R.id.peple);
        da = (Button) findViewById(R.id.data);
        term = (Button) findViewById(R.id.terms);

        cl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.back :
                        Intent i = new Intent(getApplicationContext(), Info.class);
                        startActivity(i);
                        break;

                    case R.id.home :
                        Intent i2 = new Intent(getApplicationContext(), SNS_Main.class);
                        startActivity(i2);
                        break;

                    case R.id.plus :
                        break;

                    case R.id.peple :
                        break;

                    case R.id.data :
                        Intent i3 = new Intent(getApplicationContext(), PersonalINFO.class);
                        startActivity(i3);
                        break;

                    case R.id.terms :
                        Intent i4 = new Intent(getApplicationContext(), LocationINFO.class);
                        startActivity(i4);
                        break;

                }

            }
        };
        ba.setOnClickListener(cl);
        hom.setOnClickListener(cl);
        plu.setOnClickListener(cl);
        peo.setOnClickListener(cl);
        da.setOnClickListener(cl);
        term.setOnClickListener(cl);


    }
}
