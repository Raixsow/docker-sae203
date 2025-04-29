import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

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
			Socket client = new Socket("localhost", 46035);

			PrintWriter    out = new PrintWriter   ( client.getOutputStream(), true      );
			BufferedReader in  = new BufferedReader( new InputStreamReader(client.getInputStream() ) );

			/* ------------------------ */
			/* Gestion du joueur 1 et 2 */
			/* ------------------------ */
			String joueurConnecte = in.readLine();
			System.out.println( joueurConnecte );	

			if   ( joueurConnecte.charAt(0) == '1' ) out.println( "1 pret" );
			else                                           out.println( "2 pret" ); 

			/* --------------- */
			/* Choix du joueur */
			/* --------------- */
			String messageChoix = in.readLine();
			out.println( in.readLine() );

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