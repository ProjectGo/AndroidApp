package com.hakathonego.goapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        Event event = Parcels.unwrap(this.getIntent().getParcelableExtra("whatToShow"));
        //TextView what = (TextView)findViewById(R.id.what);
        //.setText(loaded.description);


        colors[0] = Color.parseColor("#B2EBF2");
        colors[1] = Color.parseColor("#00BCD4");

        //Log.d("Token:", CurrentUser.token.accessToken);

        LinearLayout linLayout = (LinearLayout) findViewById(R.id.scroll_linLayout);

        LayoutInflater ltInflater = getLayoutInflater();
        //заглушка
        event.members = new ArrayList<Member>();
        for (int i = 0; i < 5; i++) {
            event.members.add(new Member("123", "vk", "vasya", "pupkin", Desision.Yes));
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
}
