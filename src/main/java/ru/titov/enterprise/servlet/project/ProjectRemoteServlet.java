package ru.titov.enterprise.servlet.project;

import ru.titov.enterprise.constant.FieldConst;
import ru.titov.enterprise.repository.ProjectRepositoty;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/project-remove")
public class ProjectRemoveServlet extends HttpServlet {

    @Inject
    private ProjectRepositoty projectRepositoty;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final String projectId = req.getParameter(FieldConst.ID);
        projectRepositoty.removeById(projectId);
        resp.sendRedirect("project-list");
    }

}