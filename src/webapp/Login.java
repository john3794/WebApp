package webapp;

import applayer.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by jonb on 13/03/17.
 */

public class Login extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        User userObject = new User();

        String sLoginName = request.getParameter("loginname");
        String sPassword = request.getParameter("password");

        if (userObject.validUserCredentials(sLoginName,sPassword))
        {
            request.setAttribute("loginname",sLoginName);
            request.setAttribute("password",sPassword);
            request.getRequestDispatcher("/welcome.jsp").forward(request,response);
        }
        else
        {
            request.setAttribute("errorMessage","User credentials not valid!");
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        request.getRequestDispatcher("/login.jsp").forward(request,response);
    }
}
