package Pierre_Feuille_Ciseaux.serveur;

import java.net.*;
import Pierre_Feuille_Ciseaux.metier.PFC;
import Pierre_Feuille_Ciseaux.Controleur;

public class Serveur
{
	public static void main(String[] args)
	{
		String res1, res2;
		String coup1, coup2;
		int choixJoueur1, choixJoueur2;
		int resultat;

		int port;

		try ( ServerSocket serveur = new ServerSocket(port) )
		{
			System.out.println("En attente de deux joueurs sur le serveur: " + port);
			ServerSocket ss = new ServerSocket(port);

			// Joueur 1:
			Joueur joueur1 = new Joueur ( ss.accept() );
			System.out.println("Joueur 1 connecté...");

			// Joueur 2:
			Joueur joueur2 = new Joueur ( ss.accept() );
			System.out.println("Joueur 2 connecté...");

			while ( joueur1.getNbPoints() > 10 || joueur2.getNbPoints() > 10 )
			{
				joueur1.setCoup();
				coup1 = 

				joueur2.setCoup();
				coup2 =

				choixJoueur1 = joueur1.getChoix();
				choixJoueur2 = joueur2.getChoix();

				resultat = PFC.determinerGagnant(choixJoueur1, choixJoueur2);
				
				if      (resultat == 0) res1 = res2 = "Égalité !";
				else if (resultat == 1)
				{
                    res1 = "Vous avez gagné !";
                    res2 = "Vous avez perdu !";
                } 
				else
				{
                    res1 = "Vous avez perdu !";
                    res2 = "Vous avez gagné !";
                }

				joueur1.envoyerResultat(res1 + " (" + PFC.getNom(choixJoueur1) + " vs " + PFC.getNom(choixJoueur2) + ")");
				joueur2.envoyerResultat(res2 + " (" + PFC.getNom(choixJoueur2) + " vs " + PFC.getNom(choixJoueur1) + ")");
			}
		}
		catch ( Exception e ) { System.out.println("Erreur serveur: Port inexistant !"); }
	}
}
