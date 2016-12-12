package main.Commands;

import main.Game;
import main.Player;
import main.Server;
import main.States.ChooseBoardSizeState;

import java.io.Serializable;

/**
 * Akcja odopowiedzialna za tworzenie nowej gry
 */
public class NewGame implements Command, Serializable {
    @Override
    public void Execute(Player player) {
        Game game = new Game();
        game.player1 = player;
        Server.ListOfGames.add(game);
        player.CurrentGame=game;
        player.update(new ChooseBoardSizeState());
    }
}
