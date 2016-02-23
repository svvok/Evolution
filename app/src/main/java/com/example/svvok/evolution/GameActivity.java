package com.example.svvok.evolution;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.svvok.evolution.models.Game;
import com.example.svvok.evolution.models.Player;

import java.util.ArrayList;

public class GameActivity extends AppCompatActivity {

    private static int[] playersViewIDs = new int[] {
            R.id.user_info,
            R.id.opponent1_info,
            R.id.opponent2_info,
            R.id.opponent3_info,
            R.id.opponent4_info,
            R.id.opponent5_info
    };

    private class PlayerViewHolder {
        private TextView name;
        private TextView points;
        private TextView cards;
        private TextView animals;

        PlayerViewHolder(View view) {
            view.setVisibility(View.VISIBLE);
            name = (TextView) view.findViewById(R.id.player_name);
            points = (TextView) view.findViewById(R.id.player_points_text);
            cards = (TextView) view.findViewById(R.id.player_cards_text);
            animals = (TextView) view.findViewById(R.id.player_animals_text);
        }

        void update(Player player) {
            name.setText(player.getNickname());
            points.setText(String.valueOf(player.getPoints()));
            cards.setText(String.valueOf(player.getCardsCount()));
            animals.setText(String.valueOf(player.getAnimalsCount()));
        }
    }

    private ArrayList<PlayerViewHolder> mPlayersViews;

    private ArrayList<Player> players = new ArrayList<>();
    {
        players.add(new Player("Настя"));
        players.add(new Player("Вика"));
        players.add(new Player("Женя"));
        players.add(new Player("Лис"));
    }
    private Player user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_game);

        user = new Player("Слауик");


        initPlayersInfo(user, players);


        Game game = new Game(user, players);




//        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
//
//        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.opponents_list);
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setAdapter(new OpponentsInfoAdapter(game.getOpponents()));
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    void initPlayersInfo(Player user, ArrayList<Player> players) {
        mPlayersViews = new ArrayList<>(players.size());
        mPlayersViews.add(new PlayerViewHolder(findViewById(playersViewIDs[0])));
        mPlayersViews.get(0).update(user);
        for (int i = 1; i <= players.size(); i++) {
            mPlayersViews.add(new PlayerViewHolder(findViewById(playersViewIDs[i])));
            mPlayersViews.get(i).update(players.get(i - 1));
        }
    }
}
