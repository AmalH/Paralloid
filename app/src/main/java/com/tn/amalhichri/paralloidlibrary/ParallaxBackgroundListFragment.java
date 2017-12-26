package com.tn.amalhichri.paralloidlibrary;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.tn.amalhichri.library.Parallaxor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * A dummy fragment representing a section of the app, but that simply
 * displays dummy text.
 */
public class ParallaxBackgroundListFragment extends Fragment {

    public ParallaxBackgroundListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_parallax_list_background, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final ListView listView = (ListView) view.findViewById(R.id.list_view);

        List<Map<String, String>> maps = new ArrayList<Map<String, String>>(50);
        Map<String, String> map;
        for (int i = 0; i < 50; i++) {
            map = new HashMap<String, String>();
            map.put("text", "Example Text " + i);
            maps.add(map);
        }

        SimpleAdapter adapter = new SimpleAdapter(
                getActivity(),
                maps,
                android.R.layout.simple_list_item_1,
                new String[]{"text"},
                new int[]{android.R.id.text1});

        listView.setAdapter(adapter);

        // Set the background after the setting the Adapter, it shouldn't matter until the view is drawn.
        // If you have difficulty getting this to work, just make sure this is called after adapter is added/view drawn for
        // ListViews, they have a limited support unfortunately.
        if (listView instanceof Parallaxor) {
            ((Parallaxor) listView).parallaxViewBackgroundBy(listView, getResources().getDrawable(R.drawable.example_image), .25f);
        }
    }
}