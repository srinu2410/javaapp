package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Java Application</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Welcome to My Java Application!</h1>");
            out.println("<p>Tomcat is running successfully.</p>");
            out.println("<p>Current server time: "
                    + LocalDateTime.now() + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
