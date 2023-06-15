package com.example.servelet;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/helloServlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
       message = "wiadmosoc servelet java Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();

        String parametr1  = request.getParameter("parametr1");
        String parametr2  = request.getParameter("parametr2");
        String parametr3  = request.getParameter("parametr3");

        out.println("wsyztanie 3 parametrów z zdania: ");
        out.println(parametr1);
        out.println(parametr2);
        out.println(parametr3);

       // Hello

      out.println("<html><body>");
      out.println("<h1>" + message + "</h1>");
      out.println("</body></html>");
    }

    public void destroy() {
    }
}