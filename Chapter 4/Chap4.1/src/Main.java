import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException,SQLException{
        Scanner sc1=new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/dab";
        String username="root";
        String password="admin";
        Connection conn=DriverManager.getConnection(url,username,password);
        Statement st=conn.createStatement();
        System.out.print("Enter Id: ");
        int id=sc1.nextInt();
        System.out.print("Enter name: ");
        String name=sc1.next();
        System.out.print("Enter Age: ");
        int age=sc1.nextInt();
        System.out.print("Enter Address: ");
        String address=sc1.next();
        String query2="Insert into employee values ("+id+",'"+name+"',"+age+",'"+address+"')";
        st.executeUpdate(query2);
        String query3="Update employee set empnme='"+name+"',empage="+age+",empaddress='"+address+"' where empid=4";
        st.executeUpdate(query3);
        try{
            String query4="Delete from employee where empid=4";
            st.executeUpdate(query4);
        }catch(Exception ex){
            System.out.println("Above Id not found");
        }
        String query="Select* from employee";
        ResultSet rs=st.executeQuery(query);
        while(rs.next()){
            System.out.print(rs.getInt("empid"));
            System.out.print(rs.getString("empnme"));
            System.out.print(rs.getInt("empage"));
            System.out.print(rs.getString("empaddress"));
            System.out.println();
        }
        st.close();
        conn.close();
        }

    }