package com.example.svvok.evolution.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.svvok.evolution.R;
import com.example.svvok.evolution.models.Player;

import java.util.ArrayList;

/**
 * Created by svvok on 17.02.2016.
 */
public class OpponentsInfoAdapter extends RecyclerView.Adapter<OpponentsInfoAdapter.ViewHolder> {
    private ArrayList<Player> players;

    public OpponentsInfoAdapter(ArrayList<Player> players) {
        this.players = players;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.player_info, null);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Player player = players.get(position);
        if (player.getAvatar() != null) {
            holder.avatar.setImageBitmap(player.getAvatar());
        }
        holder.name.setText(player.getNickname());
        holder.points.setText(String.valueOf(player.getPoints()));
        holder.cards.setText(String.valueOf(player.getCardsCount()));
        holder.animals.setText(String.valueOf(player.getAnimalsCount()));
    }

    @Override
    public int getItemCount() {
        return players.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        protected ImageView avatar;
        protected TextView name;
        protected TextView points;
        protected TextView cards;
        protected TextView animals;

        private ViewHolder(View v) {
            super(v);
            this.avatar = (ImageView) v.findViewById(R.id.player_avatar);
            this.name = (TextView) v.findViewById(R.id.player_name);
            this.points = (TextView) v.findViewById(R.id.player_points_text);
            this.cards = (TextView) v.findViewById(R.id.player_cards_text);
            this.animals = (TextView) v.findViewById(R.id.player_animals_text);
        }
    }
}
