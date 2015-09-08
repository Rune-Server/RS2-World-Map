import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class EventHandler extends Applet implements Runnable, MouseListener,
		MouseMotionListener, KeyListener, FocusListener, WindowListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public final void stop() {
		if (aig >= 0)
			aig = 4000 / aih;
	}

	public void afb() {
	}

	public void afc(int arg0, String text) {
		while (aja == null) {
			aja = agf().getGraphics();
			try {
				agf().repaint();
			} catch (Exception exception) {
			}
			try {
				Thread.sleep(1000L);
			} catch (Exception exception1) {
			}
		}
		Font font = new Font("Helvetica", 1, 13);
		FontMetrics fontmetrics = agf().getFontMetrics(font);
		Font font1 = new Font("Helvetica", 0, 13);
		FontMetrics fontmetrics1 = agf().getFontMetrics(font1);
		if (aje) {
			aja.setColor(Color.black);
			aja.fillRect(0, 0, aim, ain);
			aje = false;
		}
		Color color = new Color(140, 17, 17);
		int i = ain / 2 - 18;
		aja.setColor(color);
		aja.drawRect(aim / 2 - 152, i, 304, 34);
		aja.fillRect(aim / 2 - 150, i + 2, arg0 * 3, 30);
		aja.setColor(Color.black);
		aja.fillRect((aim / 2 - 150) + arg0 * 3, i + 2, 300 - arg0 * 3, 30);
		aja.setFont(font);
		aja.setColor(Color.white);
		aja.drawString(text, (aim - fontmetrics.stringWidth(text)) / 2, i + 22);
	}

	public final void mouseReleased(MouseEvent event) {
		ajg = 0;
		ajh = 0;
	}

	public final void keyPressed(KeyEvent event) {
		ajg = 0;
		int key = event.getKeyCode();
		int characterKey = event.getKeyChar();
		if (characterKey < 30)
			characterKey = 0;
		if (key == 37) {
			System.out.println("37");
			characterKey = 1;
		}
		if (key == 39) {
			System.out.println("39");
			characterKey = 2;
		}
		if (key == 38) {
			characterKey = 3;
		}
		if (key == 40)
			characterKey = 4;
		if (key == 17)
			characterKey = 5;
		if (key == 8)
			characterKey = 8;
		if (key == 127)
			characterKey = 8;
		if (key == 9)
			characterKey = 9;
		if (key == 10)
			characterKey = 10;
		if (key >= 112 && key <= 123)
			characterKey = (1008 + key) - 112;
		if (key == 36)
			characterKey = 1000;
		if (key == 35)
			characterKey = 1001;
		if (key == 33)
			characterKey = 1002;
		if (key == 34)
			characterKey = 1003;
		if (characterKey > 0 && characterKey < 128)
			ake[characterKey] = 1;
		if (characterKey > 4) {
			akf[akh] = characterKey;
			akh = akh + 1 & 0x7f;
		}
	}

	public void aff(Runnable runnable, int priority) {
		Thread thread = new Thread(runnable);
		thread.start();
		thread.setPriority(priority);
	}

	public final void windowClosing(WindowEvent event) {
		destroy();
	}

	public final void afh() {
		aig = -2;
		ahb();
		if (ajd != null) {
			try {
				Thread.sleep(1000L);
			} catch (Exception exception) {
			}
			try {
				System.exit(0);
			} catch (Throwable throwable) {
			}
		}
	}

	public final void afi(Graphics arg0) {
		if (aja == null)
			aja = arg0;
		aje = true;
		afb();
	}

	public final void mouseEntered(MouseEvent mouseevent) {
	}

	public final void mouseExited(MouseEvent arg0) {
		ajg = 0;
		aji = -1;
		ajj = -1;
	}

	public final void windowOpened(WindowEvent windowevent) {
	}

	public final void windowDeiconified(WindowEvent windowevent) {
	}

	public final void windowActivated(WindowEvent windowevent) {
	}

	public void aga() {
	}

	public final void start() {
		if (aig >= 0)
			aig = 0;
	}

	public final void agc(int width, int height) {
		aim = width;
		ain = height;
		ajd = new Window(this, aim, ain);
		aja = agf().getGraphics();
		ajb = new l(aim, ain, agf());
		aff(this, 1);
	}

	public final int agd() {
		int i = -1;
		if (akh != akg) {
			i = akf[akg];
			akg = akg + 1 & 0x7f;
		}
		return i;
	}

	public void age() {
	}

	public Component agf() {
		if (ajd != null)
			return ajd;
		else
			return this;
	}

	public final void mouseClicked(MouseEvent mouseevent) {
	}

	public final void mousePressed(MouseEvent mouse) {
		int x = mouse.getX();
		int y = mouse.getY();
		if (ajd != null) {
			x -= 4;
			y -= 22;
		}
		System.out.println("Mouse X: " + x);
		System.out.println("Mouse Y: " + y);
		
		ajg = 0;
		mouseX = x;
		mouseY = y;
		ajn = System.currentTimeMillis();
		if (mouse.isMetaDown()) {
			ajk = 2;
			ajh = 2;
		} else {
			ajk = 1;
			ajh = 1;
		}
	}

	public final void mouseDragged(MouseEvent mouse) {
		int x = mouse.getX();
		int y = mouse.getY();
		if (ajd != null) {
			x -= 4;
			y -= 22;
		}
		ajg = 0;
		aji = x;
		ajj = y;
	}

	public final void agj(int arg0, int arg1) {
		aim = arg0;
		ain = arg1;
		aja = agf().getGraphics();
		ajb = new l(aim, ain, agf());
		aff(this, 1);
	}

	public final void mouseMoved(MouseEvent arg0) {
		int i = arg0.getX();
		int j = arg0.getY();
		if (ajd != null) {
			i -= 4;
			j -= 22;
		}
		ajg = 0;
		aji = i;
		ajj = j;
	}

	public final void keyTyped(KeyEvent keyevent) {
	}

	public final void windowDeactivated(WindowEvent windowevent) {
	}

	public final void agn(Graphics arg0) {
		if (aja == null)
			aja = arg0;
		aje = true;
		afb();
	}

	public final void destroy() {
		aig = -1;
		try {
			Thread.sleep(5000L);
		} catch (Exception exception) {
		}
		if (aig == -1)
			afh();
	}

	public void ahb() {
	}

	public EventHandler() {
		aig = 0;
		aih = 20;
		aii = 1;
		aij = new long[10];
		aik = 0;
		ail = false;
		ajc = new g[6];
		aje = true;
		ajf = true;
		ajg = 0;
		ajh = 0;
		aji = 0;
		ajj = 0;
		ajk = 0;
		mouseX = 0;
		mouseY = 0;
		ajn = 0L;
		aka = 0;
		akb = 0;
		akc = 0;
		akd = 0L;
		ake = new int[128];
		akf = new int[128];
		akg = 0;
		akh = 0;
	}

	public void ahd() {
	}

	public final void focusLost(FocusEvent arg0) {
		ajf = false;
		for (int i = 0; i < 128; i++)
			ake[i] = 0;

	}

	public final void keyReleased(KeyEvent arg0) {
		ajg = 0;
		int i = arg0.getKeyCode();
		char c1 = arg0.getKeyChar();
		if (c1 < '\036')
			c1 = '\0';
		if (i == 37)
			c1 = '\001';
		if (i == 39)
			c1 = '\002';
		if (i == 38)
			c1 = '\003';
		if (i == 40)
			c1 = '\004';
		if (i == 17)
			c1 = '\005';
		if (i == 8)
			c1 = '\b';
		if (i == 127)
			c1 = '\b';
		if (i == 9)
			c1 = '\t';
		if (i == 10)
			c1 = '\n';
		if (c1 > 0 && c1 < '\200')
			ake[c1] = 0;
	}

	public final void windowClosed(WindowEvent windowevent) {
	}

	public void run() {
		agf().addMouseListener(this);
		agf().addMouseMotionListener(this);
		agf().addKeyListener(this);
		agf().addFocusListener(this);
		if (ajd != null)
			ajd.addWindowListener(this);
		afc(0, "Loading...");
		aga();
		int i = 0;
		int j = 256;
		int k = 1;
		int i1 = 0;
		int j1 = 0;
		for (int k1 = 0; k1 < 10; k1++)
			aij[k1] = System.currentTimeMillis();

		long l1 = System.currentTimeMillis();
		while (aig >= 0) {
			if (aig > 0) {
				aig--;
				if (aig == 0) {
					afh();
					return;
				}
			}
			int i2 = j;
			int j2 = k;
			j = 300;
			k = 1;
			long l2 = System.currentTimeMillis();
			if (aij[i] == 0L) {
				j = i2;
				k = j2;
			} else if (l2 > aij[i])
				j = (int) ((long) (2560 * aih) / (l2 - aij[i]));
			if (j < 25)
				j = 25;
			if (j > 256) {
				j = 256;
				k = (int) ((long) aih - (l2 - aij[i]) / 10L);
			}
			if (k > aih)
				k = aih;
			aij[i] = l2;
			i = (i + 1) % 10;
			if (k > 1) {
				for (int k2 = 0; k2 < 10; k2++)
					if (aij[k2] != 0L)
						aij[k2] += k;

			}
			if (k < aii)
				k = aii;
			try {
				Thread.sleep(k);
			} catch (InterruptedException interruptedexception) {
				j1++;
			}
			for (; i1 < 256; i1 += j) {
				aka = ajk;
				akb = mouseX;
				akc = mouseY;
				akd = ajn;
				ajk = 0;
				ahd();
				akg = akh;
			}

			i1 &= 0xff;
			if (aih > 0)
				aik = (1000 * j) / (aih * 256);
			age();
			if (ail) {
				System.out.println("ntime:" + l2);
				for (int i3 = 0; i3 < 10; i3++) {
					int j3 = ((i - i3 - 1) + 20) % 10;
					System.out.println("otim" + j3 + ":" + aij[j3]);
				}

				System.out.println("fps:" + aik + " ratio:" + j + " count:"
						+ i1);
				System.out.println("del:" + k + " deltime:" + aih + " mindel:"
						+ aii);
				System.out.println("intex:" + j1 + " opos:" + i);
				ail = false;
				j1 = 0;
			}
		}
		if (aig == -1)
			afh();
	}

	public final void focusGained(FocusEvent event) {
		ajf = true;
		aje = true;
		
		System.out.println("ajf: " + ajf);
		System.out.println("aje" + aje);
		
		afb();
	}

	public final void windowIconified(WindowEvent windowevent) {
	}

	private int aig;
	private int aih;
	public int aii;
	private long aij[];
	public int aik;
	public boolean ail;
	public int aim;
	public int ain;
	public Graphics aja;
	public l ajb;
	public g ajc[];
	public Window ajd;
	public boolean aje;
	public boolean ajf;
	public int ajg;
	public int ajh;
	public int aji;
	public int ajj;
	public int ajk;
	public int mouseX;
	public int mouseY;
	public long ajn;
	public int aka;
	public int akb;
	public int akc;
	public long akd;
	public int ake[];
	private int akf[];
	private int akg;
	private int akh;
	public static boolean aki;
}
