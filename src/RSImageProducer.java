import java.awt.*;
import java.awt.image.*;

public final class RSImageProducer implements ImageProducer, ImageObserver {

	public void acm() {
		DrawingArea.setArea(pixels, width, height);
	}

	public RSImageProducer(int width, int height, Component component) {
		this.width = width;
		this.height = height;
		pixels = new int[width * height];
		colorModel = new DirectColorModel(32, 0xff0000, 65280, 255);
		image = component.createImage(this);
		notifyConsumer();
		component.prepareImage(image, this);
		notifyConsumer();
		component.prepareImage(image, this);
		notifyConsumer();
		component.prepareImage(image, this);
		acm();
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int i, int j,
			int k) {
		return true;
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		return ahh == arg0;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (ahh == arg0)
			ahh = null;
	}

	public void ade(Graphics arg0, int arg1, int arg2) {
		notifyConsumer();
		arg0.drawImage(image, arg1, arg2, this);
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		ahh = arg0;
		arg0.setDimensions(width, height);
		arg0.setProperties(null);
		arg0.setColorModel(colorModel);
		arg0.setHints(14);
	}

	public synchronized void notifyConsumer() {
		if (ahh == null) {
			return;
		} else {
			ahh.setPixels(0, 0, width, height, colorModel, pixels, 0, width);
			ahh.imageComplete(2);
			return;
		}
	}

	public int pixels[];
	public int width;
	public int height;
	ColorModel colorModel;
	ImageConsumer ahh;
	public Image image;
}
