package Pierre_Feuille_Ciseaux.ihm;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.GridLayout;

public class PanelCentral extends JPanel
{
	private JLabel lblChoixPerso;
	private JLabel lblChoixAdversaire;

	public PanelCentral()
	{
		JLabel lblVs;
		this.setLayout( new GridLayout(1, 3) );

		/*------------------------ */
		/* Creation des composants */
		/*------------------------ */
		this.lblChoixPerso      = new JLabel( new ImageIcon( "Pierre_Feuille_Ciseaux/images/Vide.png" ) );
		this.lblChoixAdversaire = new JLabel( new ImageIcon( "Pierre_Feuille_Ciseaux/images/Vide.png" ) );
		lblVs                   = new JLabel( "Vs", SwingConstants.CENTER );

		this.lblChoixPerso     .setPreferredSize( new Dimension(256, 256) );
		this.lblChoixAdversaire.setPreferredSize( new Dimension(256, 256) );
		lblVs                  .setPreferredSize( new Dimension(256, 256) );


		/* ----------------------------- */
		/* positionnement des composants */
		/* ----------------------------- */
		this.add(this.lblChoixPerso);
		this.add( lblVs );
		this.add(this.lblChoixAdversaire);
	}

	public void setImageGauche(String message)
	{
		this.lblChoixPerso.setIcon( new ImageIcon( "./Pierre_Feuille_Ciseaux/images/" + message +".png") );
	}
}