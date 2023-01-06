package abhi1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet(urlPatterns="/add",loadOnStartup=3)
public class Add_Servlet extends GenericServlet{

	public Add_Servlet() {
	    System.out.println("Hello");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("init() method is called");
	}
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(req.getParameter("num1"));
    	int b=Integer.parseInt(req.getParameter("num2"));
    	
    	int c=a+b;
    	PrintWriter out=resp.getWriter();
    	out.println("<html><body bgcolor='green'>");
    	out.println("sum of two number is: "+c);
    	out.println("</body></html>");
    	
    	System.out.println("service() method is called");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy() method is called");
	}

}
