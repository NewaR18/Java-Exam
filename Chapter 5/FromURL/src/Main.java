import java.io.*;
import java.net.*;

public class Main{
    public static void main(String[] args) throws Exception{
        URL oracle = new URL("https://www.oracle.com");
        URLConnection yc = oracle.openConnection();

        BufferedReader in = new BufferedReader(new InputStreamReader(
                yc.getInputStream()
        ));

        String inputLine;
        while((inputLine = in.readLine()) != null){
            System.out.println(inputLine);
        }
    }
}