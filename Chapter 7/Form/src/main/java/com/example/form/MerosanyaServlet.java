package com.example.form;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MerosanyaServlet", value = "/MerosanyaServlet")
public class MerosanyaServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        Cookie[] cookie1=request.getCookies();
        HttpSession hs=request.getSession();
        String myname=(String)hs.getAttribute("myname");
        out.println(myname);
        if(cookie1!=null){
            for(Cookie cookie2: cookie1){
                if(cookie2.getName().equals("username")){
                    out.println(cookie2.getValue());
                }
            }
        }
    }

}
