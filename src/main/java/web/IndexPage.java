package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;

public class IndexPage extends Page {
    
    public void writeTo(HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html; charset=UTF-8");
        String buttonStyle = " style=\"background-color:#EF0754; font-size:15pt;"
            + " height: 80px; width: 300px; color: white; border-radius: 20px\"";
        
        PrintWriter writer = resp.getWriter();
    
        writer.println("<html>");
        writer.println("<head><title>Trivial Hack 2019</title></head>");
        writer.println("<body style=\"background-color:#EF0754\">");
        
        writer.println("<div style=\"text-align:center; position:fixed; top:30%; "
            + "left:0; right: 0\" class=\"boxed\">");
        writer.println("<img src=\"https://i.postimg.cc/wv9wXvTY/top-Banner.png\" "
            + "height=\"100px\" style=\"padding-bottom:15px\"> </img>");
        
        writer.println("<form>");
        writer.println("<input type=\"hidden\" name=\"purpose\" "
            + "value=\"main\">");
        writer.println("<input type=\"submit\" value=\"START\"" + buttonStyle
            + ">");
        writer.println("</form>");
        
        writer.println("</div>");
        writer.println("</body>");
        writer.println("</html>");
    }
}
