package javapackage;

public class ReturnHTMLUtility {
	public static final String DOCTYPE =
			"<!DOCTYPE HTML PUBLIC>";
       public static String headWithTitle(String title) {
    	   return(DOCTYPE + "\n" +
    			   "<HTML>\n" +
    			   "<HEAD><TITLE>" + title + "<TITLE></HEAD>\n");
	}
}
