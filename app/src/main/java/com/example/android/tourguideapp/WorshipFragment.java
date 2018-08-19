package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class WorshipFragment extends Fragment {


    public WorshipFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.akshardham_temple), getString(R.string.akshardham), R.drawable.akshardham));
        places.add(new Place(getString(R.string.jama_masjid), getString(R.string.chandni_chowk), R.drawable.jamamasjid));
        places.add(new Place(getString(R.string.lotus_temple), getString(R.string.nehru_place), R.drawable.lotustemple));
        places.add(new Place(getString(R.string.bangla_sahib), getString(R.string.patel_chowk), R.drawable.banglasahib));
        places.add(new Place(getString(R.string.sacred_heart_cathedral), getString(R.string.patel_chowk), R.drawable.sacredheartcathedral));
        places.add(new Place(getString(R.string.sisganj), getString(R.string.lal_quila), R.drawable.sisganj));
        places.add(new Place(getString(R.string.iskcon), getString(R.string.kailash_colony), R.drawable.iskcon));
        places.add(new Place(getString(R.string.laxminarayan_temple), getString(R.string.rk_ashram_marg), R.drawable.laxminarayan));
        places.add(new Place(getString(R.string.nizamuddin_dargah), getString(R.string.jangpura), R.drawable.nizamuddin));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_worship);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
