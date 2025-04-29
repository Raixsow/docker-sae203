import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


public class Client
{
	public static void main(String[] args)
	{
		String nomMachine;
		Joueur joueur;

		Scanner scanner = new Scanner(System.in);

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

			if   ( joueurConnecte.charAt(0) == '1' ) out.println ( "1 prêt" );
			else                                           out.println ( "2 prêt" );

			/* --------------- */
			/* Choix du joueur */
			/* --------------- */
			String messageChoix = "";
			while ( ! messageChoix.equals( "Joueur 1 a gagné !" ) || ! messageChoix.equals( "Joueur 2 a gagné !") )
			{
				messageChoix = in.readLine();
				System.out.println( messageChoix );
				out.println( scanner.nextInt() );
			}

			String messageGagnant = in.readLine();
			System.out.println( in.readLine() );

			in.close();
			out.close();
		}
		catch ( IOException e ) {}
	}
}