package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import questions.Question;

public class QuestionPage extends Page {
    
    public void writeTo(HttpServletResponse resp, Question question)
        throws IOException {
    
        topBanner(resp);
    
        // Content (Print out question and four choices)
        writeQuestion(resp, question);
        writeChoices(resp,question);
    
        bottomBanner(resp);
    }
    
    // Writes question to the http page
    private void writeQuestion(HttpServletResponse resp, Question question)
        throws IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("<div style=\"padding-top:100px; "
            + "padding-bottom:20px\">");
        writer.println("<h1 style=\"padding-left: 30px; "
            + "font-family: Georgia\">" + question.getQuestion() + "</h1>");
    }
    
    // Writes four buttons presenting possible answers to the question
    private void writeChoices(HttpServletResponse resp, Question question)
        throws IOException {
        String buttonStyle = " style=\"background-color:#EF0754; " +
            "font-size: 15pt; white-space: normal; height: 80px; width: "
            + "700px; padding:5px; color: white; border-radius: 20px\"";
        List<String> randomAnswers = randomiseAnswers(question);

        PrintWriter writer = resp.getWriter();
        
        writer.println("<form>");
        
        writer.println("<input type=\"hidden\" name=\"purpose\" value=\"question\">");
        
        writer.println("<h2 style=\"text-align: center; padding-top: 5px\">" +
            "<input type=\"submit\" name=\"optA\" value=\"" +
            randomAnswers.get(0) + "\"" + buttonStyle + ">" +
            "</h2>");
        
        writer.println("<h2 style=\"text-align: center\">" +
            "<input type=\"submit\" name=\"optB\" value=\"" +
            randomAnswers.get(1) + "\"" + buttonStyle + ">" +
            "</h2>");
    
        writer.println("<h2 style=\"text-align: center\">" +
            "<input type=\"submit\" name=\"optC\" value=\"" +
            randomAnswers.get(2) + "\"" + buttonStyle + ">" +
            "</h2>");
    
        writer.println("<h2 style=\"text-align: center\">" +
            "<input type=\"submit\" name=\"optD\" value=\"" +
            randomAnswers.get(3) + "\"" + buttonStyle + ">" +
            "</h2>");
        
        writer.println("</form>");
        writer.println("</div>");
    }
    
    private List<String> randomiseAnswers(Question question) {
        List<String> answers = question.getWrongAnswers();
        answers.add(question.getCorrectAnswer());
        Collections.shuffle(answers);
        return answers;
    }
}
