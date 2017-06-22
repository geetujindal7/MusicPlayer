package com.example.hi.musicplayer;

import android.view.View;
import android.widget.Toast;

public class ArtistClickListener implements View.OnClickListener {
    @Override
    public void onClick(View view)
    {
        Toast.makeText(view.getContext(), "list of music ", Toast.LENGTH_SHORT).show();
    }
}
