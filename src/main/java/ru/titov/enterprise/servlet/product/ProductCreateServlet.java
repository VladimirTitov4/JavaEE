package ru.titov.enterprise.servlet.product;

import ru.titov.enterprise.entity.Product;
import ru.titov.enterprise.repository.ProductRepository;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/product-create")
public class ProductCreateServlet extends HttpServlet {

    @Inject
    private ProductRepository productRepository;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final Product product = new Product("created product");
        productRepository.addProduct(product);
        resp.sendRedirect("product-list");
    }
}
