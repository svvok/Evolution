package com.example.svvok.evolution;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.svvok.evolution.models.Game;
import com.example.svvok.evolution.models.Player;

import java.util.ArrayList;

public class GameActivity extends AppCompatActivity {


    ArrayList<Player> players = new ArrayList<>();
    {
        players.add(new Player("Настя"));
        players.add(new Player("Вика"));
        players.add(new Player("Женя"));
        players.add(new Player("Лис"));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_game);

        Player me = new Player("Слауик");
        Game game = new Game(me, players);


//        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
//
//        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.opponents_list);
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setAdapter(new OpponentsInfoAdapter(game.getOpponents()));
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }
}
