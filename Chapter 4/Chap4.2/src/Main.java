import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException,SQLException{
        Scanner sc1=new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/dab";
        String username="root";
        String password="admin";
        /*Connection conn=DriverManager.getConnection(url,username,password);*/

        //Prepared Statement
        /*System.out.print("Enter Id: ");
        int id=sc1.nextInt();
        System.out.print("Enter name: ");
        String name=sc1.next();
        System.out.print("Enter Age: ");
        int age=sc1.nextInt();
        System.out.print("Enter Address: ");
        String address=sc1.next();
        String query2="Insert into employee values (?,?,?,?)";
        PreparedStatement ps= conn.prepareStatement(query2);
        ps.setInt(1,id);
        ps.setString(2,name);
        ps.setInt(3,age);
        ps.setString(4,address);
        ps.executeUpdate();*/

        //Multiple Results
        /*//String url="jdbc:mysql://localhost:3306/dab?allowMultipleQueries=true";
        Statement st=conn.createStatement();
        String query="Select* from employee where empage< 20; Select* from employee where empage>40";
        boolean res=st.execute(query);
        do{
            if(res){
                ResultSet rs=st.getResultSet();
                while(rs.next()){
                    System.out.print(rs.getInt("empid"));
                    System.out.print(rs.getString("empnme"));
                    System.out.print(rs.getInt("empage"));
                    System.out.print(rs.getString("empaddress"));
                }
            }
            res=st.getMoreResults();
        }while(res);*/

        //Scrollable and Updatable Resultset
        /*Statement st=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet rs=st.executeQuery("Select* from mytable");
        *//*rs.absolute(1);
        System.out.println(rs.getString("uname"));
        rs.moveToInsertRow();
        rs.updateInt("id",3);
        rs.updateString("uname","Patrick");
        rs.updateInt("age",28);
        rs.insertRow();*//*
        rs.absolute(2);
        System.out.println(rs.getString("uname"));
        rs.updateString("uname","bahadur");
        rs.updateRow();
        st.close();
        conn.close();*/

        //RowSet
        RowSetFactory rsf= RowSetProvider.newFactory();
        JdbcRowSet jrs=rsf.createJdbcRowSet();
        jrs.setUrl(url);
        jrs.setUsername(username);
        jrs.setPassword(password);
        jrs.setCommand("Select* from mytable");
        jrs.execute();
        while(jrs.next()){
            System.out.print(jrs.getInt("id"));
            System.out.print(jrs.getString("uname"));
            System.out.print(jrs.getInt("age"));
        }


    }

}