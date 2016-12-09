package main.States;

/**
 * Interface do stanów opisujących wygląd GUI
 */
public interface State {
    /**
     * metoda wykonywana gdy GUI przechodzi w dany stan
     */
    public void startstate();

    /**
     * metda wykonywana gdy GUI wychodzi z danego stanu
     */
    public void endstate();
}
