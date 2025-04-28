package Pierre_Feuille_Ciseaux.metier;

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

	public int determinerGagnant(int choix1, int choix2)
	{
		if ( choix1 == choix2) return 0; // Egalité

		if ( choix1 == PFC.PIERRE  && choix2 == PFC.FEUILLE  || 
			 choix1 == PFC.FEUILLE && choix2 == PFC.PIERRE   ||
			 choix1 == PFC.CISEAUX && choix2 == PFC.FEUILLE     ) return 1; // Joueur 1 gagnant
			 
		return 2; // Joueur 2 gagnant
	}

	public String getNom(int choix)
	{
		switch (choix) 
		{
			case    PFC.PIERRE  -> { return "Piere"  ; }
			case    PFC.FEUILLE -> { return "Feuille"; }
			case    PFC.CISEAUX -> { return "Ciseaux"; }
			default             -> { return ""       ; }
		}
	}
}
