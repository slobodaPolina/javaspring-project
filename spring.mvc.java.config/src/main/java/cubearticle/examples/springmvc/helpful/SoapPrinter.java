package cubearticle.examples.springmvc.helpful;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.jsp.JspWriter;

public class SoapPrinter {
	// REMAKE IT USING FOREACH JSP
	public static void print(JspWriter out) throws IOException {
		SoapCurrenciesBrowser browser = new SoapCurrenciesBrowser();
		ArrayList<Currency> list = browser.getresult();
		out.println("Currencies today:");
		out.print("<table class='table table-striped table-sm table-bordered'>");
		out.print("<thead><tr><th>Name</th><th>CharCode</th><th>NumCode</th></tr></thead>");
		for (int i = 0; i < list.size(); i++) {
			out.print("<tr>");
			out.println("<td>" + list.get(i).getName() + "</td> <td> " + list.get(i).getCharCode() + "</td> <td>"
					+ list.get(i).getNumCode() + "</td>");
			out.print("</tr>");
		}
		out.println("</table>");
	}
}
