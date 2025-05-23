public class PFC
{
	private static final int PIERRE  = 0;
	private static final int FEUILLE = 1;
	private static final int CISEAUX = 2;

	public static int determinerGagnant(int choix1, int choix2)
	{
		if ( choix1 == choix2) return 0; // Egalite

		if ( choix1 == PFC.PIERRE  && choix2 == PFC.CISEAUX  || 
			 choix1 == PFC.FEUILLE && choix2 == PFC.PIERRE   ||
			 choix1 == PFC.CISEAUX && choix2 == PFC.FEUILLE     ) return 1; // Joueur 1 gagnant
			 
		return 2; // Joueur 2 gagnant
	}
}
