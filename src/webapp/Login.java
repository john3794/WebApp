package webapp;

import AppLayer.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Login extends HttpServlet {

    /** used in form */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /*
        PrintWriter out = response.getWriter();
        out.println("doPost version:");
        out.print("loginname: " + request.getParameter("loginname") + " " + "Password: " + request.getParameter("password"));
        */

        User userObject = new User();

        //set username attribute as the parameter loginname, so in welcome.jsp username is always loginname
        request.setAttribute("username", request.getParameter("loginname"));
        request.setAttribute("password", request.getParameter("password"));


        if(userObject.validUserCredentials(request.getParameter("loginname"), request.getParameter("password"))) {
            request.getRequestDispatcher("/welcome.jsp").forward(request, response);
        }else{
            request.setAttribute("errorMessage","User credentials not valid!");
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }

        /*
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
        */

    }

    /** used in URL */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        /** "http://localhost:8080/login?loginname=123&password=123"
         *
         * request using URL
         */
        PrintWriter out = response.getWriter();
        out.print("loginname: " + request.getParameter("loginname") + " " + "Password: " + request.getParameter("password"));
        //request.getRequestDispatcher("/login.jsp").forward(request,response);
    }
}