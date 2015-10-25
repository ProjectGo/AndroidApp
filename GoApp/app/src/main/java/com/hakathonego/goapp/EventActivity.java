package com.hakathonego.goapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.TextView;

import org.parceler.Parcels;

import java.util.ArrayList;

/**
 * Created by Артём on 24.10.2015.
 */
public class EventActivity extends AppCompatActivity {

    EventsAdapter adapter;
    ListView listViewOfMembers;
    int[] colors = new int[2];
    String[][] names;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        Event event = Parcels.unwrap(this.getIntent().getParcelableExtra("whatToShow"));
        //TextView what = (TextView)findViewById(R.id.what);
        //.setText(loaded.description);


        colors[0] = Color.parseColor("#B2EBF2");
        colors[1] = Color.parseColor("#00BCD4");

        LinearLayout linLayout = (LinearLayout) findViewById(R.id.scroll_linLayout);

        LayoutInflater ltInflater = getLayoutInflater();
        //заглушка
        genArray();
        event.members = new ArrayList<Member>();
        for (int j = 0; j < 10; j++) {
            if(j % 3 == 0)
                event.members.add(new Member(Integer.toString(j-1), "vk", names[j%10][0],names[j%10][1], Desision.Yes));
            if(j % 3 == 1)
                event.members.add(new Member(Integer.toString(j-1), "vk", names[j%10][0],names[j%10][1], Desision.No));
            if(j % 3 == 2)
                event.members.add(new Member(Integer.toString(j-1), "vk", names[j%10][0],names[j%10][1], Desision.Thinking));
        }

        for (int i = 0; i < event.members.size(); i++) {
            //Log.d("myLogs", "i = " + i);
            View item = ltInflater.inflate(R.layout.member, linLayout, false);
            TextView memberName = (TextView) item.findViewById(R.id.member_name);
            memberName.setText(event.members.get(i).name + " " + event.members.get(i).sername);
            ImageView desicionImage = (ImageView) item.findViewById(R.id.decision_image);

            switch (event.members.get(i).desision){
                case Yes:
                    desicionImage.setImageResource(R.drawable.yes);
                    break;
                case No:
                    desicionImage.setImageResource(R.drawable.no);
                    break;
                case Thinking:
                    desicionImage.setImageResource(R.drawable.thinking);
                    break;
                default:
                    desicionImage.setImageResource(R.drawable.thinking);
                    break;
            }
            item.getLayoutParams().width = ViewGroup.LayoutParams.MATCH_PARENT;
            item.setBackgroundColor(colors[i % 2]);
            linLayout.addView(item);
        }

    }

    void genArray(){
        names = new String[10][2];
        names[0][0] = "Igor"; names[0][1] = "Tochniy";
        names[1][0] = "Vasya"; names[1][1] = "Svoyvdosku";
        names[2][0] = "Petya"; names[2][1] = "Alkash";
        names[3][0] = "Marina"; names[3][1] = "Veselaya";
        names[4][0] = "Sokol"; names[4][1] = "Viktorov";
        names[5][0] = "Leo"; names[5][1] = "Tolstoy";
        names[6][0] = "Chip"; names[6][1] = "Green";
        names[7][0] = "Daile"; names[7][1] = "Fat";
        names[8][0] = "Mitya"; names[8][1] = "Rovniy";
        names[9][0] = "Sasha"; names[9][1] = "Kusnezov";
    }
}
