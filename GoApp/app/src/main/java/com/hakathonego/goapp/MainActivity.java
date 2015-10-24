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

import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class MainActivity extends AppCompatActivity {

    TextView text;
    private MyClient client;
    String token;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        text = (TextView) findViewById(R.id.text);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //getFriends function!
                /*client.sharedInstance().getFriends(new Callback<List<User>>() {
                    @Override
                    public void success(List<User> users, Response response) {
                        //print all the users
                    }

                    @Override
                    public void failure(RetrofitError error) {
                        //get the error, bitch!
                    }
                });*/
                //
                /*client.sharedSendInstance().getEventList(new Callback<List<Event>>() {
                    @Override
                    public void success(List<Event> shopList, Response response) {
                        //update screen with List<Event>
                    }

                    @Override
                    public void failure(RetrofitError error) {
                        //show an error
                    }
                });*

            }
        });
        */
    }
}
