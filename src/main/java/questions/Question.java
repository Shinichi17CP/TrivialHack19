package questions;

import java.util.List;

public class Question {
    
    private String question;
    private String correctAnswer;
    private List<String> falseOptions;
    private final int fullMark = 20;
    private final int reactionTime = 5;
    
    public Question(String question, String correctAnswer,
        List<String> falseOptions) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.falseOptions = falseOptions;
    }
    
    public String getQuestion() {
        return question;
    }
    
    public String getCorrectAnswer() {
        return correctAnswer;
    }
    
    public List<String> getWrongAnswers() {
        return falseOptions;
    }
    
    public boolean checkAnswer(String choice) {
        return choice.equals(correctAnswer);
    }
    
    public int calculatePoint(int timeTaken) {
        int mark = fullMark - (timeTaken - reactionTime);
        if (mark <= 0) return 0;
        return mark;
    }
}
