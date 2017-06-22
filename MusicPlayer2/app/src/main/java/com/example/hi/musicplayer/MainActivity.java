package com.example.hi.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListClickListener clickListener = new ListClickListener();
         TextView list = (TextView) findViewById(R.id.list_view);
        list.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent list_all = new Intent(MainActivity.this,list.class);
                startActivity(list_all);
            }
        });
        SongClickListener clickListener1 = new SongClickListener();
         TextView song = (TextView) findViewById(R.id.songs_view);
        song.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent album1 = new Intent(MainActivity.this,song.class);
                startActivity(album1);
            }
        });
        AlbumClickListener clickListener2 = new AlbumClickListener();
        TextView album = (TextView) findViewById(R.id.albums_view);
        album.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent album2 = new Intent(MainActivity.this,album.class);
                startActivity(album2);
            }
        });
        ArtistClickListener clickListener3 = new ArtistClickListener();
        TextView artist = (TextView) findViewById(R.id.artists_view);
        artist.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent artist1 = new Intent(MainActivity.this,artist.class);
                startActivity(artist1);
            }
        });
    }
    public void click(View view)
    {
        Intent intent = new Intent(MediaStore.INTENT_ACTION_MUSIC_PLAYER);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}