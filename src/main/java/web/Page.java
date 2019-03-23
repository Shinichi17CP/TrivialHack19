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
        writer.println("<body style=\"margin: 0\">");
    
        writer.println("<div style=\"background-color:#EF0754; " +
            "top:0; left:0; right: 0; text-align:center; " +
            "position:absolute\" class=\"boxed\">");
        writer.println("<img src=\"https://i.postimg.cc/wv9wXvTY/top-Banner.png\" "
            + "height=\"100px\"> </img>");
        writer.println("</div>");
    }
    
    protected void bottomBanner(HttpServletResponse resp) throws IOException {
        PrintWriter writer = resp.getWriter();
    
        writer.println("<div style=\"background-color:#EF0754; "
            + "padding-top:5px; padding-bottom:5px; "
            + "text-align:right; width:100%; bottom:0; position:relative\" "
            + "class=\"boxed\">");
        writer.println("<img src=\"https://i.postimg.cc/Xvf2BFWg/bottom-Banner.png\" "
            + "height=\"50px\"> </img>");
        writer.println("</div>");
    
        writer.println("</body>");
        writer.println("</html>");
    }
}
