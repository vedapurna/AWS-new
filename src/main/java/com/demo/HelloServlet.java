package com.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        response.getWriter().println("<html>");
        response.getWriter().println("<head><title>Jenkins Demo</title></head>");
        response.getWriter().println("<body>");
        response.getWriter().println("<h1>Java Web Application</h1>");
        response.getWriter().println("<h2>Successfully deployed using Jenkins!</h2>");
        response.getWriter().println("</body>");
        response.getWriter().println("</html>");
    }
}
