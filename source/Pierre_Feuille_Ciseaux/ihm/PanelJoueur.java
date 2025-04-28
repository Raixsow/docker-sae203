package Pierre_Feuille_Ciseaux.ihm;

import javax.swing.*;
import java.awt.event.*;
import java.awt.GridLayout;

public class PanelJoueur extends JPanel implements ActionListener
{
    private JButton btnPierre;
    private JButton btnFeuille;
    private JButton btnCiseaux;

    public PanelJoueur()
    {
        this.setLayout(new GridLayout(3,1) );

       /*------------------------ */
       /* Création des composants */
       /*------------------------ */
       this.btnPierre  = new JButton("Pierre");
       this.btnFeuille = new JButton("Feuille");
       this.btnCiseaux = new JButton("Ciseaux");

       /* ----------------------------- */
       /* positionnement des composants */
       /* ----------------------------- */
       this.add(this.btnPierre);
       this.add(this.btnFeuille);
       this.add(this.btnCiseaux);

       /*-------------------------- */
       /* Activation des composants */
       /*-------------------------- */  
       this.setVisible(true);

       this.btnPierre .addActionListener( this );
       this.btnFeuille.addActionListener( this );
       this.btnCiseaux.addActionListener( this );
    }

    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Test");
    }
}
