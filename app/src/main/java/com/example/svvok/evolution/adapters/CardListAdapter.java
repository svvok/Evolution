package com.example.svvok.evolution.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.svvok.evolution.R;
import com.example.svvok.evolution.models.Card;
import com.example.svvok.evolution.models.Player;

import java.util.ArrayList;

/**
 * Created by svvok on 17.02.2016.
 */
public class CardListAdapter extends RecyclerView.Adapter<CardListAdapter.ViewHolder> {
    private ArrayList<Card> cards;

    public CardListAdapter(ArrayList<Card> cards) {
        this.cards = cards;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.player_info, null);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Card card = cards.get(position);
        holder.characteristic_1.setText(card.getCharacteristic1().);
        holder.characteristic_2.setText(String.valueOf(card.getPoints()));
    }

    @Override
    public int getItemCount() {
        return cards.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        protected TextView characteristic_1;
        protected TextView characteristic_2;

        private ViewHolder(View v) {
            super(v);
            this.characteristic_1 = (TextView) v.findViewById(R.id.characteristic_1);
            this.characteristic_2 = (TextView) v.findViewById(R.id.characteristic_2);
        }
    }
}
