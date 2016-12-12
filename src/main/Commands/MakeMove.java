package main.Commands;

import main.Player;

import java.io.Serializable;

/**
 * Akcja odopowiedzialna za wykonanie ruchu
 */
public class MakeMove implements Command, Serializable {
    private int x;
    private int y;
    MakeMove(int x, int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public void Execute(Player player) {

    }
}
