

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisServlet")
public class RegisServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String name=request.getParameter("name");
	Integer age=Integer.parseInt(request.getParameter("age"));
	String email=request.getParameter("email");
	String subject=request.getParameter("subject");
	response.setContentType("text/html");
	PrintWriter pw=response.getWriter();
	//age<18 || >30 not eligible for job
	
	if(age<18 || age>30) {
		response.sendError(504,"user age is not sufficient!!"); 
		
	}
	else {
		//or else he is eligible for recruitment
		pw.print("<html><head><title>output is:</title></head>");
		pw.print("<body>");
		pw.print("<font color='red'><h1>welcome to gopika's hub</h2>");
		pw.print("<h1>user registration details</h1>");
		pw.print("</font>");
		pw.print("<table border='1'>");
		pw.print("<tr><td>uname</td><td>"+name+"</td></tr>");
		pw.print("<tr><td>age</td><td>"+ age +"</td></tr>");
		pw.print("<tr><td>email</td><td>"+email+"</td></tr>");
		pw.print("<tr><td>subject</td><td>"+subject+"</td></tr>");
		pw.print("<tr><td>Registration status</td><td>registered succcesfully!!</td></tr>");
		pw.print("</table></body></html>");
		pw.close();
		
	}
	
	
	
	
	
	}

}
