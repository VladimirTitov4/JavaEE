package ru.titov.enterprise.servlet;

import ru.titov.enterprise.products.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = {"/catalog"})
public class CatalogServlet extends HttpServlet {
    private List<Product> list = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        list.add(new Product("product1", 100));
        list.add(new Product("product2", 150));
        list.add(new Product("product3", 200));

        RequestDispatcher dispatcher = req.getRequestDispatcher("/catalog.jsp");
        dispatcher.forward(req, resp);
    }
}
