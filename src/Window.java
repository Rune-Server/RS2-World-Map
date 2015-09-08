import java.awt.*;

public final class Window extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5287663274925283481L;

	RSAppet canvas;
	
	public Window(RSAppet canvas, int width, int height) {
		int heightOffset = 2;
		this.canvas = canvas;
		setTitle("RS2 World Map Viewer");
		setResizable(false);
		show();
		toFront();
		resize(width + 8, height + heightOffset);
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
