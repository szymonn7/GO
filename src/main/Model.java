package main;

import main.States.State;

/**
 * Klasa odpowiedzialna za logike
 */
public class Model {
    private Stone[][] Board;
    private Stone[][] HelperBoard;
    //private color Turn;
    //private State state;
    /**
     * konstruktor
     */
    public Model(short size){
        HelperBoard = new Stone[size][size];
        Board = new Stone[size][size];
    }
    /**
     * funkcja sprawdzajaca czy kamien ma oddechy
     */
    private boolean CheckForBreaths(Stone stone){

    }
    /**
     * Funkcja sprawdzająca legalnosc ruchu
     */
    public boolean ValidMove(int x, int y, color player){
        if(Board [x][y]!=null){
            return false;
        }
        else if(player == player.Black){
            Board[x][y]=Stone.Black;
        }
        else if(player == player.White){
            Board[x][y]=Stone.White;
        }
        if()
    }
    /**
     * Funkcje zwracające informacje o rozgrywce
     */
    public Stone[][] GetBoard(){return Board;}
    //private color GetTurn(){return Turn;}
    //private State GetState(){return state;}
}
