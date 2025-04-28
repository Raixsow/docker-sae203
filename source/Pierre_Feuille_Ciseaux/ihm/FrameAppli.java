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

	private JButton btnPierre;
	private JButton btnFeuille;
	private JButton btnCiseaux;

	public FrameAppli(Controleur ctrl)
	{
		this.ctrl = ctrl;

		this.setLayout( new BorderLayout() );

		this.setTitle("Pierre-Feuille-Ciseaux");
		this.setSize(650, 475);

		/*------------------------ */
        /* Création des composants */
        /*------------------------ */
		this.btnPierre  = new JButton( "Pierre"  );
		this.btnFeuille = new JButton( "Feuille" );
		this.btnCiseaux = new JButton( "Ciseaux" );

		this.panelCentral = new PanelCentral( this );

		/* ----------------------------- */
        /* positionnement des composants */
        /* ----------------------------- */
		JPanel panelSud = new JPanel();
		panelSud.add ( this.btnPierre  );
		panelSud.add ( this.btnFeuille );
		panelSud.add ( this.btnCiseaux );

		this.add( panelSud, BorderLayout.SOUTH );
		this.add( this.panelCentral, BorderLayout.CENTER );

		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e)
	{
		String sRet = "";

		if ( e.getSource() == this.btnPierre  ) sRet = this.ctrl.getNom( 0 );
		if ( e.getSource() == this.btnFeuille ) sRet = this.ctrl.getNom( 1 );
		if ( e.getSource() == this.btnCiseaux ) sRet = this.ctrl.getNom( 2 );

		sRet += "_gauche";

		this.panelCentral.setImageGauche(sRet);
	}
}