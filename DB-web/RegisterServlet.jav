import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.sql.*;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String roll = request.getParameter("roll");
        String name = request.getParameter("name");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to DB
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb", "root", "your_password");

            // Prepare SQL query
            PreparedStatement ps = con.prepareStatement("INSERT INTO students (roll, name) VALUES (?, ?)");
            ps.setString(1, roll);
            ps.setString(2, name);

            int result = ps.executeUpdate();

            if (result > 0) {
                out.println("<h3>Data saved successfully!</h3>");
            } else {
                out.println("<h3>Failed to save data.</h3>");
            }

            con.close();
        } catch (Exception e) {
            out.println("<h3>Error: " + e.getMessage() + "</h3>");
        }
    }
}
