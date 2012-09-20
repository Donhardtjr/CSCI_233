package JavaPackage;

import javax.servlet.http.HttpServlet;

public class ReturnTextAndHTML extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ReturnTextAndHTML() {
    }

	public static String getHTML(String title) {
		return("<!DOCTYPE HTML PUBLIC>\n" +
 			   "<HTML>\n" +
 			   "<HEAD><TITLE>" + title + "<TITLE></HEAD>\n" +
 			  "<BODY BGCOLOR=\"#FDF5E6\">\n" +
				"<H1>" + title + "</H1>\n" +
				"</BODY></HTML>" ); 
	}
	public static String getText() {
		String x = "text from Assignment3Servlet";
		return x;
	}
}
