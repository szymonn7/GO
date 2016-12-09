package main;

import main.States.State;

import javax.swing.*;
import java.awt.*;

/**
 * Interfejs użytkownika
 */
public class GUI extends JFrame{
    /**
     * panel na którym będzie rysowana plansza
     */
    private JPanel Board;
    /**
     * zmienna przechowująca w jakim stanie znajduje się GUI
     */
    private State state;
    /**
     * Przyciski, powiadomienia itp. wyświetlane w różnych stanach GUI
     */
    private Button NewGame;
    private Button JoinGame;
    private Button ChoosePlayer;
    private Button ChooseBot;
    private Button Choose19x19;
    private Button Choose13x13;
    private Button Choose9x9;
    private Label WaitingForOpponent;
    private Button YouPlayAs;
    private Button Pass;
    private Button GiveUp;
    private Label ChooseDead;
    private Button ConfirmDead;
    private Button Resume;
    private Button AcceptDead;
    private Button RefuseDead;
    private Button AcceptResults;
    /**
     * konstruktor GUI
     */
    public GUI(){
        Board = new JPanel();
        //state = new State();
        NewGame = new Button();
        JoinGame = new Button();
        ChoosePlayer = new Button();
        ChooseBot = new Button();
        Choose19x19 = new Button();
        Choose13x13 = new Button();
        Choose9x9 = new Button();
        WaitingForOpponent = new Label();
        YouPlayAs = new Button();
        Pass = new Button();
        GiveUp = new Button();
        ChooseDead = new Label();
        ConfirmDead = new Button();
        Resume = new Button();
        AcceptDead = new Button();
        RefuseDead = new Button();
        AcceptResults = new Button();
    }
    /**
    * funkcja aktualizująca wygląd planszy
    */
    private void Repaint(){

    }

    /**
     * funkcja zmieniająca stan GUI wraz z jego wyglądem
     */
    private void SetState(State newstate){
        this.state.endstate();
        this.state = newstate;
        this.state.startstate();

    }

}
