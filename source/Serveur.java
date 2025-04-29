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

		while ( true )
		{
			try
			{
				System.out.println("En attente de deux joueurs sur le serveur : " + port);
				ServerSocket ss = new ServerSocket(port);

				/* -------- */
				/* Joueur 1 */
				/* ---------*/
				Socket client1 = ss.accept();
				System.out.println("Joueur 1 connecte...");
				PrintWriter out = new PrintWriter(client1.getOutputStream(), true);
				BufferedReader in = new BufferedReader(new InputStreamReader(client1.getInputStream()));
				out.println("Joueur 1 connecte...");

				/* -------- */
				/* Joueur 2 */
				/* ---------*/
				Socket client2 = ss.accept();
				System.out.println("Joueur 2 connecte...");
				PrintWriter out2 = new PrintWriter(client2.getOutputStream(), true);
				BufferedReader in2 = new BufferedReader(new InputStreamReader(client2.getInputStream()));
				out2.println("Joueur 2 connecte...");

				/* --------------- */
				/* Joueur Connecte */
				/* --------------- */
				String joueur1Connecte = in.readLine();
				if   ( joueur1Connecte.equals( "Joueur 1 pret") ) joueur1 = new Joueur( "Joueur 1" );
				else                                                       joueur2 = new Joueur( "Joueur 2" );

				/* ----------------------------- */
				/* Jeu du Pierre-Feuille-Ciseaux */
				/* ----------------------------- */
				while ( joueur1.getNbPoints() != 10 || joueur2.getNbPoints() != 10 )
				{
					out.println ( "Choisissez Pierre (0), Feuille (1) ou Ciseaux(2)" );
					out2.println( "Choisissez Pierre (0), Feuille (1) ou Ciseaux(2)" );

					try
					{ 
						int messageChoixJoueur1 = Integer.parseInt( in.readLine()  );
						int messageChoixJoueur2 = Integer.parseInt( in2.readLine() );

						joueur1.setChoix( messageChoixJoueur1 );
						joueur2.setChoix( messageChoixJoueur2 );
					} 
					catch ( IOException e ) 
					{ 
						if   ( joueur1Connecte.equals( "Joueur 1 connecte..." ) ) out.println("Choisissez un nombre entier.");
						else                                                               out2.println("Choisissez un nombre entier.");
					}

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

				if   ( joueur1.getNbPoints() == 10 ) System.out.println("Joueur 1 a gagné !");
				else                                 System.out.println("Joueur 2 a gagné !");

				client1.close();
				client2.close();
			}
			catch ( Exception e ) { System.out.println("Erreur serveur: Port inexistant !"); }
		}
	}
}