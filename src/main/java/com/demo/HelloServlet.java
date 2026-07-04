package com.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        response.getWriter().println("<!DOCTYPE html>");
        response.getWriter().println("<html>");
        response.getWriter().println("<head>");
        response.getWriter().println("<title>Jenkins CI/CD Demo</title>");
        response.getWriter().println("</head>");
        response.getWriter().println("<body>");
        response.getWriter().println("<h1>Java Web Application</h1>");
        response.getWriter().println("<h2>Successfully Deployed Using Jenkins Pipeline!</h2>");
        response.getWriter().println("<p>Build Tool : Maven</p>");
        response.getWriter().println("<p>Version Control : GitHub</p>");
        response.getWriter().println("<p>CI Tool : Jenkins</p>");
        response.getWriter().println("<p>Application Server : Apache Tomcat</p>");
        response.getWriter().println("</body>");
        response.getWriter().println("</html>");
    }
}
