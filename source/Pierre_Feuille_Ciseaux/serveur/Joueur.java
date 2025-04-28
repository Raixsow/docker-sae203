package Pierre_Feuille_Ciseaux.serveur;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;

public class Joueur
{
	private static int nbJoueur = 0; 
	
    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;
    private int choix;

	private int  numJoueur;
	private int  nbPoints;
	private char coup;

	public Joueur( Socket socket )
	{
		this.socket = socket;

		this.numJoueur = ++Joueur.nbJoueur;
		this.nbPoints  =  0 ;
		this.coup      = ' ';
	}

	public boolean coup(char coup)
	{
		if(coup != 'P' || coup != 'F' || coup != 'C') return false;

		this.coup = coup;
		return true;
	}

	public int getNbPoints  () { return this.nbPoints; }

	public void ajouterPoint() { this.nbPoints++;      }


	public void envoyerCoup (String message ) { out.writeUTF( message  ); }
	public void envoyerResultat(String resultat) { out.writeUTF( resultat ); }

	public int recevoirChoix() throws Exception
	{
        choix = in.readInt();
        return choix;
    }
}
