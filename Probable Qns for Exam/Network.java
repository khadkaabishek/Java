import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import jakarta.servlet.annotation.*;

@WebServlet("/auth")
public class Network extends WebServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws Exception {
        res.setContentType("text/html");
        RequestDispatcher rd;
        String uname = req.getParameter("uname");
        String pass = req.getParameter("pass");
        HttpSession ssn = req.getSession(true);
        PrintWriter out = new getWriter();
        if (uname.equals("abc") && pass.equals("xyz")) {
            ssn.setAttribute("uname", uname);
            rd = new getRequestDispatcher("dashboard");
            rd.forward(req, res);
        } else {
            rd = new getRequestDispatcher("index.html");
            out.println("<font color ='red'>Invalid Credential</font>");
            rd.include(req, res);
        }
    }
}

@WebServlet("/dashboard")
public class Dash extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws Exception {
        res.setContentType("text/html");
        HttpSession ssn = req.getSession(true);
        RequestDispatcher rd;
        PrintWriter out = res.getWriter();
        if (ssn.isNew()) {
            rd = new getRequestDispatcher("index.html");
            out.println("Login First");
            rd.include(req, res);

        } else {
            String uname = ssn.getAttribute("uname");
            out.println("hello " + uname);
        }
    }
}