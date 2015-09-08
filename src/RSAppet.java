import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class RSAppet extends Applet implements Runnable, MouseListener,
		MouseMotionListener, KeyListener, FocusListener, WindowListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public final void stop() {
		if (stopCounter >= 0)
			stopCounter = 4000 / delayTime;
	}

	public void afb() {
	}

	public void drawLoadingText(int progression, String text) {
		while (graphics == null) {
			graphics = getGameComponent().getGraphics();
			try {
				getGameComponent().repaint();
			} catch (Exception exception) {
			}
			try {
				Thread.sleep(1000L);
			} catch (Exception exception1) {
			}
		}
		Font font = new Font("Helvetica", 1, 13);
		FontMetrics fontmetrics = getGameComponent().getFontMetrics(font);
		Font font1 = new Font("Helvetica", 0, 13);
		FontMetrics fontmetrics1 = getGameComponent().getFontMetrics(font1);
		if (aje) {
			graphics.setColor(Color.black);
			graphics.fillRect(0, 0, myWidth, myHeight);
			aje = false;
		}
		Color color = new Color(140, 17, 17);
		int i = myHeight / 2 - 18;
		graphics.setColor(color);
		graphics.drawRect(myWidth / 2 - 152, i, 304, 34);
		graphics.fillRect(myWidth / 2 - 150, i + 2, progression * 3, 30);
		graphics.setColor(Color.black);
		graphics.fillRect((myWidth / 2 - 150) + progression * 3, i + 2, 300 - progression * 3, 30);
		graphics.setFont(font);
		graphics.setColor(Color.white);
		graphics.drawString(text, (myWidth - fontmetrics.stringWidth(text)) / 2, i + 22);
	}

	public final void mouseReleased(MouseEvent event) {
		ajg = 0;
		ajh = 0;
	}

	public final void keyPressed(KeyEvent event) {
		ajg = 0;
		int keyCode = event.getKeyCode();
		int keyIndex = event.getKeyChar();
		if (keyIndex < 30)
			keyIndex = 0;
		if (keyCode == 37) {
			System.out.println("37");
			keyIndex = 1;
		}
		if (keyCode == 39) {
			System.out.println("39");
			keyIndex = 2;
		}
		if (keyCode == 38) {
			keyIndex = 3;
		}
		if (keyCode == 40)
			keyIndex = 4;
		if (keyCode == 17)
			keyIndex = 5;
		if (keyCode == 8)
			keyIndex = 8;
		if (keyCode == 127)
			keyIndex = 8;
		if (keyCode == 9)
			keyIndex = 9;
		if (keyCode == 10)
			keyIndex = 10;
		if (keyCode >= 112 && keyCode <= 123)
			keyIndex = (1008 + keyCode) - 112;
		if (keyCode == 36)
			keyIndex = 1000;
		if (keyCode == 35)
			keyIndex = 1001;
		if (keyCode == 33)
			keyIndex = 1002;
		if (keyCode == 34)
			keyIndex = 1003;
		if (keyIndex > 0 && keyIndex < 128)
			ake[keyIndex] = 1;
		if (keyIndex > 4) {
			akf[akh] = keyIndex;
			akh = akh + 1 & 0x7f;
		}
	}

	public void startRunnable(Runnable runnable, int priority) {
		Thread thread = new Thread(runnable);
		thread.start();
		thread.setPriority(priority);
	}

	public final void windowClosing(WindowEvent event) {
		destroy();
	}

	public final void exit() {
		stopCounter = -2;
		cleanUpForQuit();
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

	public final void update(Graphics g) {
		if (graphics == null)
			graphics = g;
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
		if (stopCounter >= 0)
			stopCounter = 0;
	}

	public final void createFrame(int width, int height) {
		myWidth = width;
		myHeight = height;
		ajd = new Window(this, myWidth, myHeight);
		graphics = getGameComponent().getGraphics();
		fullScreen = new RSImageProducer(myWidth, myHeight, getGameComponent());
		startRunnable(this, 1);
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

	public Component getGameComponent() {
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
		myWidth = arg0;
		myHeight = arg1;
		graphics = getGameComponent().getGraphics();
		fullScreen = new RSImageProducer(myWidth, myHeight, getGameComponent());
		startRunnable(this, 1);
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
		if (graphics == null)
			graphics = arg0;
		aje = true;
		afb();
	}

	public final void destroy() {
		stopCounter = -1;
		try {
			Thread.sleep(5000L);
		} catch (Exception exception) {
		}
		if (stopCounter == -1)
			exit();
	}

	public void cleanUpForQuit() {
	}

	public RSAppet() {
		stopCounter = 0;
		delayTime = 20;
		aii = 1;
		aij = new long[10];
		aik = 0;
		ail = false;
		ajc = new Sprite[6];
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
		getGameComponent().addMouseListener(this);
		getGameComponent().addMouseMotionListener(this);
		getGameComponent().addKeyListener(this);
		getGameComponent().addFocusListener(this);
		if (ajd != null)
			ajd.addWindowListener(this);
		drawLoadingText(0, "Loading...");
		aga();
		int i = 0;
		int j = 256;
		int k = 1;
		int i1 = 0;
		int j1 = 0;
		for (int k1 = 0; k1 < 10; k1++)
			aij[k1] = System.currentTimeMillis();

		long l1 = System.currentTimeMillis();
		while (stopCounter >= 0) {
			if (stopCounter > 0) {
				stopCounter--;
				if (stopCounter == 0) {
					exit();
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
				j = (int) ((long) (2560 * delayTime) / (l2 - aij[i]));
			if (j < 25)
				j = 25;
			if (j > 256) {
				j = 256;
				k = (int) ((long) delayTime - (l2 - aij[i]) / 10L);
			}
			if (k > delayTime)
				k = delayTime;
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
			if (delayTime > 0)
				aik = (1000 * j) / (delayTime * 256);
			age();
			if (ail) {
				System.out.println("ntime:" + l2);
				for (int i3 = 0; i3 < 10; i3++) {
					int j3 = ((i - i3 - 1) + 20) % 10;
					System.out.println("otim" + j3 + ":" + aij[j3]);
				}

				System.out.println("fps:" + aik + " ratio:" + j + " count:"
						+ i1);
				System.out.println("del:" + k + " deltime:" + delayTime + " mindel:"
						+ aii);
				System.out.println("intex:" + j1 + " opos:" + i);
				ail = false;
				j1 = 0;
			}
		}
		if (stopCounter == -1)
			exit();
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

	private int stopCounter;
	private int delayTime;
	public int aii;
	private long aij[];
	public int aik;
	public boolean ail;
	public int myWidth;
	public int myHeight;
	public Graphics graphics;
	public RSImageProducer fullScreen;
	public Sprite ajc[];
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
