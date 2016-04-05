package net.cloudcentrik.gbgcitytourguide;

/**
 * Created by Packard Bell on 2016-04-04.
 */

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class OverviewFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_overview, container, false);

        Resources res1 = getResources();
        String[] stadMuseum1 = res1.getStringArray(R.array.stad_museam_maritiman);

        final TextView textView1 = (TextView) rootView.findViewById(R.id.txtStadMuseumOverview);
        textView1.setText(stadMuseum1[1]);

        return rootView;
    }
}