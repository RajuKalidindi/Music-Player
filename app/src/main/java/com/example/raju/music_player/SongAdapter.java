package com.example.raju.music_player;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.Holder> {

    ArrayList<SongData> songData;
    Context context;
    OnItemClickListener onItemClickListener;

    SongAdapter(Context context, ArrayList<SongData> songData){
        this.context = context;
        this.songData = songData;
    }

    public interface OnItemClickListener {
        void onClick(Button button, View view, SongData songData, int pos);
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.song_row, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final Holder holder, final int position) {
        final SongData ob = songData.get(position);
        holder.song.setText(ob.sname);
        holder.artist.setText(ob.artist);
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(onItemClickListener != null){
                    onItemClickListener.onClick(holder.button, v, ob, position);
                }
            }
        });
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
