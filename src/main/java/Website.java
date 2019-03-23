import java.io.IOException;
import java.time.LocalTime;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import questions.Question;
import questions.QuestionGenerator;
import web.IndexPage;
import web.QuestionPage;
import web.ResultPage;

public class Website extends HttpServlet {

    private final QuestionGenerator questionGen = new QuestionGenerator();
    private final int maxQuestions = 20;
    private int questionsAnswered = 0;
    private Question question = questionGen.generate();
    private int score = 0;
    private LocalTime startTime = LocalTime.now();
    private LocalTime endTime = LocalTime.now();
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws IOException {
        endTime = LocalTime.now();
        
        String purpose = req.getParameter("purpose");
        if (purpose == null) {
            new IndexPage().writeTo(resp);
        } else if (purpose.equals("main")) {
            play(resp);
        } else if (purpose.equals("question")) {
            questionsAnswered++;
            calculateScore(req);

            if (questionsAnswered < maxQuestions)
                play(resp);
            else
                new ResultPage().writeTo(resp, score);
        } else {
            questionsAnswered = 0;
            score = 0;
            new IndexPage().writeTo(resp);
        }
        startTime = LocalTime.now();
    }
    
    private void calculateScore(HttpServletRequest req) {
        String optionA = req.getParameter("optA");
        String optionB = req.getParameter("optB");
        String optionC = req.getParameter("optC");
        String optionD = req.getParameter("optD");
        
        String choice =
            (optionA != null) ? optionA :
                (optionB != null) ? optionB :
                    (optionC != null) ? optionC : optionD;
        
        if (question.checkAnswer(choice))
            score += question.calculatePoint(difference(startTime, endTime));
    }
    
    private int difference(LocalTime startTime, LocalTime endTime) {
        int diff = 0;
        int secondsInMinute = 60;
        int secondsInHour = 3600;
        
        diff += endTime.getSecond() - startTime.getSecond();
        diff += (endTime.getMinute() - startTime.getMinute()) * secondsInMinute;
        diff += (endTime.getHour() - startTime.getHour()) * secondsInHour;
        
        return diff;
    
    }
    
    private void play(HttpServletResponse resp) throws IOException {
        question = questionGen.generate();
        new QuestionPage().writeTo(resp, question);
    }
}
