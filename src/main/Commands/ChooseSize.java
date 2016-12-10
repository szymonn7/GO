package main.Commands;

import java.io.Serializable;

/**
 * Akcja odopowiedzialna za utworzenie planszy o podanym rozmiarze
 */
public class ChooseSize implements Command, Serializable {
    private Short size;
    ChooseSize(Short size){
        this.size=size;
    }
    @Override
    public void Execute() {

    }
}
