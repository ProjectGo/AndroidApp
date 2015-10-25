package com.hakathonego.goapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import org.parceler.Parcels;

public class AllGroupActivity extends AppCompatActivity {

    private ListView lView;
    private GroupsAdapter groups;
    private Intent newEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_group);


        lView =(ListView) findViewById(R.id.listGroupView);
        groups = new GroupsAdapter(this, getDataSet());
        lView.setAdapter(groups);

        lView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                newEvent = new Intent(getBaseContext(), NewEventActivity.class);
                Bundle bundle = new Bundle();
                bundle.putParcelable("groupInfo", Parcels.wrap(groups.getItemId(position - 1)));
                newEvent.putExtras(bundle);
                startActivity(newEvent);
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Start new group activity

                //Intent newGroup = new Intent(getBaseContext(),);
                //startActivities(newGroup);
            }
        });
    }

    private Group[] getDataSet(){
        Group[] arr = new Group[50];
        for (int i = 0; i < 50; i++) {
            arr[i] = new Group();
            if(i % 4 == 0)
                arr[i].name= "Family " + "Group " + i;
            if(i % 4 == 1)
                arr[i].name= "Teammates " + "Group " + i;
            if(i % 4 == 2)
                arr[i].name= "Friends " + "Group " + i;
            if(i % 4 == 3)
                arr[i].name= "Cookies " + "Group " + i;

        }
        return arr;
    }

}
