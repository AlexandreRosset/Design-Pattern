package connect4;

/**
 * Created by alexa on 24/11/2016.
 */
public class Joueur {
    private String symbole;

    public Joueur(String symbole)
    {
        if (symbole != "X" && symbole != "O")
        {
            throw new MauvaisSymboleException();
        }
        this.symbole = symbole;
    }

    public String getSymbole() {
        return  symbole;
    }
}
