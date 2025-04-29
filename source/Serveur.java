import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.*;

public class Serveur
{
	public static void main(String[] args)
	{
		Joueur joueur1, joueur2;
		joueur1 = joueur2 = null;

		String res1, res2;
		String coup1, coup2;
		int choixJoueur1, choixJoueur2;
		int resultat;

		int port = 46035;

		try
		{
			ServerSocket ss = new ServerSocket(port);

			while ( true )
			{
				System.out.println("En attente de deux joueurs sur le serveur : " + port);

				/* -------- */
				/* Joueur 1 */
				/* ---------*/
				Socket client1 = ss.accept();
				System.out.println("Joueur 1 connecte...");
				PrintWriter out = new PrintWriter(client1.getOutputStream(), true);
				BufferedReader in = new BufferedReader(new InputStreamReader(client1.getInputStream()));
				out.println("1 connecte...");

				/* -------- */
				/* Joueur 2 */
				/* ---------*/
				Socket client2 = ss.accept();
				System.out.println("Joueur 2 connecte...");
				PrintWriter out2 = new PrintWriter(client2.getOutputStream(), true);
				BufferedReader in2 = new BufferedReader(new InputStreamReader(client2.getInputStream()));
				out2.println("2 connecte...");

				System.out.println("Les deux joueurs sont arrivés");

				/* --------------- */
				/* Joueur Connecte */
				/* --------------- */
				String joueur1Connecte = in.readLine();
				String joueur2Connecte = in2.readLine();

				joueur1 = new Joueur( "Joueur 1" );
				joueur2 = new Joueur( "Joueur 2" );

				/* ----------------------------- */
				/* Jeu du Pierre-Feuille-Ciseaux */
				/* ----------------------------- */
				int cptManche = 1;

				while (joueur1.getNbPoints() < 10 && joueur2.getNbPoints() < 10)
				{
					System.out.println("Commençons avec la manche n°" + cptManche);

					out.println ( "Choisissez Pierre (0), Feuille (1) ou Ciseaux(2)" );
					out2.println( "Choisissez Pierre (0), Feuille (1) ou Ciseaux(2)" );

					try
					{ 
						int choix1 = Integer.parseInt( in.readLine()  );
						int choix2 = Integer.parseInt( in2.readLine() );

						joueur1.setChoix( choix1 );
						joueur2.setChoix( choix2 );

						choixJoueur1 = joueur1.getChoix();
						choixJoueur2 = joueur2.getChoix();
	
						resultat = PFC.determinerGagnant(choixJoueur1, choixJoueur2);

						if (resultat == 0) 
						{
							res1 = res2 = "Egalite !";
						}
						else if (resultat == 1)
						{
							res1 = "Joueur 1";
							res2 = "Joueur 2";
						} 
						else
						{
							res1 = "Joueur 2";
							res2 = "Joueur 1";
						}
	
						System.out.println( "Le gagnant de cette manche est : " + res1 + " VS " + res2 );
						if   ( res1.equals( "joueur 1" ) ) joueur1.setPoint();
						else                                        joueur2.setPoint();
					} 
					catch ( IOException e ) 
					{ 
						System.out.println( "Erreur de saisie d'un des joueurs" ); continue;
					}

					cptManche++;
				}

				if ( joueur1.getNbPoints() == 10 ) 
				{
					out .println("Joueur 1 a gagné !");
					out2.println("Joueur 1 a gagné !");
				}
				else
				{
					out .println("Joueur 2 a gagné !");
					out2.println("Joueur 2 a gagné !");
				}

				in .close();
				in2.close();

				out .close();
				out2.close();

				client1.close();
				client2.close();
			}
		}
		catch ( Exception e ) { System.out.println("Erreur serveur: Port inexistant !"); }
	}
}