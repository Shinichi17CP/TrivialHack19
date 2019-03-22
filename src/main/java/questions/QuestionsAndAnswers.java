package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class QuestionsAndAnswers {
    
    public List<String> getQuestions(Sponsor sponsorCategory) {
        switch (sponsorCategory) {
            case CISCO: return ciscoQuestions;
            case NEXTJUMP: return nextjumpQuestions;
            case VISA: return visaQuestions;
            case ATLASCITY: return atlasQuestions;
            case SCHLUMBERGER: return schlumbergerQuestions;
            case THOUGHTMACHINE: return thoughtQuestions;
            case AMEX: return amexQuestions;
            case GRESEARCH: return gresearchQuestions;
            case FUNDAPPS: return fundappsQuestions;
            case BLACKROCK: return blackrockQuestions;
            case IMPROBABLE: return improbableQuestions;
            case NETCRAFT: return netcraftQuestions;
            case PALANTIR: return palantirQuestions;
            case TWOSIGMA: return twosigmaQuestions;
            case QUANTERIUM: return quanteriumQuestions;
            case AIMBRAIN: return aimbrainQuestions;
            default: return polyaiQuestions;
        }
    }
    
    public List<String> getAnswers(Sponsor sponsorCategory, int questionIndex) {
        switch (sponsorCategory) {
            case CISCO: return ciscoAnswers.get(questionIndex);
            case NEXTJUMP: return nextjumpAnswers.get(questionIndex);
            case VISA: return visaAnswers.get(questionIndex);
            case ATLASCITY: return atlasAnswers.get(questionIndex);
            case SCHLUMBERGER: return schlumbergerAnswers.get(questionIndex);
            case THOUGHTMACHINE: return thoughtAnswers.get(questionIndex);
            case AMEX: return amexAnswers.get(questionIndex);
            case GRESEARCH: return gresearchAnswers.get(questionIndex);
            case FUNDAPPS: return fundappsAnswers.get(questionIndex);
            case BLACKROCK: return blackrockAnswers.get(questionIndex);
            case IMPROBABLE: return improbableAnswers.get(questionIndex);
            case NETCRAFT: return netcraftAnswers.get(questionIndex);
            case PALANTIR: return palantirAnswers.get(questionIndex);
            case TWOSIGMA: return twosigmaAnswers.get(questionIndex);
            case QUANTERIUM: return quanteriumAnswers.get(questionIndex);
            case AIMBRAIN: return aimbrainAnswers.get(questionIndex);
            default: return polyaiAnswers.get(questionIndex);
        }
    }
    
    // CISCO
    
    List<String> ciscoQuestions = new ArrayList<>(Arrays.asList(
            "What city was CISCO named after?",
            "What was the main motivator to create CISCO?",
            "When was CISCO founded?"));
    
    List<List<String>> ciscoAnswers = new ArrayList<>(Arrays.asList(
        new ArrayList<>(Arrays.asList("San Fransisco", "Cincinnati",
            "Sacramento", "Chicago")),
        new ArrayList<>(Arrays.asList("The husband and wife wanted to email each other",
            "No one else was creating routers at the time",
            "They had nothing better to do with their lives",
            "The son and father wanted to communicate with each other")),
        new ArrayList<>(Arrays.asList("December 1984", "April "
            + "1985", "September 1969", "January 1975"))));
    
    // NEXTJUMP
    
    List<String> nextjumpQuestions = new ArrayList<>(Arrays.asList(
        "When was NextJump founded?",
        "Who was the founder of NextJump?",
        "What is NextJump's universal formula in how company cultures "
            + "should be built?"));
    
    List<List<String>> nextjumpAnswers = new ArrayList<>(Arrays.asList(
        new ArrayList<>(Arrays.asList("1994", "1995", "2001", "2006")),
        new ArrayList<>(Arrays.asList("Charlie Kim", "Leonard "
            + "Bosack", "John Smith", "Henry Wells")),
        new ArrayList<>(Arrays.asList("Better Me + Better You = Better Us",
            "Better I + Better U = Better Us",
            "Better Me + Better You = Better We",
            "Better I + Better U = Better We"))));
    
    // VISA
    
    List<String> visaQuestions = new ArrayList<>(Arrays.asList("When it was first used, what did VISA stand for?",
        "When was VISA founded?",
        "On the back of a VISA card, what bird is on the holographic "
            + "sticker?"));
    
    List<List<String>> visaAnswers = new ArrayList<>(Arrays.asList(
        new ArrayList<>(Arrays.asList("nothing",
        "VISA International Service Association",
        "Very Interesting Savings Account",
        "VISA International Service Account")),
        new ArrayList<>(Arrays.asList("1958", "1962", "1949", "1972")),
        new ArrayList<>(Arrays.asList("Dove", "Pigeon", "Swallow",
            "Crane"))));
    
    // ATLAS CITY
    
    List<String> atlasQuestions = new ArrayList<>(Arrays.asList("What does DLT stand for?",
        "What does Atlas City mainly do?",
        "Where is Atlas City Based?"));
    
    List<List<String>> atlasAnswers = new ArrayList<>(Arrays.asList(
        new ArrayList<>(Arrays.asList("Distributed Ledger Technology",
        "Distributed Lending Technology",
        "Developed Ledger Technology",
        "Distributing Ledger Technology")),
        new ArrayList<>(Arrays.asList("Applying distributed ledger "
            + "technologies across all industries",
            "blockchain stuff", "manages financial assets",
            "runs a successful Ecommerce business on a platform")),
        new ArrayList<>(Arrays.asList("Paddington, London", "Picadilly, London",
            "Shoreditch, London", "Brighton"))));
    
    // SCHLUMBERGER
    
    List<String> schlumbergerQuestions = new ArrayList<>(Arrays.asList("When was Schlumberger founded?",
        "Where are the headquarters of Schlumberger?",
        "What is Schlumberger known for?"));
    
    List<List<String>> schlumbergerAnswers = new ArrayList<>(Arrays.asList(
        new ArrayList<>(Arrays.asList("1926", "1962", "1935", "1975")),
        new ArrayList<>(Arrays.asList("Houston, Texas", "Hoxton, London",
            "Chicago, Illinois", "Philadelphia, Pennsylvania")),
        new ArrayList<>(Arrays.asList("Oilfield services", "Blockchain",
            "Cybersecurity", "Asset management"))));
    
    // THOUGHT MACHINE
    
    List<String> thoughtQuestions = new ArrayList<>(Arrays.asList("What is Thought Machine's complete " +
            "retail banking platform called?",
        "What is Thought Machine's mission?",
        "Two of the most important aspects of the database are:"));
    
    List<List<String>> thoughtAnswers = new ArrayList<>(Arrays.asList(
        new ArrayList<>(Arrays.asList("Vault", "ThinkBank", "Safe", "Crypt")),
        new ArrayList<>(Arrays.asList("Building the new foundations for banking",
            "Make more money than the banks they work with",
            "Build the best sandcastle in the galaxy",
            "Building the new foundations for AI")),
        new ArrayList<>(Arrays.asList("Transactions ledger and the (smart) contracts ledger",
            "Transactions ledger and security ledger",
            "Speed ledger and the (smart) contracts ledger",
            "Redundancy ledger and the (smart) contracts ledger"))));
    
    // G-RESEARCH
    
    List<String> gresearchQuestions = new ArrayList<>(Arrays.asList("What is G Research known for?",
        "What is G Research's motto?",
        "Where is G Research based?"));
    
    List<List<String>> gresearchAnswers = new ArrayList<>(Arrays.asList(
        new ArrayList<>(Arrays.asList("Quantitative Research and Technology",
        "Quantitative Research", "Technology", "Banking")),
        new ArrayList<>(Arrays.asList("Create today. Predict tomorrow.",
            "I'm lovin' it",
            "Imagine today. Create tomorrow.",
            "Predict today. Prosper tomorrow.")),
        new ArrayList<>(Arrays.asList("London", "Brighton", "NYC", "Los "
            + "Angeles"))));
    
    // FUNDAPPS
    
    List<String> fundappsQuestions = new ArrayList<>(Arrays.asList("When was FundApps founded?",
        "Who founded FundApps?",
        "What is FundApps?"));
    
    List<List<String>> fundappsAnswers = new ArrayList<>(Arrays.asList(new ArrayList<>
        (Arrays.asList("2010", "2012", "2013", "2008")),
        new ArrayList<>(Arrays.asList("Andrew Patrick White and James Crowley",
            "Andrew Patrick White and James Crawley",
            "Andrew Patrick Wilshire and James Crowley",
            "Andrew Patrick Wilshire and James Crawley")),
        new ArrayList<>
            (Arrays.asList("A risk management service that oversees and responds " +
                "to regulatory change in the fund industry.",
            "A leading quantitative research and technology company.",
            "A design and development firm that creates immersive " +
                "digital marketing and technology solutions.",
            "Revolutionises Financial Services by providing frictionless " +
                "and streamlined access to the Digital Assets market."))));
    
    // AMERICAN EXPRESS
    
    List<String> amexQuestions = new ArrayList<>(Arrays.asList("What animal was on American Express's original logo?",
        "All American Express cards start with what number?",
        "What is the colour of the exclusive American Express card?"));
    
    List<List<String>> amexAnswers = new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays
        .asList("Watchdog", "Dove", "Lion", "Eagle")),
        new ArrayList<>(Arrays.asList("3", "5", "4", "7")),
        new ArrayList<>(Arrays.asList("Black", "Gold", "Platinum", "Red"))));
    
    // BLACKROCK
    
    List<String> blackrockQuestions  = new ArrayList<>(Arrays.asList("What was BlackRock originally called?",
        "As of July 2018, how many shares of JP Morgan does BlackRock own?",
        "When was BlackRock founded?"));
    
    List<List<String>> blackrockAnswers = new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList("Blackstone Financial Management",
        "It was always called BlackRock",
        "RockBlack",
        "BlackRock Financial Management")),
        new ArrayList<>(Arrays.asList
        (" 228.1 million", "100,000", "501.8 million", "none")),
        new ArrayList<>(Arrays.asList("1988", "1998", "1976", "1965"))));
    
    // IMPROBABLE
    
    List<String> improbableQuestions = new ArrayList<>(Arrays.asList("What do Improbable call the seismic shift in human experience?",
        "When was Improbable founded?",
        "How many founders does Improbable have?"));
    
    List<List<String>> improbableAnswers = new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList("Multiversal Self", "Universal Self",
        "Multiversal shift", "Universal shift")),
        new ArrayList<>(Arrays.asList("2012", "2010", "2014", "2008")),
        new ArrayList<>(Arrays.asList("3", "1", "2", "4"))));
    
    // QUANTERIUM TECH
    
    List<String> quanteriumQuestions = new ArrayList<>(Arrays.asList("When was Quanterium Tech founded?",
        "What is Quanterium Tech's vision?",
        "Where is Quanterium Tech based?"));
    
    List<List<String>> quanteriumAnswers = new ArrayList<>(Arrays.asList(
        new ArrayList<>(Arrays.asList("2018", "2017", "2016", "2015")),
        new ArrayList<>(Arrays.asList("Boosting blockchain technology adoption by providing " +
                "institutional clients easy access to the digital assets market",
            "Revolutionise Financial Services by providing frictionless" +
                "and streamlined access to the Digital Assets market.",
            "Apply distributed ledger technologies across all industries",
            "To build the new foundations for banking")),
        new ArrayList<>(Arrays.asList("London", "San Fransisco",
            "Bristol", "Sydney"))));
    
    // NETCRAFT
    
    List<String> netcraftQuestions = new ArrayList<>(Arrays.asList("Where is Netcraft's HQ?",
        "When was Netcraft founded?",
        "As of January 2019, how many unique phishing have " +
            "been detected and blocked by Netcraft systems?"));
    
    List<List<String>> netcraftAnswers = new ArrayList<>(Arrays.asList(new ArrayList<>
        (Arrays.asList("Bath", "London", "Bristol", "Leeds")),
        new ArrayList<>(Arrays.asList("1987", "1978", "2004", "2010")),
        new ArrayList<>(Arrays.asList("Over 56 million", "Over 90 million",
            "Over 124 million", "Over 283 million"))));
    
    // PALANTIR
    
    List<String> palantirQuestions = new ArrayList<>(Arrays.asList("A palantir is a:",
        "When was Palantir founded?",
        "Where is the Palantir Headquarters?"));
    
    List<List<String>> palantirAnswers = new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList("a seeing stone that lets you see " +
            "what's happening in lands far off",
        "a meteorite", "a crystal tiara",
        "a mirror that lets you see what's " +
            "happening in lands far off")),
        new ArrayList<>(Arrays.asList("2004", "2005", "2010", "1999")),
        new ArrayList<>(Arrays.asList("Palo Alto, California", "LA, California",
            "Houston, Texas", "San Fransisco, California"))));
    
    
    // AIMBRAIN
    
    List<String> aimbrainQuestions = new ArrayList<>(Arrays.asList("What kind of platform is AimBrain?",
        "When was AimBrain founded?",
        "Who are the founders of AimBrain?"));
    
    List<List<String>> aimbrainAnswers = new ArrayList<>(Arrays.asList(new ArrayList<>(
        Arrays.asList("Biometric Identity as-a-Service",
        "Infrastructure as-a-Service",
        "Software as-a-Service",
        "IT as-a-Service")),
        new ArrayList<>(Arrays.asList("2014", "2016",
        "2018", "2012")),
        new ArrayList<>(Arrays.asList("Alesis Novik and "
                + "Andrius Sutas",
            "Alexis Novak and Andreas Sutas",
            "Alesis Novak and Andrius Sutas",
            "Alesis Novik and Andreas Sutas"))));
    
    // POLYAI
    
    List<String> polyaiQuestions = new ArrayList<>(Arrays.asList("How many founders does Poly AI have?",
        "When was Poly AI founded?",
        "What kind of platform does Poly AI develop?"));
    
    List<List<String>> polyaiAnswers = new ArrayList<>(Arrays.asList(new ArrayList<>
            (Arrays.asList("3", "1", "2", "5")),
        new ArrayList<>(Arrays.asList("2017", "2018", "2015", "2016")),
        new ArrayList<>(Arrays.asList("Conversational AI", "Self aware AI",
            "Financial Markets AI", "Lipton AI"))));
    
    // Special thanks to Sam from Oxford for Lipton AI lol
    
    // TWO SIGMA
    
    List<String> twosigmaQuestions = new ArrayList<>(Arrays.asList("When was Two Sigma founded?",
        "What type of industry is Two Sigma in?",
        "Why was the name Two Sigma chosen for the firm?"));
    
    List<List<String>> twosigmaAnswers = new ArrayList<>(Arrays.asList(new ArrayList<>
        (Arrays.asList("2001", "2003", "2010", "2008")),
        new ArrayList<>(Arrays.asList("Investment Management", "Blockchain",
            "Education", "Corporate Management")),
        new ArrayList<>(Arrays
            .asList("To reflect the duality of the word sigma",
            "To represent the SD multiplied by 2",
            "The founder's favourite music duo is called Sigma",
            "The founder is a huge fan of Sigma Megaman X2"))));
}
