package connect4;

import java.util.Random;

/**
 * Created by alexa on 24/11/2016.
 */
public class Partie {
    private PlateauDeJeu plateauDeJeu;
    private Joueur joueur1;
    private Joueur joueur2;
    public Partie()
    {
        plateauDeJeu = new PlateauDeJeu();
        joueur1 = new Joueur("X");
        joueur2 = new Joueur("O");
    }

    public void start()
    {
        Boolean victoire = false;
        int nombreJetonUtilise = 0;
        Joueur joueuractuel = joueur1;
        while (nombreJetonUtilise < 42 && !victoire)
        {
            if (tourDeJeu(joueuractuel))
            {
                nombreJetonUtilise++;
                joueuractuel = interversionJoueur(joueuractuel);
                victoire = verifierVictoire();
            }
        }
    }

    private Boolean verifierVictoire()
    {
        return (plateauDeJeu.victoireDiagonaleDroite() || plateauDeJeu.victoireDiagonaleGauche() || plateauDeJeu.victoireHorizontale() || plateauDeJeu.victoireVertical());
    }

    private Joueur interversionJoueur(Joueur joueuractuel) {
        if (joueuractuel.getSymbole() == "X")
            return joueur2;
        else return joueur1;
    }

    private Boolean tourDeJeu(Joueur joueur) {
        Random ran = new Random();
        int choixJoueur = ran.nextInt(7)+1;
        try {
            plateauDeJeu.ajouterUnPiont(choixJoueur, joueur.getSymbole());
        }
        catch (PilePleineException pilePleineException){
            return false;
        }
        return true;
    }
}
