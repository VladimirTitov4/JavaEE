package ru.titov.enterprise.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.rmi.ServerException;

@WebServlet(name = "Controller", urlPatterns = {"/", "/main", "/catalog"})
public class Controller extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServerException, IOException, ServletException {
        response.setContentType("text/html:charset=UTF-8");
        String url = "WEB-INF/";
        if (request.getServletPath().equals("/") ||
            request.getServletPath().equals("/main")) url += "main.jsp";
        else if (request.getServletPath().equals("/catalog")) url += "catalog.jsp";
        request.getRequestDispatcher("url").forward(request, response);
    }

}
