import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class Serveur
{
	public static void main(String[] args)
	{
		String res1, res2;
		String coup1, coup2;
		int choixJoueur1, choixJoueur2;
		int resultat;

		int port = 45369;

		while ( true )
		{
			try
			{
				System.out.println("En attente de deux joueurs sur le serveur : " + port);
				ServerSocket ss = new ServerSocket(port);

				// Joueur 1:
				Socket client1 = ss.accept();
				System.out.println("Joueur 1 connecte...");
				PrintWriter out = new PrintWriter(client1.getOutputStream(), true);
				BufferedReader in = new BufferedReader(new InputStreamReader(client1.getInputStream()));
				out.println("Joueur 1 connecte...");

				// Joueur 2:
				Socket client2 = ss.accept();
				System.out.println("Joueur 2 connecte...");
				PrintWriter out2 = new PrintWriter(client2.getOutputStream(), true);
				BufferedReader in2 = new BufferedReader(new InputStreamReader(client2.getInputStream()));
				out2.println("Joueur 2 connecte...");

				/*
				while ( joueur1.getNbPoints() > 10 || joueur2.getNbPoints() > 10 )
				{
					joueur1.setChoix();
					joueur2.setChoix();

					choixJoueur1 = joueur1.getChoix();
					choixJoueur2 = joueur2.getChoix();

					resultat = PFC.determinerGagnant(choixJoueur1, choixJoueur2);
					
					if (resultat == 0) 
					{
						res1 = res2 = "Egalite !";
					}
					else if (resultat == 1)
					{
						res1 = "Vous avez gagne !";
						joueur1.recevoirResultat(res1);

						res2 = "Vous avez perdu !";
						joueur2.recevoirResultat(res2);
					} 
					else
					{
						res1 = "Vous avez perdu !";
						joueur1.recevoirResultat(res1);

						res2 = "Vous avez gagne !";
						joueur2.recevoirResultat(res2);
					}
				}
				*/

				client1.close();
				client2.close();
			}
			catch ( Exception e ) { System.out.println("Erreur serveur: Port inexistant !"); }
		}
	}
}
