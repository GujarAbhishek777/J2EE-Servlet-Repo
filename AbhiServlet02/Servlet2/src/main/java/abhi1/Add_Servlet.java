package abhi1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class Add_Servlet extends HttpServlet {
	
	
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	int a=Integer.parseInt(req.getParameter("num1"));
    	int b=Integer.parseInt(req.getParameter("num2"));
    	
    	int c=a+b;
    	PrintWriter out=resp.getWriter();
    	out.println("<html><body bgcolor='green'>");
    	out.println("sum of two number is: "+c);
    	out.println("</body></html>");
//    	req.setAttribute("c", c);
//    	RequestDispatcher dispatcher=req.getRequestDispatcher("sq");
//    	dispatcher.forward(req,resp);
//    	dispatcher.include(req, resp);
 //   	resp.sendRedirect("sq?c="+c);
 //   	resp.sendRedirect("https://www.youtube.com");
    	
    	HttpSession session = req.getSession();
    	session.setAttribute("c",c );
    	resp.sendRedirect("sq");
    }
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//    	int a=Integer.parseInt(req.getParameter("num1"));
//    	int b=Integer.parseInt(req.getParameter("num2"));
//    	
//    	int c=a+b;
//    	PrintWriter out=resp.getWriter();
//    	out.println("<html><body bgcolor='green'>");
//    	out.println("sum of two number is: "+c);
//    	out.println("</body></html>");
//    }
	
//	  @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//    	int a=Integer.parseInt(req.getParameter("num1"));
//    	int b=Integer.parseInt(req.getParameter("num2"));
//    	
//    	int c=a+b;
//    	PrintWriter out=resp.getWriter();
//    	out.println("<html><body bgcolor='green'>");
//    	out.println("sum of two number is: "+c);
//    	out.println("</body></html>");
//    }
	
}
