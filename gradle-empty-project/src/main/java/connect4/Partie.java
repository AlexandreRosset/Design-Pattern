package connect4;

/**
 * Created by alexa on 24/11/2016.
 */
public class Partie {
    private PlateauDeJeu plateauDeJeu;
    private Joueur joueur1;
    private Joueur joueur2;
    private Affichage affichage;


    public Partie() {
        plateauDeJeu = new PlateauDeJeu();
        joueur1 = new Joueur("X");
        joueur2 = new Joueur("O");
        affichage = new Affichage();
    }

    public void start() {
        Boolean victoire = false;
        int nombreJetonUtilise = 0;
        Joueur joueuractuel = joueur1;
        affichage.afficherPlateau(plateauDeJeu.getPlateauDeJeu());
        while (nombreJetonUtilise < 42 && !victoire) {

            if (tourDeJeu(joueuractuel)) {
                nombreJetonUtilise++;
                affichage.clearConsole();
                affichage.afficherPlateau(plateauDeJeu.getPlateauDeJeu());
                victoire = verifierEtAfficherVictoire(nombreJetonUtilise, joueuractuel);
                joueuractuel = interversionJoueur(joueuractuel);
            }

            else{
                affichage.afficherPlateau(plateauDeJeu.getPlateauDeJeu());
            }
        }
    }

    private Boolean verifierEtAfficherVictoire(int nombreJetonUtilise, Joueur joueuractuel) {
        Boolean victoire = (plateauDeJeu.victoireDiagonaleDroite() || plateauDeJeu.victoireDiagonaleGauche() || plateauDeJeu.victoireHorizontale() || plateauDeJeu.victoireVertical());
        if (victoire) {
            affichage.afficherVictoire(joueuractuel);
        }else if (nombreJetonUtilise >= 42){
            affichage.afficherEgalite();
        }
        return victoire;
    }

    private Joueur interversionJoueur(Joueur joueuractuel) {
        if (joueuractuel.getSymbole() == "X")
            return joueur2;
        else return joueur1;
    }

    private Boolean tourDeJeu(Joueur joueur) {
        int choixJoueur;
        try {
            choixJoueur = affichage.tourDuJoueur(joueur);
        }catch (NumberFormatException numberFormatException) {
            affichage.clearConsole();
            affichage.afficherMessageMauvaiseEntre();
            return false;
        }
        try {
            plateauDeJeu.ajouterUnPiont(choixJoueur, joueur.getSymbole());
        }
        catch (PilePleineException pilePleineException){
            affichage.clearConsole();
            affichage.afficherMessageColonnePleine();
            return false;
        }
        catch (HorsDuTableauException horsDuTableauException){
            affichage.clearConsole();
            affichage.afficherMessageHorsDuTableau();
            return false;
        }
        return true;
    }
}
