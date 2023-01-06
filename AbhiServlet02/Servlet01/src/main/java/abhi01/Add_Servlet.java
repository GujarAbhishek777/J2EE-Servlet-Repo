package abhi01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Add_Servlet extends GenericServlet {
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String a=req.getParameter("n1");  //num1 is the name of textfield in form
		int b=Integer.parseInt(req.getParameter("n2"));
		String c=req.getParameter("n3");
		String d=req.getParameter("n4");
		String e=req.getParameter("n5");
		String f=req.getParameter("n6");
	
//		System.out.println(sum);
		
		PrintWriter writer=resp.getWriter();
		writer.println("<html><body bgcolor='cyan'><fieldset style=\"background-color: red;\">");
		writer.println("<h1>@@@@@ ***ABHI-FITNESS*** @@@@@</h1>");
		writer.println("Welcome Mr."+a);
		writer.println("have a good Day!!!");
		writer.println("<br>");
		writer.println("Your Age is : "+b);
		writer.println("<br>");
		writer.println("Your Gender is : "+c);
		writer.println("<br>");
		writer.println("Your Locality is : "+d);
		writer.println("<br>");
		writer.println("Your Mobile Number is : "+e);
		writer.println("<br>");
		writer.println("Your Email ID is : "+f);
		if(b>18) {
			writer.println("<h2>Your are eligible to Register for the Competition!!!</h2>");
		}else {
			writer.println("<h2>Your are not eligible to Register for the Competition!!!</h2>");
		}
		writer.println("</fieldset></body></html>");
	}
	
}