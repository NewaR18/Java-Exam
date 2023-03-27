package com.example.form;

import java.io.*;
import java.sql.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Cookie cookie1=new Cookie("username","john");
        response.addCookie(cookie1);
        HttpSession hs=request.getSession();
        hs.setAttribute("myname","sudip");
        RequestDispatcher rd=request.getRequestDispatcher("MerosanyaServlet");
        rd.forward(request,response);
    }
        /*PrintWriter out=response.getWriter();
        int a=Integer.parseInt(request.getParameter("n1"));
        String b=(String)request.getParameter("n2");
        int c=Integer.parseInt(request.getParameter("n3"));
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/dab";
            String username="root";
            String password="admin";
            Connection conn= DriverManager.getConnection(url,username,password);
            String query2="insert into mytable values(?,?,?)";
            PreparedStatement st=conn.prepareStatement(query2);
            st.setInt(1,a);
            st.setString(2,b);
            st.setInt(3,c);
            st.executeUpdate();
            st.close();
            conn.close();
        }catch(Exception ex){
            System.out.println();
        }


        out.println(a+b);
        out.close();
    }*/

    public void destroy() {
    }
}