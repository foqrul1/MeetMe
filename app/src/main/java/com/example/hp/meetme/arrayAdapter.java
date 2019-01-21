package com.example.hp.meetme;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

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

        String c = card_Id.getProfileImageUrl();
        //Toast.makeText(context, "Cards Results "+c, Toast.LENGTH_SHORT).show();
        switch (c){
            case "default":
                Glide.with(convertView.getContext()).load(R.mipmap.ic_launcher).into(image);
                break;
            default:
                //Glide.clear(image);
                Glide.with(convertView.getContext()).load(card_Id.getProfileImageUrl()).into(image);
                break;

        }
        return convertView;
    }
}
