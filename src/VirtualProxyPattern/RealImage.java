package VirtualProxyPattern;

import java.awt.*;

public class RealImage implements ImageProxy {

    String fileName;

    RealImage(String fileName)
    {
        this.fileName = fileName;
        System.out.println("Loading" + this.fileName + " from database....");
    }

    public void display()
    {
        System.out.println("Displaying: " + this.fileName);
    }

}
