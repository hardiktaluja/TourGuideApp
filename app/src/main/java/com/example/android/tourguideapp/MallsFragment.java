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
public class MallsFragment extends Fragment {


    public MallsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.select_citywalk), getString(R.string.malviya_nagar), R.drawable.selectcitywalk));
        places.add(new Place(getString(R.string.dlf_promenade), getString(R.string.hauz_khas), R.drawable.dlfpromenade));
        places.add(new Place(getString(R.string.ambience), getString(R.string.hauz_khas), R.drawable.ambiencevk));
        places.add(new Place(getString(R.string.dlf_emporio), getString(R.string.hauz_khas), R.drawable.dlfemporio));
        places.add(new Place(getString(R.string.the_great_india_place), getString(R.string.noida_sector_18), R.drawable.thegreatindiaplace));
        places.add(new Place(getString(R.string.dlf_mall_of_india), getString(R.string.noida_sector_18), R.drawable.dlfmallofindia));
        places.add(new Place(getString(R.string.ansal_plaza), getString(R.string.moolchand), R.drawable.ansalplaza));
        places.add(new Place(getString(R.string.pacific_mall), getString(R.string.subhash_nagar), R.drawable.pacificmall));
        places.add(new Place(getString(R.string.ambience), getString(R.string.moulsari_avenue), R.drawable.ambiencegurgaon));
        places.add(new Place(getString(R.string.metro_walk), getString(R.string.rithala), R.drawable.metrowalk));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_malls);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
