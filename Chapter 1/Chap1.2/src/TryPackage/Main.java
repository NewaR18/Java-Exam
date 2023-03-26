package TryPackage;
class MySDArray{
    public void printit(){
        int[] myarry=new int[5];
        myarry[0]=0;
        myarry[1]=2;
        myarry[2]=4;
        myarry[3]=9;
        myarry[4]=12;
        for(int i: myarry){
            System.out.print(i);
        }
        System.out.println();
    }
}
class MyMDArray{
    public void printit(){
        int[][] myarry=new int[][]{
                new int[]{3,4,5},
                new int[]{9,8,7},
                new int[]{2,1,3}
        };
        int[][] myarry2=new int[][]{{3,4,5},{9,8,},{2}};
        for(int[] i: myarry){
            for(int k : i){
                System.out.print(k);
            }
        }
        System.out.println();
        for(int[] i: myarry2){
            for(int k : i){
                System.out.print(k);
            }
        }
        System.out.println();
    }
}
class tryOverloading{
    public int sum(int a,int b){
        return a+b;
    }public float sum(float a,float b){
        return a+b;
    }public String sum(String a,String b){
        return a+b;
    }public int sum(int a){
        return a+a;
    }
}
interface fIn{
    void print1();
}
interface sIn{
    void print2();
}
class pIn implements fIn,sIn{
    public void print1() {
        System.out.println("First Interface");
    }
    public void print2() {
        System.out.println("Second Interface");
    }
}
class Outer_Class1{
    static class Inner_Class1{
        static void print1(){
            System.out.println("This is from Static Nested Class");
        }
    }
}
class Outer_Class2{
     class Inner_Class2{
         void print1(){
            System.out.println("This is from Non-Static Nested Class");
        }
    }
}
class Outer_Class3{
    public void Imp(){
        class Inner_Class3{
            void print1(){
                System.out.println("This is from Local Inner Class");
            }
        }
        Inner_Class3 i3=new Inner_Class3();
        i3.print1();
    }
}
abstract class Outer_Class4a{
    public abstract void print1();
}
class Outer_Class4b{
    public void printOut(){
        Outer_Class4a o4=new Outer_Class4a() {
            public void print1() {
                System.out.println("This is Anonymous Inner Class");
            }
        };
        o4.print1();
    }
}
class TestFinal{
    final static int a=4;
    final static void print1(){
        System.out.println("Final and Static both called");
    }
}
class InhAndOver{
    int a=12;
    int b=2;
    int sum(){
        System.out.println("Hello");
        return a+b;
    }
}
class InhAndOver2 extends InhAndOver{
    int b=5;
    int sum(){
        int c=super.sum();
        System.out.println(c);
        return a-super.b;
    }
}
public class Main {
    public static void main(String[] args) {
        //Single Dimensional Array
        MySDArray s1=new MySDArray();
        s1.printit();
        //Multi Dimensional Array
        MyMDArray m1=new MyMDArray();
        m1.printit();
        //Overloading
        tryOverloading t1=new tryOverloading();
        System.out.println(t1.sum(1,2));
        System.out.println(t1.sum(1.2f,2.9f));
        System.out.println(t1.sum("1","2"));
        System.out.println(t1.sum(2));
        //Multiple Inheritance using Interface
        pIn p1=new pIn();
        p1.print1();
        p1.print2();
        //Static Nested Class
        Outer_Class1.Inner_Class1.print1();
        //Non-Static Nested Class
        Outer_Class2 o2=new Outer_Class2();
        Outer_Class2.Inner_Class2 o2a=o2.new Inner_Class2();
        o2a.print1();
        //Local Inner Class
        Outer_Class3 o3=new Outer_Class3();
        o3.Imp();
        //Anonymous Inner Class
        Outer_Class4b o4=new Outer_Class4b();
        o4.printOut();
        //Final and static modifiers
        System.out.println(TestFinal.a);
        TestFinal.print1();
        InhAndOver2 io2=new InhAndOver2();
        System.out.println(io2.sum());
    }
}