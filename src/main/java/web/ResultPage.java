package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;

public class ResultPage extends Page {
    
    public void writeTo(HttpServletResponse resp, int score)
        throws IOException {
        String buttonStyle = " style=\"background-color:#EF0754; " +
            "font-size: 15pt; height:80px; width:300px; "
            + "color:white; border-radius: 20px\"";
        
        PrintWriter writer = resp.getWriter();
        
        writer.println("<html>");
        writer.println("<head>" + "<title>Results</title>" + "</head>");
        writer.println("<body style=\"background-color:#EF0754\">");
    
        writer.println("<div style=\"text-align:center; "
            + "padding-top:10%; left:0; right: 0\" class=\"boxed\">");
        writer.println("<img src=\"https://i.postimg.cc/wv9wXvTY/top-Banner.png\" "
            + "height=\"100px\"> </img>");


        writer.println("<h2 style=\"color:white\">Your result is </h2>");
        writer.println("<h1 style=\"color:white\">" + score + "/400 </h1>");
        
        writer.print("<form>" +
            "<input type=\"hidden\" name=\"purpose\" value=\"result\">" +
            "<input type=\"submit\" value=\"Try Again\"" + buttonStyle + ">" +
            "</form>");

        writer.println("<img src=\"https://i.postimg.cc/Xvf2BFWg/bottom-Banner.png\" "
            + "height=\"50px\" style=\"padding-top:10px\"> </img>");
        writer.println("</div>");
    
        
        writer.println("</body>");
        writer.println("</html>");
    }
}
