package edu.hcc.csci233.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class CopyOfFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CopyOfFirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
				
		PrintWriter writer = response.getWriter();
		StringBuffer out = new StringBuffer();
		
		writeHTMLHeader(out);
		out.append("Hello " + firstName);
		writeHTMLFooter(out);
		
		writer.write(out.toString());
	}
	
	private void writeHTMLHeader(StringBuffer buffer)
	{
		buffer.append("<html><head><title>Hello</title></head><body>");
	}
	
	private void writeHTMLFooter(StringBuffer buffer)
	{
		buffer.append("</body></html>");
	}

	
	
	
	
	
	
	
	
	
	
	
}
