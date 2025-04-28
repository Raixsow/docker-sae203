package Pierre_Feuille_Ciseaux.ihm;

import javax.swing.*;
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

        this.setLayout( new GridLayout(1, 3) );

        /*------------------------ */
        /* Création des composants */
        /*------------------------ */
        this.lblChoixPerso = new JLabel( new ImageIcon( "Pierre_Feuille_Ciseaux/images/Vide.png" ) );
        this.lblChoixPerso.setPreferredSize( new Dimension(256, 256) );

        this.lblChoixAdversaire = new JLabel( new ImageIcon( "Pierre_Feuille_Ciseaux/images/Vide.png" ) );
        this.lblChoixAdversaire.setPreferredSize( new Dimension(256, 256) );

        JLabel lblVs = new JLabel( "Vs", SwingConstants.CENTER );
        lblVs.setPreferredSize( new Dimension(256, 256));

        /* ----------------------------- */
        /* positionnement des composants */
        /* ----------------------------- */
        this.add(this.lblChoixPerso);
        this.add(lblVs);
        this.add(this.lblChoixAdversaire);
    }

    public void setImageGauche(String message)
    {
        this.lblChoixPerso.setIcon( new ImageIcon( "./Pierre_Feuille_Ciseaux/images/" + message +".png") );
    }
}