package main.Commands;

import main.*;
import main.States.OpponentFoundState;

import java.io.Serializable;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Akcja odpowiedzialna za dołączenie do istniejącej gry
 */
public class JoinGame implements Command, Serializable {
    private static Random generator = new Random();
    @Override
    public void Execute(Player player) {
        while(true) {
            for (Game game : Server.ListOfGames) {
                if (game.freespace) {
                    game.player2 = player;
                    game.player2.CurrentGame=game;
                    game.player2.opponent=game.player1;
                    game.player1.opponent=game.player2;
                    if(generator.nextBoolean()){
                        game.player1.color = color.Black;
                        game.player2.color = color.White;
                    }
                    else{
                        game.player1.color = color.White;
                        game.player2.color = color.Black;
                    }
                    game.player1.update(new OpponentFoundState(game.player1.color, game.LocalModel.GetBoard().length));
                    game.player2.update(new OpponentFoundState(game.player2.color, game.LocalModel.GetBoard().length));
                    return;
                }
            }
            try {
                TimeUnit.SECONDS.sleep(1);
            }
            catch(Exception e){System.out.println("cos sie popsulo");}
        }
    }
}
