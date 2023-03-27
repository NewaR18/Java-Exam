import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket scs=new ServerSocket(95);
        Socket cs=scs.accept();
        PrintWriter outs=new PrintWriter(cs.getOutputStream(),true);
        outs.println("hello Client");
        outs.close();
        cs.close();
        scs.close();
    }
}
