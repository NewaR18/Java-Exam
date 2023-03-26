import java.io.*;

class ByteStreamClass{
    static void transfer() throws IOException{
        FileInputStream fin=null;
        FileOutputStream fout=null;
        try{
            fin=new FileInputStream("first.txt");
            fout=new FileOutputStream("second.txt");
            int c=0;
            while((c=fin.read())!=-1){
                fout.write(c);
                System.out.print((char)c);
            }
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }finally{
            fin.close();
            fout.close();
        }
    }
}
class CharacterStreamClass{
    static void transfer() throws IOException{
        FileReader fr=null;
        FileWriter fw=null;
        try{
            fr=new FileReader("first.txt");
            fw=new FileWriter("second.txt");
            int c;
            while((c=fr.read())!=-1){
                char ch=(char)c;
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    fw.write(c);
                }
            }
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }finally{
            fr.close();
            fw.close();
        }
    }
}
class RandomAccessFileClass{
    static void transfer() throws IOException{
        RandomAccessFile file = new RandomAccessFile("first.txt", "r");
        RandomAccessFile file2= new RandomAccessFile("second.txt", "rw");
        file.seek(0);
        file2.seek(1);
        byte[] bytes = new byte[4];
        file.read(bytes);
        file2.write(bytes);
        for(byte bt : bytes) {
            System.out.print((char)bt);
        }
        file.close();
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        ByteStreamClass.transfer();
        CharacterStreamClass.transfer();
        RandomAccessFileClass.transfer();
    }
}