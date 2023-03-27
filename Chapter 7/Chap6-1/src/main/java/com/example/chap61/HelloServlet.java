package com.example.chap61;
import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@WebServlet(name="/HelloServlet", value="/HelloServlet")
public class HelloServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out=response.getWriter();
        int a=Integer.parseInt(request.getParameter("n1"));
        int b=Integer.parseInt(request.getParameter("n2"));
        out.println(a+b);
        out.close();
    }

    public void destroy() {
    }
}