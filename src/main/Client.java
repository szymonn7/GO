package main;

import main.Commands.Command;
import main.States.State;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * Klasa klient
 */
public class Client {
    private GUI MyGui;
    //private color player;
    private static int PORT = 8901;
    private Socket socket;
    ObjectInputStream in;
    ObjectOutputStream out;

    /**
     * konstruktor
     * @param ServerAddress
     * @throws Exception
     */
    public Client(String ServerAddress) throws Exception{
        socket = new Socket(ServerAddress, PORT);
        in = new ObjectInputStream(socket.getInputStream());
        out = new ObjectOutputStream(socket.getOutputStream());
        SetListeners();
    }
    /**
     * Funkcja odpowiedzialna za ustawienie komunikacji do servera
     */
    private void SetListeners(){
        MyGui.Board.addMouseListener(new MouseAdapter(){});
        MyGui.NewGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        MyGui.JoinGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        MyGui.ChoosePlayer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        MyGui.ChooseBot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        MyGui.Choose19x19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        MyGui.Choose13x13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        MyGui.Choose9x9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        MyGui.YouPlayAs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        MyGui.Pass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        MyGui.GiveUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        MyGui.ConfirmDead.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        MyGui.Resume.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        MyGui.AcceptDead.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        MyGui.RefuseDead.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        MyGui.AcceptResults.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }
    /**
     * Funkcja wysyłająca komendę do servera
     */
    private void SendCommand(Command command){
        try{out.writeObject(command);}
        catch(Exception e){System.out.println("cos sie popsulo");}

    }

    /**
     * Funkcja zmieniająca GUI na podstawie komendy gracza
     */
    private void update(){
        while(true){
            try{
                Object obj = (Object) in.readObject();
                if(obj instanceof State){
                    MyGui.SetState((State) obj);
                }
                else if(obj instanceof Stone[][]){
                    MyGui.Repaint((Stone[][]) obj);
                }
            }
            catch(Exception e){System.out.println("cos sie popsulo");}
        }
    }

}
