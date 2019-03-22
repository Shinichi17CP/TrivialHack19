package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;

public class ResultPage extends Page {
    
    public void writeTo(HttpServletResponse resp, int score)
        throws IOException {
        topBanner(resp);
        
        PrintWriter writer = resp.getWriter();
        writer.println("<input type=\"hidden\" name=\"purpose\" "
            + "value=\"result\">");
    
        writer.println("<head>" + "<title>Results</title>" + "</head>");
    
        writer.println("<body style=\"background-color:#EF0754\">");
        writer.println("<div style=\"padding: 40%; position: relative\">");
        writer.println("<centre>");
    
        writer.println("<h1>Your result is </h1>");
        writer.println("<h2>" + score + "/400 </h2>");
    
        String buttonStyle = " style=\"background-color:#EF0754; " +
            "font-size:20px; font-size: 15pt; " +
            "height: 80px; width: 300px; margin-top: 5%; color: white; " +
            "border-radius: 20px;";
    
        writer.print("<form>" +
            "<input type=\"button\" value=\"Try Again\" " +
            "onClick=\"callServlet()\"" + buttonStyle + ">" +
            "</form>");
    
        writer.println("</centre>");
        writer.println("</div>");
    
        bottomBanner(resp);
    }
}
