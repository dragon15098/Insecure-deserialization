
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Base64;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/decode")
public class Decode extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String obj = req.getParameter("obj");
        byte[] data = Base64.getDecoder().decode(obj);

        ByteArrayInputStream in = new ByteArrayInputStream(data);
        ObjectInputStream ois = new ObjectInputStream(in);
        try {
            User o = (User) ois.readObject();
            resp.getWriter().write(o.toString());
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            ois.close();
        }
    }
}
