package com.hakathonego.goapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class NewEventActivity extends AppCompatActivity {
    EditText discr;
    EditText place;
    EditText time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_event);
        discr = (EditText) findViewById(R.id.newEventDescript);
        place = (EditText) findViewById(R.id.newEventPlace);
        time = (EditText) findViewById(R.id.newEventTime);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.newEventSend);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //saved! - send to server


                //go_back
                Intent main = new Intent(NewEventActivity.this, MainActivity.class);
                main.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(main);
            }
        });
    }

}
