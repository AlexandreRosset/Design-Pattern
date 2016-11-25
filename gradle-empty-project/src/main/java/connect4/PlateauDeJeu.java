package connect4;

/**
 * Created by alexa on 24/11/2016.
 */
public class PlateauDeJeu {
    public CaseDePlateau[][] getPlateauDeJeu() {
        return plateauDeJeu;
    }

    private CaseDePlateau[][] plateauDeJeu;

    public PlateauDeJeu() {
        plateauDeJeu = new CaseDePlateau[7][6];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 6; j++) {
                plateauDeJeu[i][j] = new CaseDePlateau();
            }
        }
    }

    public void ajouterUnPiont(int numerosColonne, String symboleJoueur) {
        if (numerosColonne < 1 || numerosColonne > 7) {
            throw new HorsDuTableauException();
        }
        modifierLeTableau(numerosColonne, symboleJoueur);
    }

    public Boolean victoireHorizontale()
    {
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                if (plateauDeJeu[i][j].getValeur() != " "
                        && plateauDeJeu[i][j].getValeur() == plateauDeJeu[i+1][j].getValeur()
                        && plateauDeJeu[i+1][j].getValeur() == plateauDeJeu[i+2][j].getValeur()
                        && plateauDeJeu[i+2][j].getValeur() == plateauDeJeu[i+3][j].getValeur())
                {

                    return true;
                }
            }
        }
        return false;
    }

    public Boolean victoireDiagonaleGauche()
    {
        for (int i = 3; i < 7; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (plateauDeJeu[i][j].getValeur() != " "
                        && plateauDeJeu[i][j].getValeur() == plateauDeJeu[i-1][j+1].getValeur()
                        && plateauDeJeu[i-1][j+1].getValeur() == plateauDeJeu[i-2][j+2].getValeur()
                        && plateauDeJeu[i-2][j+2].getValeur() == plateauDeJeu[i-3][j+3].getValeur())
                {
                    return true;
                }
            }
        }
        return false;
    }

    public Boolean victoireDiagonaleDroite()
    {
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (plateauDeJeu[i][j].getValeur() != " "
                        && plateauDeJeu[i][j].getValeur() == plateauDeJeu[i+1][j+1].getValeur()
                        && plateauDeJeu[i+1][j+1].getValeur() == plateauDeJeu[i+2][j+2].getValeur()
                        && plateauDeJeu[i+2][j+2].getValeur() == plateauDeJeu[i+3][j+3].getValeur())
                {
                    return true;
                }
            }
        }
        return false;
    }

    public Boolean victoireVertical()
    {
        for (int i = 0; i < 7; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (plateauDeJeu[i][j].getValeur() != " "
                        && plateauDeJeu[i][j].getValeur() == plateauDeJeu[i][j +1].getValeur()
                        && plateauDeJeu[i][j+1].getValeur() == plateauDeJeu[i][j+2].getValeur()
                        && plateauDeJeu[i][j+2].getValeur() == plateauDeJeu[i][j+3].getValeur())
                {
                    return true;
                }
            }
        }
        return false;
    }

    private void modifierLeTableau(int colonne, String symboleJoueur) {
        int j = 5;
        boolean piecePlace = false;
        while (j >= 0 && !piecePlace) {
            if (plateauDeJeu[colonne - 1][j].getValeur() == " ") {
                plateauDeJeu[colonne - 1][j].setValeur(symboleJoueur);
                piecePlace = true;
            }else {
                j--;
            }
        }
        if (!piecePlace) {
            throw new PilePleineException();
        }
    }
}
