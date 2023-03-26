class tcf{
    int a=10;
    int b=0;
    void div(){
        try{
        System.out.println(a/b);
        }catch(ArithmeticException e1){
            System.out.println(e1.getMessage());
        }
        finally{
            System.out.println("Calculations Completed");
        }
    }
}
class trythrow{
    int a=10;
    int b=0;
    void div(){
        try{
        System.out.println(a/b);
        }catch(ArithmeticException e1){
            /*throw e1;*/
        }
        finally{
            System.out.println("Calculations Completed");
        }
    }
}
class trythrows{
    int a=10;
    int b=0;
    void div() throws ArithmeticException{
        System.out.println(a/b);
    }
}
class CustomException1 extends Exception{
    public CustomException1(String s){
        super(s);
    }
}
class CallException{
    public static void Validate(int a) throws CustomException1{
        if(a<0){
            throw new CustomException1("Value cannot be less than 0");
        }else{
            System.out.println("Its OKay");
        }
    }
    void try2(){

    }

}
public class Main {
    public static void main(String[] args) {
        //Try Catch Finally
        tcf t1=new tcf();
        t1.div();
        //Throw
        trythrow t2=new trythrow();
        t2.div();
        //Throws
        trythrows t3=new trythrows();
        try {
            t3.div();
        }catch(ArithmeticException e1){
            System.out.println("Yyo");
        }
        //CustomException
        try {
            CallException.Validate(-10);
        } catch (CustomException1 e) {
            System.out.println(e.getMessage());
        }
    }
}