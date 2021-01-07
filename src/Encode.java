

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import java.io.*;

@WebServlet("/encode")
public class Encode extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        user.username = req.getParameter("username");
        user.email = req.getParameter("email");
        user.year = req.getParameter("year");
        user.sex = req.getParameter("sex");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(user);
        oos.close();
        resp.getWriter().write(Base64.getEncoder().encodeToString(baos.toByteArray()));
    }
}
