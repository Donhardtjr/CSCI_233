package javapackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReturnHTML extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	    	throws ServletException, IOException {
				response.setContentType("text/html");
				PrintWriter output = response.getWriter();
	    		String title = "Get Ron's first JSP app";
	    		String docType = "<!DOCTYPE HTML>\n";
	    		output.println(docType +
	    				"<HTML>\n" +
	    	 			"<HEAD><TITLE>" + title + "<TITLE></HEAD>\n" +
	    	 			"<BODY BGCOLOR=\"#FDF5E6\">\n" +
	    				"<H1>" + title + "</H1>\n" +
	    				"</BODY></HTML>" ); 	
	    } 	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
    	throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter output = response.getWriter();
    		String title = "Ron's first JSP app";
    		String docType = "<!DOCTYPE HTML>\n";
    		output.println(docType +
    				"<HTML>\n" +
    	 			"<HEAD><TITLE>" + title + "<TITLE></HEAD>\n" +
    	 			"<BODY BGCOLOR=\"#FDF5E6\">\n" +
    				"<H1>" + title + "</H1>\n" +
    				"</BODY></HTML>" ); 	
    } 	
} 
		

  

