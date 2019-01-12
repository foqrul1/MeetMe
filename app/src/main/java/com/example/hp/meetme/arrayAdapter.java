package com.example.hp.meetme;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class arrayAdapter extends ArrayAdapter<cards> {
    Context context;

    public arrayAdapter(Context context, int resourceId, List<cards> items){
        super(context, resourceId,items);
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        cards card_Id = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);
        }
        TextView name = convertView.findViewById(R.id.name);
        ImageView image = convertView.findViewById(R.id.imageView);

        name.setText(card_Id.getName());
        image.setImageResource(R.mipmap.ic_launcher);
        return convertView;
    }
}
