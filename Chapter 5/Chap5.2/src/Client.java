import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket cs=new Socket("localHost",95);
        Scanner sc1=new Scanner(cs.getInputStream());
        String s=sc1.nextLine();
        System.out.println("From Server: "+s);
        sc1.close();
        cs.close();
    }
}