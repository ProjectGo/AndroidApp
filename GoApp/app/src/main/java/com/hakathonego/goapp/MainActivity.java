package com.hakathonego.goapp;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Test test;
    TextView text;
    String res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        text = (TextView) findViewById(R.id.text);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                test = new Test();
                test.execute();
            }
        });
    }

    private class Test extends AsyncTask<Void, Void, Void> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            text.setText("1");
        }

        @Override
        protected Void doInBackground(Void... params) {
            try {
                // The connection URL
                String url = "https://ajax.googleapis.com/ajax/" +
                        "services/search/web?v=1.0&q={query}";

                // Create a new RestTemplate instance
                //RestTemplate restTemplate = new RestTemplate();

                // Add the String message converter
                //restTemplate.getMessageConverters().add(new StringHttpMessageConverter());

                // Make the HTTP GET request, marshaling the response to a String
                //res = restTemplate.getForObject(url, String.class, "Android");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);
            text.setText(res);
        }
    }
}