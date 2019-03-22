package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;

public class IndexPage {
    
    public void writeTo(HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter writer = resp.getWriter();
    
        writer.println("<html>");
        writer.println("<head><title>Trivial Hack 2019</title></head>");
        writer.println("<body>");
    
        writer.println("<input type=\"hidden\" name=\"purpose\" " +
            "value=\"main\">");
    
        writer.println("<div style=\"top: 40%; left: 40%; position: " +
            "relative\">");
        
        writer.println("<center>");
        writer.println("<img src=\"images/topBanner.png\" height=\"100px\">");
        
        String buttonStyle = " style=\"background-color:#EF0754; " +
            "font-size: 15pt; height: 80px; width: 300px; margin-top: 5%; " +
            "color: white; border-radius: 20px;\"";
    
        writer.println("<form> " +
            "<input type=\"button\" value=\"START\"" +
            buttonStyle + "> " +
            "</form>");
    
        writer.println("</center>");
        writer.println("</div>");
    
        writer.println("</body>");
        writer.println("</html>");
    }
}
