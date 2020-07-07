package ru.titov.enterprise.servlet.project;

import ru.titov.enterprise.constant.FieldConst;
import ru.titov.enterprise.entity.Project;
import ru.titov.enterprise.repository.ProjectRepositoty;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/project-save")
public class ProjectSaveServlet extends HttpServlet {

    @Inject
    private ProjectRepositoty projectRepositoty;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final String id = req.getParameter(FieldConst.ID);
        if (id == null || id.isEmpty()) {
            sendRedirectProjectList(resp);
            return;
        }
        final Project project = projectRepositoty.findById(id);
        if (project == null) {
            sendRedirectProjectList(resp);
            return;
        }
        project.setName(req.getParameter(FieldConst.NAME));
        project.setDescription(req.getParameter(FieldConst.DESCRIPTION));
        projectRepositoty.merge(project);
        sendRedirectProjectList(resp);
    }

    private void sendRedirectProjectList(HttpServletResponse resp) throws IOException {
        resp.sendRedirect("project-list");
    }

}