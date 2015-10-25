package com.hakathonego.goapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

public class AllGroupActivity extends AppCompatActivity {

    private ListView lView;
    private GroupsAdapter groups;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_group);


        lView =(ListView) findViewById(R.id.listGroupView);
        groups = new GroupsAdapter(this, getDataSet());
        lView.setAdapter(groups);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    Group[] getDataSet(){
        Group[] arr = new Group[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = new Group();
            arr[i].name= "Group " + i;
        }
        return arr;
    }

}
