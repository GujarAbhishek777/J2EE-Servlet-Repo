package abhi1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Square_Servlet extends HttpServlet {
   @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//	   int a=(int)req.getAttribute("c");
	   int a=Integer.parseInt(req.getParameter("c"));
	   int s=a*a;
	   PrintWriter writer=resp.getWriter();
	   writer.println("<html><body bgcolor='yellow'>");
	   writer.println("square is "+s);
	   writer.println("</body></html>");
}
}
