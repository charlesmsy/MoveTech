package com.example.movetech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // will need to wire the button to the downbox in the future.

    Button toCheckList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    toCheckList = (Button) findViewById(R.id.toTaskButton);

    // both button wired to go to the same checklist

    toCheckList.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            techOriginToCheckList();
        }
    });

    }

    public void techOriginToCheckList(){
        Intent ToTechCheckList = new Intent(getApplicationContext(),techCheckList.class);
        startActivity(ToTechCheckList);
    }

}
