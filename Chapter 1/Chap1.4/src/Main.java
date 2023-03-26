class usingThread extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.print(i);
        }
    }
    public static void MyProg(){
        usingThread ut1=new usingThread();
        ut1.start();
        for(int i=0;i<5;i++){
            System.out.print(i);
        }
        try{
            ut1.join();
        }catch(Exception ex){
            System.out.println("Join error");
        }

    }
}
class usingRunnable implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.print(i);
        }
    }
    public static void MyProg(){
        usingRunnable ut1=new usingRunnable();
        Thread th=new Thread(ut1);
        th.start();
        for(int i=0;i<5;i++){
            System.out.print(i);
        }
    }
}
class Priorities2 extends Thread{
    Priorities2(String s){
        super(s);
    }
    Priorities2(){
    }
    public void run(){
        System.out.println("Thread: "+Thread.currentThread().getName()+" with Priority "+Thread.currentThread().getPriority());
    }
    public void MyProg(){
        Priorities2 ut1=new Priorities2("First Priority");
        Priorities2 ut2=new Priorities2("Second Priority");
        Priorities2 ut3=new Priorities2("Third Priority");
        Priorities2 ut4=new Priorities2("Fourth Priority");
        ut1.setPriority(Thread.MAX_PRIORITY);
        ut2.setPriority(Thread.MIN_PRIORITY);
        ut3.setPriority(Thread.NORM_PRIORITY);
        ut4.setPriority(4);
        ut1.start();
        ut2.start();
        ut3.start();
        ut4.start();
    }
}
class Multable{
    synchronized static void printtable(int n){
        System.out.println("Table of " + n);
        for(int i=0;i<50;i++){
            System.out.println(i*n);
        }
    }
}
class usingRunnable2 implements Runnable{
    public void run(){
        Multable.printtable(11);
    }
    public static void MyProg(){
        usingRunnable2 ut1=new usingRunnable2();
        Thread th=new Thread(ut1);
        th.start();
        Multable.printtable(15);
    }
}
public class Main {
    public static void main(String[] args) {
        //Using Thread and Join Property
        usingThread.MyProg();
        System.out.println();
        //Using Runnable
        usingRunnable.MyProg();
        System.out.println();
        //Priorities and IsAlive
        Priorities2 p3=new Priorities2();
        //Synchronized Method
        p3.MyProg();
        usingRunnable2.MyProg();
    }
}