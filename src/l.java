import java.awt.*;
import java.awt.image.*;

public final class l
    implements ImageProducer, ImageObserver
{

    public void acm()
    {
        e.ajj(ahd, ahe, ahf);
    }

    public l(int arg0, int arg1, Component arg2)
    {
        ahe = arg0;
        ahf = arg1;
        ahd = new int[arg0 * arg1];
        ahg = new DirectColorModel(32, 0xff0000, 65280, 255);
        ahi = arg2.createImage(this);
        adh();
        arg2.prepareImage(ahi, this);
        adh();
        arg2.prepareImage(ahi, this);
        adh();
        arg2.prepareImage(ahi, this);
        acm();
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int i, int j, int k)
    {
        return true;
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0)
    {
        System.out.println("TDLR");
    }

    public synchronized boolean isConsumer(ImageConsumer arg0)
    {
        return ahh == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0)
    {
        if(ahh == arg0)
            ahh = null;
    }

    public void ade(Graphics arg0, int arg1, int arg2)
    {
        adh();
        arg0.drawImage(ahi, arg1, arg2, this);
    }

    public void startProduction(ImageConsumer arg0)
    {
        addConsumer(arg0);
    }

    public synchronized void addConsumer(ImageConsumer arg0)
    {
        ahh = arg0;
        arg0.setDimensions(ahe, ahf);
        arg0.setProperties(null);
        arg0.setColorModel(ahg);
        arg0.setHints(14);
    }

    public synchronized void adh()
    {
        if(ahh == null)
        {
            return;
        } else
        {
            ahh.setPixels(0, 0, ahe, ahf, ahg, ahd, 0, ahe);
            ahh.imageComplete(2);
            return;
        }
    }

    public int ahd[];
    public int ahe;
    public int ahf;
    ColorModel ahg;
    ImageConsumer ahh;
    public Image ahi;
}
