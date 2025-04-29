public class Joueur
{
	private int choix;
	private String nom;
	private int nbPoints;

	public Joueur(String nom)
	{
		this.nom      = nom;
		this.nbPoints = 0;
	}

	public void setChoix(int choix)   { this.choix = choix;}
	public void setPoint() { this.nbPoints++; }

	public int    getChoix   () { return this.choix   ; }
	public String getNom     () { return this.nom     ; }
	public int    getNbPoints() { return this.nbPoints; }
}