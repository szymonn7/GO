package main.Commands;

import main.Player;

/**
 * Interface do komend wykonywanych na modelu
 */
public interface Command {
    public void Execute(Player player);
}
