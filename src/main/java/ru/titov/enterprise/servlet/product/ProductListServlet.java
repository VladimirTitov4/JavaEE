package ru.titov.enterprise.servlet.product;

import ru.titov.enterprise.constant.FieldConst;
import ru.titov.enterprise.entity.Product;
import ru.titov.enterprise.repository.ProductRepository;
import ru.titov.enterprise.repository.ProductRepositoryBean;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

@WebServlet(urlPatterns = "/product-list")
public class ProductListServlet extends HttpServlet {

    @Inject
    private ProductRepository productRepository;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final Collection<Product> products = productRepository.findAll();
        req.setAttribute(FieldConst.PRODUCTS, products);
        req.getRequestDispatcher("WEB-INF/views/products-list.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
