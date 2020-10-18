package VirtualProxyPattern;

public class ProxyImage implements ImageProxy {
    String fileName;
    RealImage ri;

    ProxyImage(String fileName)
    {
        this.fileName = fileName;
    }

    public void display()
    {
        if(ri==null)
        {
            ri = new RealImage(this.fileName);
        }

        ri.display();

    }
}
