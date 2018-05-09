import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

import java.io.IOException;


@WebServlet(urlPatterns = "/go")
@MultipartConfig
public class DistributorServlet extends HttpServlet {
    @Autowired
    private ProcessRunner processRunner;

    public static final String FORM_JSP_PATH = "/WEB-INF/form.jsp";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher(FORM_JSP_PATH);
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       PrintWriter out = resp.getWriter();
       processRunner = new SomeProcessRunner(Stepper.createStepper());
       out.print(processRunner.runProcess());
       Stepper.clear();
    }


}
