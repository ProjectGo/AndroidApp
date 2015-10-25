package com.hakathonego.goapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import org.parceler.Parcels;

import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class MainActivity extends AppCompatActivity {

    private MyClient client;
    EventsAdapter adapter;
    ListView lView;
    Intent openEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lView = (ListView) findViewById(R.id.lview);
        adapter = new EventsAdapter(this, getDataSet());
        lView.setAdapter(adapter);

        lView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                openEvent = new Intent(getBaseContext(), EventActivity.class);
                Bundle bundle = new Bundle();
                bundle.putParcelable("whatToShow", Parcels.wrap(adapter.getItem(position)));
                openEvent.putExtras(bundle);
                startActivity(openEvent);
            }
        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //getFriends function!

                openEvent = new Intent(getBaseContext(),AllGroupActivity.class);
                startActivity(openEvent);

                /*client.sharedInstance().getFriends(new Callback<List<User>>() {
                    @Override
                    public void success(List<User> users, Response response) {
                        //print all the users
                    }

                    @Override
                    public void failure(RetrofitError error) {
                        //get the error, bitch!
                    }
                });
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
                });*/

            }
        });
    }


    private Event[] getDataSet(){
        Event[] arr = new Event[40];
        //genArray();

        for (int i = 0; i < 40; i++) {
            arr[i] = new Event();
            arr[i].description = "item" + i;
            arr[i].place = "garage";

            arr[i].dateTime = i% 32 + "." + i%13 + ".199"+ i%10;

        }
        return arr;
    }
}
