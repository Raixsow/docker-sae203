public class Joueur
{
	private Controleur ctrl;

	private int choix;
	private String nom;
	private int NbPoints;

	public Joueur(Controleur ctrl, String nom)
	{
		this.ctrl = ctrl;
		this.nom  = nom;
	}

	public void setChoix(int choix) { this.choix = this.ctrl.setChoix();}

	public int    getChoix   () { return this.choix   ; }
	public String getNom     () { return this.nom     ; }
	public int    getNbPoints() { return this.NbPoints; }

}