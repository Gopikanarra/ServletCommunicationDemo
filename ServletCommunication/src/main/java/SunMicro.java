import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SunMicro")
public class SunMicro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * PrintWriter pw=response.getWriter();
		 * pw.print("<html><head><title>Response</title></head>"); pw.print("<body>");
		 * pw.print("<h1>to get the services click on the below link...</h1>");
		 * pw.print("<a href='http://localhost:8080/OracleApp/index.html'>click me</a>"
		 * ); pw.print("</body>" + "</html>");
		 */
		String loc="http://localhost:8080/OracleApp/index.html";
		response.sendRedirect(loc);
		
	}

	

}
