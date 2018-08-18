package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.sarojini), getString(R.string.sarojini_nagar), R.drawable.sarojininagar));
        places.add(new Place(getString(R.string.cp), getString(R.string.rajiv_chowk), R.drawable.connaughtplace));
        places.add(new Place(getString(R.string.chandni_chowk), getString(R.string.chandni_chowk), R.drawable.chandnichowk));
        places.add(new Place(getString(R.string.lajpat_nagar), getString(R.string.lajpat_nagar), R.drawable.lajpatnagar));
        places.add(new Place(getString(R.string.karol_bagh), getString(R.string.karol_bagh), R.drawable.karolbagh));
        places.add(new Place(getString(R.string.janpath), getString(R.string.rajiv_chowk), R.drawable.janpath));
        places.add(new Place(getString(R.string.dilli_haat), getString(R.string.ina), R.drawable.dillihaat));
        places.add(new Place(getString(R.string.hkv), getString(R.string.hauz_khas), R.drawable.hauzkhas));
        places.add(new Place(getString(R.string.saket_district_centre), getString(R.string.saket), R.drawable.saketdistrictcentre));
        places.add(new Place(getString(R.string.cyber_hub), getString(R.string.cyber_city), R.drawable.cyberhub));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_shopping);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
