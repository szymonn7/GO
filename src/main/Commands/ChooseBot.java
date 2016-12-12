package main.Commands;

import main.BOT;
import main.Player;
import main.States.OpponentFoundState;
import main.color;

import java.io.Serializable;
import java.util.Random;

/**
 * Akcja odopowiedzialna za sparowanie z Botem
 */
public class ChooseBot implements Command, Serializable {
    private static Random generator = new Random();
    @Override
    public void Execute(Player player) {
        player.CurrentGame.player2 = new BOT();
        player.opponent=player.CurrentGame.player2;
        player.opponent.CurrentGame=player.CurrentGame;
        player.opponent.opponent=player;
        if(generator.nextBoolean()){
            player.color = color.Black;
            player.opponent.color = color.White;
        }
        else{
            player.color = color.White;
            player.opponent.color = color.Black;
        }
        player.CurrentGame.player1.update(new OpponentFoundState(player.CurrentGame.player1.color, player.CurrentGame.LocalModel.GetBoard().length));
        player.CurrentGame.player2.update(new OpponentFoundState(player.CurrentGame.player2.color, player.CurrentGame.LocalModel.GetBoard().length));
    }
}
