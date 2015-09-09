import java.awt.*;

public final class Window extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5287663274925283481L;

	RSAppet canvas;
	
	public Window(RSAppet canvas, int width, int height) {
		this.canvas = canvas;
		this.setTitle("RS2 World Map Viewer");
		this.setResizable(false);
		this.toFront();
		this.setSize(new Dimension(width, height));
		this.setVisible(true);
	}

	public final void adj(Graphics g) {
		canvas.agn(g);
	}

	public final void adk(Graphics g) {
		canvas.update(g);
	}

	public Graphics adl() {
		Graphics g = super.getGraphics();
		g.translate(4, 24);
		return g;
	}
}
