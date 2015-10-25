package com.hakathonego.goapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.parceler.Parcels;

/**
 * Created by Артём on 24.10.2015.
 */
public class EventActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        Event loaded = Parcels.unwrap(this.getIntent().getParcelableExtra("whatToShow"));
        TextView what = (TextView)findViewById(R.id.what);
        what.setText(loaded.description);
       /* Event event = null;

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            //event = extras.getClass() ;
        }
        */
    }
}
