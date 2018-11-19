import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        PrintWriter out = resp.getWriter();
//        out.print("<html><head><title>Test</title></head><body>");
//        out.print("<form method='get' action='/logout'>");
//        out.print("<p>Please click the button to logout</p>");
//        out.print("<input type='submit' value='Log out'/>");
//        out.print("</form>");
//        out.print("</body></html>");
//    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SessionContext sessionContext = new SessionContext();
        boolean abc = false;
        for (UserDTO user : sessionContext.users) {
            if (user.getUsername().equals(req.getParameter("name")) && user.getPassword().equals(req.getParameter("password"))) {
                HttpSession httpSession = req.getSession();
                Cookie cookie = new Cookie("name", user.getUsername());
                if (req.getParameter("chk") != null && req.getParameter("chk").equals("on"))
                    cookie.setMaxAge(3600); //in seconds
                else
                    cookie.setMaxAge(0);

                resp.addCookie(cookie);
                httpSession.setAttribute("user", user);
                resp.sendRedirect("/hello");
                abc = true;
            }
        }
        if (!abc) {
            req.setAttribute("error", "User Not Found!");
            RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
            dispatcher.forward(req, resp);
        }

    }
}
