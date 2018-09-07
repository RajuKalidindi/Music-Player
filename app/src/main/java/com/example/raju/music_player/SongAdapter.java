package com.example.raju.music_player;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.Holder> {

    ArrayList<SongData> songData;
    Context context;

    SongAdapter(Context context, ArrayList<SongData> songData){
        this.context = context;
        this.songData = songData;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.song_row, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return songData.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        TextView song,artist;
        Button button;
        public Holder(View itemView) {
            super(itemView);
            song = (TextView) itemView.findViewById(R.id.song);
            artist = (TextView) itemView.findViewById(R.id.artist);
            button = (Button) itemView.findViewById(R.id.button);
        }
    }
}
