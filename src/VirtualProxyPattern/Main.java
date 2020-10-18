package VirtualProxyPattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ImageProxy ip = new ProxyImage("FireBall.jpg");
        ip.display();

        ip.display();
    }
}
