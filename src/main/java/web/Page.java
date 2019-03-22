package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;

public abstract class Page {
    
    protected void topBanner(HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        
        writer.println("<html>");
        writer.println("<head><title>Trivial Hack 2019</title></head>");
        writer.println("<body>");
    
        writer.println("<div style=\"background-color: #EF0754; " +
            "padding-top:10px; padding-bottom:10px; text-align:center; " +
            "position: fixed\" class=\"boxed\"> <img src=\"images/topBanner.png\" " +
            "height=\"100px\"> </div>");
    }
    
    protected void bottomBanner(HttpServletResponse resp) throws IOException {
        PrintWriter writer = resp.getWriter();
    
        writer.println("<div style=\"background-color:#EF0754; padding-top:1px; " +
            "padding-top:5px; padding-bottom:5px; text-align:right; " +
            "width:100%; bottom:0; position:fixed\" class=\"boxed\">" +
            "<img src=\"images/bottomBanner.png\" height=\"50px\"> </div>");
        writer.println("</a>");
    
        writer.println("</body>");
        writer.println("</html>");
    }
}
