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
