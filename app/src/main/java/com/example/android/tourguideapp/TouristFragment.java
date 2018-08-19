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
public class TouristFragment extends Fragment {


    public TouristFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.india_gate), getString(R.string.central_secretariat), R.drawable.indiagate));
        places.add(new Place(getString(R.string.humayun_tomb), getString(R.string.khan_market), R.drawable.humayuntomb));
        places.add(new Place(getString(R.string.red_fort), getString(R.string.chandni_chowk), R.drawable.redfort));
        places.add(new Place(getString(R.string.qutab_minar), getString(R.string.qutab_minar), R.drawable.qutubminar));
        places.add(new Place(getString(R.string.purana_qila), getString(R.string.pragati_maidan), R.drawable.puranaqila));
        places.add(new Place(getString(R.string.agrasen_ki_baoli), getString(R.string.barakhamba_road), R.drawable.agrasenkibaoli));
        places.add(new Place(getString(R.string.jantar_mantar), getString(R.string.rajiv_chowk), R.drawable.jantarmantar));
        places.add(new Place(getString(R.string.national_museum), getString(R.string.central_secretariat), R.drawable.nationalmuseum));
        places.add(new Place(getString(R.string.parliament_house), getString(R.string.central_secretariat), R.drawable.parliamenthouse));
        places.add(new Place(getString(R.string.rashtrapati_bhawan), getString(R.string.central_secretariat), R.drawable.rashtrapatibhawan));
        places.add(new Place(getString(R.string.safdarjung_tomb), getString(R.string.jorbagh), R.drawable.safdarjungtomb));
        places.add(new Place(getString(R.string.the_garden_of_five_senses), getString(R.string.saket), R.drawable.thegardenoffivesenses));
        places.add(new Place(getString(R.string.tughlaqabad_fort), getString(R.string.tughlakabad), R.drawable.tughlaqabadfort));
        places.add(new Place(getString(R.string.okhla_bird_sanctuary), getString(R.string.okhla_bird_sanctuary), R.drawable.okhlabirdsanctury));
        places.add(new Place(getString(R.string.shanti_vana), getString(R.string.jama_masjid), R.drawable.shantivana));
        places.add(new Place(getString(R.string.raj_ghat), getString(R.string.delhi_gate), R.drawable.rajghat));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_tourist);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
