package com.hakathonego.goapp;

/**
 * Created by ThinkPad on 24.10.2015.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.parceler.Parcel;

public class EventsAdapter extends BaseAdapter {

    private Context mContext;
    private Event[] mData;

    public EventsAdapter(Context context, Event[] objects) {
        mContext = context;
        mData = objects;
    }

    static class ViewHolder {
        TextView txtDescription;
        TextView txtTime;
        TextView txtPlace;
        TextView txtDate;
    }

    @Override
    public Event getItem(int i) {
        return mData[i];
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder viewHolder;

        if (convertView == null){
            LayoutInflater inflater = (LayoutInflater) mContext
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.event, viewGroup, false);
            viewHolder = new ViewHolder();

            viewHolder.txtDescription = (TextView) convertView.findViewById(R.id.description);
            viewHolder.txtTime = (TextView) convertView.findViewById(R.id.time);
            viewHolder.txtPlace = (TextView) convertView.findViewById(R.id.place);
            viewHolder.txtDate = (TextView) convertView.findViewById(R.id.date);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        //set data positions
        //viewHolder.txtItem.setText(getItem(position));
        viewHolder.txtDescription.setText(getItem(position).description);
        viewHolder.txtTime.setText(getItem(position).dateTime);
        viewHolder.txtPlace.setText(getItem(position).place);
        viewHolder.txtDate.setText(getItem(position).dateTime);

        return convertView;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public int getCount() {
        return mData.length;
    }
}