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
    public JPanel Board;
    /**
     * zmienna przechowująca w jakim stanie znajduje się GUI
     */
    private State state;
    /**
     * zmienna przehowująca rozmiar planszy
     */
    public int size;
    /**
     * Przyciski, powiadomienia itp. wyświetlane w różnych stanach GUI
     */
    public Button NewGame;
    public Button JoinGame;
    public Button ChoosePlayer;
    public Button ChooseBot;
    public Button Choose19x19;
    public Button Choose13x13;
    public Button Choose9x9;
    public Label WaitingForOpponent;
    public Button YouPlayAs;
    public Button Pass;
    public Button GiveUp;
    public Label ChooseDead;
    public Button ConfirmDead;
    public Button Resume;
    public Button AcceptDead;
    public Button RefuseDead;
    public Button AcceptResults;
    /**
     * konstruktor GUI
     */
    public GUI(){
        Board = new JPanel();
        //state = new State();
        NewGame = new Button("NOWA GRA");
        NewGame.setBounds(50,650,100,30);
        add(NewGame);

        JoinGame = new Button("DOŁĄCZ");
        JoinGame.setBounds(50,650,100,30);
        add(JoinGame);

        ChoosePlayer = new Button("WYBIERZ GRACZA");
        ChoosePlayer.setBounds(50,650,100,30);
        add(ChoosePlayer);

        ChooseBot = new Button("WYBIERZ BOTA");
        ChooseBot.setBounds(50,50,50,50);
        add(ChooseBot);

        Choose19x19 = new Button("19x19");
        Choose19x19.setBounds(50,50,50,50);
        add(Choose19x19);

        Choose13x13 = new Button("19x19");
        Choose13x13.setBounds(50,50,50,50);
        add(Choose13x13);

        Choose9x9 = new Button("19x19");
        Choose9x9.setBounds(50,50,50,50);
        add(Choose9x9);

        WaitingForOpponent = new Label("COS");
        WaitingForOpponent.setBounds(50,50,50,50);
        add(WaitingForOpponent);

        YouPlayAs = new Button("Wybor koloru?");
        WaitingForOpponent.setBounds(50,50,50,50);
        add(WaitingForOpponent);

        Pass = new Button("Pass");
        Pass.setBounds(50,50,50,50);
        add(Pass);

        GiveUp = new Button("Poddaje sie");
        GiveUp.setBounds(50,50,50,50);
        add(GiveUp);

        ChooseDead = new Label("LOL");
        ChooseDead.setBounds(50,50,50,50);
        add(ChooseDead);

        ConfirmDead = new Button("Zatwierd zsmierc");
        ConfirmDead.setBounds(50,50,50,50);
        add(ConfirmDead);

        Resume = new Button("Wznow");
        Resume.setBounds(50,50,50,50);
        add(Resume);

        AcceptDead = new Button("Akceptuj śmierć");
        AcceptDead.setBounds(50,50,50,50);
        add(AcceptDead);

        RefuseDead = new Button("Odrzuć śmierć");
        RefuseDead.setBounds(50,50,50,50);
        add(RefuseDead);

        AcceptResults = new Button("AKCEPTUJ");
        AcceptResults.setBounds(50,50,50,50);
        add( AcceptResults);

    }
    /**
    * funkcja aktualizująca wygląd planszy
    */
    public void Repaint(Stone[][] board){

    }

    /**
     * funkcja zmieniająca stan GUI wraz z jego wyglądem
     */
    public void SetState(State newstate){
        if(this.state!=null) {
            this.state.EndState();
        }
        this.state = newstate;
        this.state.StartState();

    }

}