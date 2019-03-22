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
        resp.getWriter().println("<h1><input type=\"hidden\" name=\"purpose\" "
            + "value=\"question\">" + question.getQuestion() + "</h1>");
    }
    
    // Writes four buttons presenting possible answers to the question
    private void writeChoices(HttpServletResponse resp, Question question)
        throws IOException {
        String buttonStyle = " style=\"background-color:#EF0754; " +
            "font-size: 15pt; height: 80px; width: 300px; margin-top: 5%; " +
            "color: white; border-radius: 20px;\"";
        List<String> randomAnswers = randomiseAnswers(question);
        PrintWriter writer = resp.getWriter();
    
        writer.println("<form>");
        writer.println("<h2><center>" +
            "<input type=\"button\" name=\"optA\" value=\"" +
            randomAnswers.get(0) + buttonStyle + ">" +
            "<input type=\"button\" name=\"optB\" value=\"" +
            randomAnswers.get(1) + buttonStyle + ">" +
            "</center></h2>");
        writer.println("<h2><center>" +
            "<input type=\"button\" name=\"optC\" value=\"" +
            randomAnswers.get(2) + buttonStyle + ">" +
            "<input type=\"button\" name=\"optD\" value=\"" +
            randomAnswers.get(3) + buttonStyle + ">" +
            "</center></h2>");
       writer.println("</form>");
        
       
    }
    
    private List<String> randomiseAnswers(Question question) {
        List<String> answers = question.getWrongAnswers();
        answers.add(question.getCorrectAnswer());
        Collections.shuffle(answers);
        return answers;
    }
}
