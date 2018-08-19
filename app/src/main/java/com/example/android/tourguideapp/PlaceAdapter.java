package com.example.android.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    private int colorResourceId;

    public PlaceAdapter(Activity context, ArrayList<Place> places, int colorResourceId) {
        super(context, 0, places);
        this.colorResourceId = colorResourceId;
    }

    static class ViewHolder {
        private TextView placeTextView;
        private TextView locationTextView;
        private ImageView imageView;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder holder;
        if (null == convertView) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            holder = new ViewHolder();
            holder.placeTextView = convertView.findViewById(R.id.place_text_view);
            holder.locationTextView = convertView.findViewById(R.id.location_text_view);
            holder.imageView = convertView.findViewById(R.id.image);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Place currentPlace = getItem(position);

        holder.placeTextView.setText(currentPlace.getName());
        holder.locationTextView.setText(currentPlace.getLocation());
        holder.imageView.setImageResource(currentPlace.getImageResourceId());

        View textContainer = convertView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), colorResourceId);
        textContainer.setBackgroundColor(color);

        return convertView;

    }
}
