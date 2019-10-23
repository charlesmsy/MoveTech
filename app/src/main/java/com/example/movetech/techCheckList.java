package com.example.movetech;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class techCheckList extends Activity {

    TextView toDetails1;
    TextView toDetails2;
    TextView toDetails3;
    TextView toDetails4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checklist);


        // the button will be replace with a list view/ fragments in the future.

        toDetails1 = (TextView) findViewById(R.id.checkListToDetails1);
        toDetails2 = (TextView) findViewById(R.id.checkListToDetails2);
        toDetails3 = (TextView) findViewById(R.id.checkListToDetails3);
        toDetails4 = (TextView) findViewById(R.id.checkListToDetails4);

        toDetails1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                checkListToDetails();
            }
        });

        toDetails2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                checkListToDetails();
            }
        });

        toDetails3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                checkListToDetails();
            }
        });

        toDetails4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                checkListToDetails();
            }
        });


    }

    public void checkListToDetails(){
        Intent ToDee = new Intent(getApplicationContext(),detailsDetails.class);
        startActivity(ToDee);
    }

}
