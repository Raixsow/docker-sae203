package Pierre_Feuille_Ciseaux.metier;

import Pierre_Feuille_Ciseaux.Controleur;

public class Joueur
{
	private int choix;
	private Controleur ctrl;
	private String nom;

	public Joueur(Controleur ctrl, String nom)
	{
		this.ctrl = ctrl;
	}

	public void setChoix(int choix) { this.choix = this.ctrl.setChoix();}

	public int getChoix() { return this.choix; }
}