public class Controleur
{
	private FrameAppli frameAppli;
	private PFC        pfc;

	public Controleur()
	{
		this.frameAppli = new FrameAppli( this );
		this.pfc        = new PFC();
	}

	public int setChoix()
	{
		return this.frameAppli.setChoix();
	}

	public static void main(String[] args)
	{
		new Controleur();
	}
}