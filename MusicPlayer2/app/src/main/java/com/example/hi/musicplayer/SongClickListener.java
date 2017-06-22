package com.example.hi.musicplayer;

import android.view.View;
import android.widget.Toast;

public class SongClickListener implements View.OnClickListener
{
    @Override
    public void onClick(View view)
    {
        Toast.makeText(view.getContext(), "song of music ", Toast.LENGTH_SHORT).show();

    }
}