import java.awt.*;

public final class Window extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5287663274925283481L;

	public Window(EventHandler arg0, int width, int height) {
		int heightOffset = 5;
		System.out.println(arg0);
		ahj = arg0;
		setTitle("RS2 World Map Viewer");
		setResizable(false);
		show();
		toFront();
		resize(width + 8, height + heightOffset);
	}

	public final void adj(Graphics arg0) {
		ahj.agn(arg0);
	}

	public final void adk(Graphics arg0) {
		ahj.afi(arg0);
	}

	public Graphics adl() {
		Graphics g = super.getGraphics();
		System.out.println("Moved");
		g.translate(4, 24);
		return g;
	}

	EventHandler ahj;
}
