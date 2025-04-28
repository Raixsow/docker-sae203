package Pierre_Feuille_Ciseaux.ihm;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.GridLayout;

public class PanelNord extends JPanel
{
	private FrameAppli frameAppli;

	private JLabel lblPointsJoueur1;
	private JLabel lblPointsJoueur2;
	private JLabel lblTemps;

	public PanelNord(FrameAppli frameAppli)
	{
		this.frameAppli = frameAppli;

		this.setLayout( new GridLayout(1, 3) );

		/*------------------------ */
        /* Création des composants */
        /*------------------------ */
		JLabel lblJoueur1         = new JLabel( "Joueur 1"          , SwingConstants.CENTER );
		JLabel lblNbPointsJoueur1 = new JLabel( "Nombre de points :", SwingConstants.CENTER );
		this.lblPointsJoueur1     = new JLabel( "0"                 , SwingConstants.CENTER );

		JLabel lblResultat = new JLabel( "Résultat", SwingConstants.CENTER );
		JLabel lblMinuteur = new JLabel( "Temps :" , SwingConstants.CENTER );
		this.lblTemps      = new JLabel( "10"      , SwingConstants.CENTER );

		JLabel lblJoueur2         = new JLabel( "Joueur 2"          , SwingConstants.CENTER );
		JLabel lblNbPointsJoueur2 = new JLabel( "Nombre de points :", SwingConstants.CENTER );
		this.lblPointsJoueur2     = new JLabel( "0"                 , SwingConstants.CENTER );


		/* ----------------------------- */
        /* positionnement des composants */
        /* ----------------------------- */
		this.ajouterAuPanel( lblJoueur1      , lblNbPointsJoueur1, this.lblPointsJoueur1 );
		this.ajouterAuPanel( lblResultat     , lblMinuteur       , this.lblTemps         );
		this.ajouterAuPanel( lblJoueur2      , lblNbPointsJoueur2, this.lblPointsJoueur2 );
	}

	public void ajouterAuPanel( JLabel lblTemp, JLabel lblTemp2, JLabel lblTemp3 )
	{
		JPanel panelTemp = new JPanel( new GridLayout( 3, 1) );

		panelTemp.add( lblTemp );
		panelTemp.add( lblTemp2);
		panelTemp.add( lblTemp3);

		this.add(panelTemp);
	}
}
