package main;

import main.States.State;

/**
 * Klasa odpowiedzialna za logike
 */
public class Model {
    private Stone[][] Board;
    private color Turn;
    private State state;
    /**
     * Funkcje zwracające informacje o rozgrywce
     */
    private Stone[][] GetBoard(){return Board;}
    private color GetTurn(){return Turn;}
    private State GetState(){return state;}
}
