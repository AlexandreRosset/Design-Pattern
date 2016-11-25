package connect4;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

/**
 * Created by alexa on 25/11/2016.
 */
public class Affichage {
    public void afficherPlateau(CaseDePlateau[][] plateau) {
        for (int j = 0; j < 6; j++) {
            System.out.print("||");
            for (int i = 0; i < 7; i++) {
                System.out.print(plateau[i][j].getValeur());
                System.out.print("|");
            }
            System.out.println("|");
        }
        System.out.println("  1 2 3 4 5 6 7");
        System.out.println();
    }

    public void afficherVictoire(Joueur joueur)
    {
        System.out.println("Les " + joueur.getSymbole() + " ont gagnés!");
    }

    public void afficherEgalite()
    {
        System.out.println("Il y a eu match nul!");
    }

    public int choixDuJoueur(Joueur joueurActuel)
    {
        System.out.println("Aux " + joueurActuel.getSymbole() + " de jouer, choisissez une colonne:");
        Scanner scanner = new Scanner(System.in);
        int choixcolonne = Integer.parseInt(scanner.nextLine());
        return choixcolonne;
    }

    public void afficherMessageColonnePleine()
    {
        System.out.println("La colonne est pleine, choisissez une autre colonne.");
    }

    public void afficherMessageHorsDuTableau()
    {
        System.out.println("Vous ne pouvez pas jouer en dehors du tableau, choisissez une autre colonne.");
    }

    public void afficherMessageMauvaiseEntre()
    {
        System.out.println("Il faut rentrer un nombre encre 1 et 7.");
    }
}
