package main.Commands;

/**
 * Akcja odopowiedzialna za utworzenie planszy o podanym rozmiarze
 */
public class ChooseSize implements Command{
    private Short size;
    ChooseSize(Short size){
        this.size=size;
    }
    @Override
    public void Execute() {

    }
}
