package Pierre_Feuille_Ciseaux.metier;

import Pierre_Feuille_Ciseaux.serveur.Joueur;

public class PFC
{
	private static final int PIERRE  = 0;
	private static final int FEUILLE = 1;
	private static final int CISEAUX = 2;

	private int nbTour;

	public PFC()
	{
		this.nbTour = 0;
	}

	public static int determinerGagnant(int choix1, int choix2)
	{
		if ( choix1 == choix2) return 0;

		if ( choix1 == PFC.PIERRE  && choix2 == PFC.FEUILLE  || 
			 choix1 == PFC.FEUILLE && choix2 == PFC.PIERRE   ||
			 choix1 == PFC.CISEAUX && choix2 == PFC.FEUILLE     ) return 1;
			
		return 2;
	}

	public static String getNom(int choix)
	{
		switch (choix) 
		{
			case 0  -> { return "Piere"  ; }
			case 1  -> { return "Feuille"; }
			case 2  -> { return "Ciseaux"; }
			default -> { return "Inconnu"; }
		}
	}
}
