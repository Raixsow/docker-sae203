package Pierre_Feuille_Ciseaux.serveur;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import Pierre_Feuille_Ciseaux.Controleur;
import Pierre_Feuille_Ciseaux.metier.Joueur;

public class Client
{
	public static void main(String[] args)
	{
		String nomMachine;
		Joueur joueur;

		try
		{
			/* -------------------- */
			/* Connexion au serveur */
			/* -------------------- */
			System.out.println( "Connexion au serveur..." );
			Socket client = new Socket("localhost", 45369);
			System.out.println("connecté...");

			PrintWriter    out = new PrintWriter   ( client.getOutputStream(), true      );
			BufferedReader in  = new BufferedReader( new InputStreamReader(client.getInputStream() ) );

			/* ------------------------ */
			/* Gestion du joueur 1 et 2 */
			/* ------------------------ */
			String joueurConnecte = in.readLine();
			System.out.println( joueurConnecte );	

			Controleur ctrl = new Controleur();

			if   ( joueurConnecte.equals("1") ) joueur = new Joueur( ctrl, "Joueur 1" );
			else                                         joueur = new Joueur( ctrl, "Joueur 2" );

			/* ------------------- */
			/* Fermeture du client */
			/* ------------------- */
			in.close();
			out.close();
			client.close();
		}
		catch ( IOException e ) {}
	}
}