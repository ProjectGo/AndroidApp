package com.hakathonego.goapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by ThinkPad on 25.10.2015.
 */
public class GroupsAdapter extends BaseAdapter {

    private Context mContext;
    private Group[] mData;

    public GroupsAdapter(Context context, Group[] objects) {
        mContext = context;
        mData = objects;
    }

    static class ViewHolder {
        TextView txtGroupName;
    }

    @Override
    public Group getItem(int i) {
        return mData[i];
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder viewHolder;

        if (convertView == null){
            LayoutInflater inflater = (LayoutInflater) mContext
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.group, viewGroup, false);
            viewHolder = new ViewHolder();

            viewHolder.txtGroupName = (TextView) convertView.findViewById(R.id.groupName);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        //set data positions
        //viewHolder.txtItem.setText(getItem(position));
        viewHolder.txtGroupName.setText(getItem(position).name);

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
