package Pierre_Feuille_Ciseaux.ihm;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.GridLayout;

public class PanelCentral extends JPanel
{
    private JLabel lblChoixPerso;
    private JLabel lblChoixAdversaire;

    private FrameAppli frameAppli;

    public PanelCentral(FrameAppli frameAppli)
    {
        this.frameAppli = frameAppli;

        this.setLayout( new GridLayout(3, 1) );

        /*------------------------ */
        /* Création des composants */
        /*------------------------ */
        this.lblChoixPerso = new JLabel();
        this.lblChoixPerso.setPreferredSize( new Dimension(512, 512) );

        this.lblChoixAdversaire = new JLabel();
        this.lblChoixAdversaire.setPreferredSize( new Dimension(512, 512) );

        JLabel lblResultat = new JLabel( "Vs" );
        lblResultat.setPreferredSize( new Dimension(200, 200));

        /* ----------------------------- */
        /* positionnement des composants */
        /* ----------------------------- */
        this.add(this.lblChoixPerso);
        this.add(lblResultat);
        this.add(this.lblChoixAdversaire);
    }

    public void setImageGauche(String message)
    {
        this.lblChoixPerso.setIcon( new ImageIcon( "./Pierre_Feuille_Ciseaux/images/" + message +".png") );
    }
}