package questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class QuestionGenerator {
    
    private final QuestionsAndAnswers database = new QuestionsAndAnswers();
    private final int numberOfSponsors = 17;
    private Sponsor[] sponsors = Sponsor.values();
    private Map<Sponsor, List<Integer>> usedQuestions = new HashMap();
    
    public Question generate() {
        Sponsor sponsorCategory;
        int questionIndex;
        List<String> questionsTable;
        
        do {
            int sponsorIndex = new Random().nextInt(numberOfSponsors - 1);
            sponsorCategory = sponsors[sponsorIndex];
            
            questionsTable = database.getQuestions(sponsorCategory);
            questionIndex = new Random().nextInt(questionsTable.size() - 1);
            
        } while (usedQuestions.getOrDefault(sponsorCategory, new ArrayList<>())
            .contains(questionIndex));
        
        if (usedQuestions.containsKey(sponsorCategory)) {
            usedQuestions.get(sponsorCategory).add(questionIndex);
        } else {
            List<Integer> sponsorQuestions = new ArrayList<>();
            sponsorQuestions.add(questionIndex);
            usedQuestions.put(sponsorCategory, sponsorQuestions);
        }
        
        String question = questionsTable.get(questionIndex);
        List<String> answers = database.getAnswers(sponsorCategory, questionIndex);
        List<String> wrongOptions = answers.subList(1, answers.size());
        return new Question(question, answers.get(0), wrongOptions);
    }
}
