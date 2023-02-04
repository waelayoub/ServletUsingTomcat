import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/test")
public class ServletHello extends HttpServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("  <head>");
        out.println("    <title>Welcome to my Servlet</title>");
        out.println("    <style>");
        out.println("      h1 {");
        out.println("        font-family: Arial, sans-serif;");
        out.println("        text-align: center;");
        out.println("        color: blue;");
        out.println("      }");
        out.println("");
        out.println("      .container {");
        out.println("        width: 50%;");
        out.println("        margin: 0 auto;");
        out.println("      }");
        out.println("");
        out.println("      .greeting {");
        out.println("        text-align: center;");
        out.println("        font-size: 20px;");
        out.println("        font-style: italic;");
        out.println("        color: green;");
        out.println("      }");
        out.println("    </style>");
        out.println("  </head>");
        out.println("  <body>");
        out.println("    <div class=\"container\">");
        out.println("      <h1>My Servlet</h1>");
        out.println("      <div class=\"greeting\">");
        out.println("        <p>Welcome to my Servlet Mme Rima</p>");
        out.println("      </div>");
        out.println("    </div>");
        out.println("  </body>");
        out.println("</html>");

    }

}