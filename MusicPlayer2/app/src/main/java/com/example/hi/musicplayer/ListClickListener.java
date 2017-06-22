 package com.example.hi.musicplayer;

import android.view.View;
import android.widget.Toast;

/**
 * Created by hi on 28-02-2017.
 */
public class ListClickListener implements View.OnClickListener {
    @Override
    public void onClick(View view)
    {
        Toast.makeText(view.getContext(), "list of music ", Toast.LENGTH_SHORT).show();
    }
}
