package Pierre_Feuille_Ciseaux.ihm;

import Pierre_Feuille_Ciseaux.Controleur;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameAppli extends JFrame implements ActionListener
{
	private Controleur ctrl;
	private PanelCentral panelCentral;
	private PanelNord    panelNord;

	private JButton btnPierre;
	private JButton btnFeuille;
	private JButton btnCiseaux;

	public FrameAppli(Controleur ctrl)
	{
		this.ctrl = ctrl;

		this.setLayout( new BorderLayout() );

		this.setTitle("Pierre-Feuille-Ciseaux");
		this.setSize(875, 625);

		/*------------------------ */
        /* Création des composants */
        /*------------------------ */
		this.btnPierre  = new JButton( "Pierre"  );
		this.btnFeuille = new JButton( "Feuille" );
		this.btnCiseaux = new JButton( "Ciseaux" );

		this.panelCentral = new PanelCentral( this );
		this.panelNord    = new PanelNord   ( this );

		/* ----------------------------- */
        /* positionnement des composants */
        /* ----------------------------- */
		JPanel panelSud = new JPanel();
		panelSud.add ( this.btnPierre  );
		panelSud.add ( this.btnFeuille );
		panelSud.add ( this.btnCiseaux );

		this.add( this.panelNord   , BorderLayout.NORTH  );
		this.add( panelSud         , BorderLayout.SOUTH  );
		this.add( this.panelCentral, BorderLayout.CENTER );

		/* ------------------------- */
        /* Activation des composants */
        /* ------------------------- */
		this.btnPierre .addActionListener( this );
		this.btnFeuille.addActionListener( this );
		this.btnCiseaux.addActionListener( this );

		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e)
	{
		if ( e.getSource() == this.btnPierre  ) this.panelCentral.setImageGauche(this.btnPierre .getText());
		if ( e.getSource() == this.btnFeuille ) this.panelCentral.setImageGauche(this.btnFeuille.getText());
		if ( e.getSource() == this.btnCiseaux ) this.panelCentral.setImageGauche(this.btnCiseaux.getText());
	}
}