package Pierre_Feuille_Ciseaux.ihm;

import javax.swing.*;
import java.awt.*;

public class FrameAppli extends JFrame
{

	private 
	public FrameAppli()
	{
		this.setTitle("Pierre-Feuille-Ciseaux");
		this.setSize(400, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);


		this.add(panel, BorderLayout.CENTER);

		this.setVisible(true);
	}

	public static void main(String[] args)
	{
		new FrameAppli();
	}
}