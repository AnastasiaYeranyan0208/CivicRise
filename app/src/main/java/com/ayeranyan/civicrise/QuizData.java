package com.ayeranyan.civicrise;

import java.util.ArrayList;
import java.util.List;

public class QuizData {

    public static List<Question> getQuiz(String category, int quizIndex) {
        List<Question> questions = new ArrayList<>();

        if (category.equals("media") && quizIndex == 0) {

            questions.add(new Question("Which of the following is a common characteristic of fake news articles?",
                    "Well-researched facts", "Sensational headlines", "Balanced viewpoints", "Credible sources", 1));

            questions.add(new Question("What term describes the deliberate spreading of false information to deceive people?",
                    "Misinformation", "Disinformation", "Malinformation", "Propaganda", 1));

            questions.add(new Question("Which strategy is effective in identifying fake news?",
                    "Trusting news shared by friends", "Checking the publication date", "Evaluating the credibility of the source", "Relying on social media popularity", 2));

            questions.add(new Question("What role do “bots” play in the spread of fake news?",
                    "They fact-check information", "They automatically share and amplify false stories", "They create original news content", "They block fake news websites", 1));

            questions.add(new Question("Which of the following is a consequence of widespread fake news?",
                    "Increased public trust in media", "Enhanced critical thinking skills", "Erosion of democracy", "Strengthened community ties", 2));

            questions.add(new Question("What is “confirmation bias” in the context of fake news?",
                    "Seeking information that challenges one’s beliefs", "Ignoring all news sources", "Favoring information that confirms existing beliefs", "Sharing news without reading it", 2));

            questions.add(new Question("Which platform has been identified as a significant spreader of fake news?",
                    "Traditional newspapers", "Social media networks", "Academic journals", "Government websites", 1));

            questions.add(new Question("What is the “illusory truth effect”?",
                    "Believing information is true after repeated exposure", "Disbelieving information from unfamiliar sources", "The tendency to remember false information", "The ability to distinguish truth from lies", 0));

            questions.add(new Question("Which organization is known for fact-checking and debunking fake news?",
                    "The Onion", "PolitiFact", "WikiLeaks", "Reddit", 1));

            questions.add(new Question("Which type of headlines are often used in fake news to grab attention?",
                    "Neutral headlines", "Clickbait headlines", "Scientific titles", "Formal headlines", 1));

            questions.add(new Question("What is a deepfake?",
                    "A verified source", "A fake video or audio created using AI", "A news summary", "A legitimate documentary", 1));

            questions.add(new Question("What is the best personal defense against fake news?",
                    "Sharing everything you read", "Trusting all viral posts", "Using critical thinking and verification", "Following influencers", 2));

            questions.add(new Question("Which age group is most likely to share fake news?",
                    "Teens", "Young adults", "Older adults", "Children", 2));

            questions.add(new Question("Why do fake news articles often go viral?",
                    "They contain official data", "They entertain people", "They appeal to emotions and bias", "They are published in journals", 2));
        }

        if (category.equals("media") && quizIndex == 1) {
            questions.add(new Question("Which is a classic propaganda technique used to sway public opinion?",
                    "Peer-reviewed evidence", "Bandwagon appeal", "Balanced reporting", "Neutral tone", 1));

            questions.add(new Question("What does the 'glittering generalities' technique rely on?",
                    "Scientific facts", "Vague, emotionally appealing phrases", "Negative campaigning", "Logical fallacies", 1));

            questions.add(new Question("What is the purpose of name-calling in propaganda?",
                    "To praise opponents", "To promote cooperation", "To attack an opponent personally", "To present statistics", 2));

            questions.add(new Question("Which propaganda technique uses celebrities or trusted figures to influence public opinion?",
                    "Transfer", "Testimonial", "Plain folks", "Repetition", 1));

            questions.add(new Question("What is the ‘plain folks’ technique?",
                    "Using expert opinions", "Appealing to the average person", "Using complicated language", "Targeting elites", 1));

            questions.add(new Question("What does the 'transfer' technique do?",
                    "Shifts emotional appeal from one symbol to another", "Transfers money", "Presents arguments", "Distracts from facts", 0));

            questions.add(new Question("What is the risk of the repetition technique in media?",
                    "It reinforces false information", "It helps recall facts", "It promotes diversity", "It improves logic", 0));

            questions.add(new Question("Which of these best defines 'card stacking'?",
                    "Using one-sided evidence to support a claim", "Shuffling papers", "Randomized arguments", "Neutral journalism", 0));

            questions.add(new Question("In propaganda, what does 'fear appeal' rely on?",
                    "Joy", "Scientific support", "Creating anxiety or panic", "Hopeful messages", 2));

            questions.add(new Question("Which is an example of bandwagon technique?",
                    "Everyone is doing it!", "Statistical analysis", "Opposing views", "Academic reference", 0));

            questions.add(new Question("What is the main goal of propaganda?",
                    "To objectively educate", "To manipulate public attitudes", "To entertain", "To summarize reports", 1));

            questions.add(new Question("Which is NOT a propaganda technique?",
                    "Testimonials", "Balanced coverage", "Glittering generalities", "Card stacking", 1));

            questions.add(new Question("What does propaganda usually avoid?",
                    "Simplicity", "Statistics", "Multiple viewpoints", "Emotional appeal", 2));

            questions.add(new Question("How can you resist propaganda?",
                    "Avoid reading news", "Use critical thinking and verify sources", "Only trust social media", "Follow trends", 1));

            questions.add(new Question("Which phrase signals propaganda?",
                    "Study shows", "Join the winning side!", "Peer-reviewed", "Contradictory evidence", 1));
        }
        if (category.equals("media") && quizIndex == 2) {
            questions.add(new Question("What is media bias?",
                    "A fair reporting technique", "A personal opinion", "A slant in news presentation favoring one side", "An error in grammar", 2));

            questions.add(new Question("Which headline signals media bias?",
                    "Local team wins championship", "Corrupt politician ruins country", "New tax bill passed", "Mayor attends meeting", 1));

            questions.add(new Question("Which of the following is an example of omission bias?",
                    "Including too many quotes", "Leaving out key facts", "Repeating statistics", "Using footnotes", 1));

            questions.add(new Question("How can visual bias appear in news?",
                    "Using neutral charts", "Unflattering images", "Academic diagrams", "Maps", 1));

            questions.add(new Question("What is labeling bias?",
                    "Using neutral words", "Assigning loaded labels to people/groups", "Citing sources", "Avoiding adjectives", 1));

            questions.add(new Question("What is one method to detect media bias?",
                    "Reading only headlines", "Comparing multiple sources", "Avoiding news", "Trusting clickbait", 1));

            questions.add(new Question("Which phrase may indicate spin bias?",
                    "He said", "Officials stated", "Shocking new report!", "According to data", 2));

            questions.add(new Question("Why is it important to recognize media bias?",
                    "To argue more", "To be manipulated better", "To make informed decisions", "To avoid news", 2));

            questions.add(new Question("What is one impact of biased media on society?",
                    "More unity", "Improved education", "Polarization and misinformation", "Higher literacy", 2));

            questions.add(new Question("What is bias by placement?",
                    "Page layout technique", "Positioning stories to highlight or downplay", "Creating visual ads", "Fact-checking tool", 1));

            questions.add(new Question("What is a red flag for biased news?",
                    "Neutral tone", "Fact-checking", "Anonymous sources and loaded language", "Long article", 2));

            questions.add(new Question("How can confirmation bias affect media interpretation?",
                    "It helps understand others", "It prevents bias", "It causes one to favor news that matches beliefs", "It enhances logic", 2));

            questions.add(new Question("What is cherry-picking in media?",
                    "Harvesting news", "Selecting only data supporting one side", "Choosing sweet stories", "Analyzing trends", 1));

            questions.add(new Question("What is clickbait?",
                    "A reliable fact", "A well-researched article", "Sensational headline to attract clicks", "Neutral explanation", 2));

            questions.add(new Question("What should responsible media consumers do?",
                    "Share before reading", "Verify and analyze sources", "Ignore opposing views", "Only use one platform", 1));
        }
        if (category.equals("rights") && quizIndex == 0) {
            questions.add(new Question("Which movement aimed to end racial segregation in the U.S. during the 1960s?",
                    "Women's Suffrage", "Civil Rights Movement", "Labor Movement", "Environmental Movement", 1));

            questions.add(new Question("What was the primary goal of the Suffragette Movement?",
                    "Abolition of slavery", "Women's right to vote", "Labor reform", "Religious freedom", 1));

            questions.add(new Question("Which event triggered the Arab Spring?",
                    "Fall of the Berlin Wall", "Self-immolation of Mohamed Bouazizi", "U.S. Election", "Paris Climate Accord", 1));

            questions.add(new Question("What tactic is commonly used in non-violent protests?",
                    "Cyber-attacks", "Sit-ins", "Vandalism", "Riots", 1));

            questions.add(new Question("What is the goal of the Black Lives Matter movement?",
                    "Promote environmental laws", "Support government censorship", "Address systemic racism and police violence", "Expand tax policy", 2));

            questions.add(new Question("What sparked the Occupy Wall Street movement?",
                    "War protests", "Bank bailouts and income inequality", "Housing prices", "Climate change", 1));

            questions.add(new Question("Which movement focused on colonial independence in India?",
                    "Green Revolution", "Indian Independence Movement", "French Resistance", "Cuban Revolution", 1));

            questions.add(new Question("What was the main method of Gandhi's protest?",
                    "Violence", "Passive resistance and non-violence", "Armed revolt", "Economic boycott only", 1));

            questions.add(new Question("Which movement advocated LGBTQ+ rights after 1969?",
                    "Peace Now", "Green Party", "Stonewall Riots", "Silent Majority", 2));

            questions.add(new Question("What was the purpose of the #MeToo movement?",
                    "Reduce taxes", "Promote fashion", "Raise awareness of sexual harassment and abuse", "Change school systems", 2));

            questions.add(new Question("What is a common feature of modern protests?",
                    "Use of social media", "Only street marches", "Government sponsorship", "Military training", 0));

            questions.add(new Question("What is a grassroots movement?",
                    "Organized by corporations", "Started by political parties", "Community-driven activism", "Run by banks", 2));

            questions.add(new Question("Which protest used the slogan 'We are the 99%'?",
                    "Tea Party", "Extinction Rebellion", "Occupy Wall Street", "Brexit", 2));

            questions.add(new Question("What tactic did Civil Rights activists use in buses?",
                    "Voting", "Boycotting", "Sit-ins", "Bus burning", 1));

            questions.add(new Question("Why are peaceful protests often more effective long-term?",
                    "They escalate faster", "They gain public sympathy and media support", "They avoid legal process", "They ignore negotiation", 1));
        }
        if (category.equals("rights") && quizIndex == 1) {
            questions.add(new Question("What historic event in 1969 sparked the LGBTQ+ rights movement?",
                    "UN Convention", "Stonewall Riots", "Woodstock Festival", "Equal Pay Act", 1));

            questions.add(new Question("What does LGBTQ+ stand for?",
                    "Loyal, Grateful, Balanced, Qualified", "Lesbian, Gay, Bisexual, Transgender, Queer/Questioning", "Legal Gender Binary Questions", "Language of Gender and Belief", 1));

            questions.add(new Question("What is the purpose of pride parades?",
                    "Sell merchandise", "Celebrate LGBTQ+ identity and advocate for rights", "Ban books", "Elect officials", 1));

            questions.add(new Question("Which country was the first to legalize same-sex marriage?",
                    "Canada", "Netherlands", "Spain", "USA", 1));

            questions.add(new Question("What is gender equality?",
                    "Equal number of men and women", "Everyone dresses the same", "Equal rights and opportunities regardless of gender", "Same hairstyles", 2));

            questions.add(new Question("What does 'gender identity' refer to?",
                    "Assigned sex at birth", "Clothing choices", "Internal sense of being male, female, both, or neither", "Political party", 2));

            questions.add(new Question("Which movement focused on workplace equality for women?",
                    "Equal Pay Act", "Labor Union", "Environmental Law", "Home Act", 0));

            questions.add(new Question("Which global day raises awareness about gender-based violence?",
                    "April Fool's", "International Women's Day", "World Health Day", "Tech Day", 1));

            questions.add(new Question("What is the goal of Title IX in the U.S.?",
                    "Ban LGBTQ+ rights", "Ensure gender equality in education", "Support only boys' sports", "Cut school funding", 1));

            questions.add(new Question("What term refers to harmful stereotypes about women?",
                    "Gender justice", "Patriarchy", "Sexism", "Ecofeminism", 2));

            questions.add(new Question("What is intersectionality?",
                    "Conflict between genders", "The overlapping of multiple social identities", "Science of roads", "Economic policy", 1));

            questions.add(new Question("Why is inclusive language important?",
                    "It is easier to read", "It avoids offending others and respects identity", "It costs less", "It’s trendy", 1));

            questions.add(new Question("What does the rainbow flag represent?",
                    "Tourism", "LGBTQ+ pride and diversity", "Rain", "Peace treaties", 1));

            questions.add(new Question("What is a non-binary identity?",
                    "Not human", "Someone who rejects all identities", "Not exclusively male or female", "A robot", 2));

            questions.add(new Question("Why are gender-neutral bathrooms advocated for?",
                    "To confuse people", "To reduce costs", "To provide safe access for everyone", "To track users", 2));
        }
        if (category.equals("rights") && quizIndex == 2) {
            questions.add(new Question("What document is the foundation of international human rights law?",
                    "U.S. Constitution", "Magna Carta", "Universal Declaration of Human Rights", "Rome Statute", 2));

            questions.add(new Question("What do the Geneva Conventions focus on?",
                    "Trade laws", "War rules and civilian protection", "Banking codes", "Climate agreements", 1));

            questions.add(new Question("Which right is under Article 19 of the UDHR?",
                    "Right to education", "Right to property", "Right to free speech", "Right to bear arms", 2));

            questions.add(new Question("What does modern slavery include?",
                    "Paid internships", "Debt bondage and trafficking", "Luxury work", "Freedom of choice", 1));

            questions.add(new Question("What is the purpose of Amnesty International?",
                    "Control the web", "Help refugees", "Monitor human rights abuses", "Regulate elections", 2));

            questions.add(new Question("What are SDGs?",
                    "Science Data Goals", "Smart Digital Guidelines", "Sustainable Development Goals", "Security Defense Groups", 2));

            questions.add(new Question("What are 'climate refugees'?",
                    "Tourists", "People forced to move due to environmental changes", "Politicians", "Data analysts", 1));

            questions.add(new Question("Which country has the highest number of displaced persons (as of recent years)?",
                    "Sweden", "USA", "Syria", "Brazil", 2));

            questions.add(new Question("What does the ICC do?",
                    "Manages food", "Prosecutes war crimes and genocide", "Creates media", "Censors protests", 1));

            questions.add(new Question("What is food insecurity?",
                    "Government policy", "Lack of access to nutritious food", "Healthy lifestyle", "Marketing trend", 1));

            questions.add(new Question("What contributes most to gender inequality?",
                    "Excessive media", "Lack of education and opportunity", "Equal pay", "Too many schools", 1));

            questions.add(new Question("What causes global water scarcity?",
                    "Better farming", "Climate change and poor management", "Overconsumption of soda", "Too much rain", 1));

            questions.add(new Question("What is the role of the UNHCR?",
                    "Tax inspection", "Refugee aid and protection", "Internet security", "Political reform", 1));

            questions.add(new Question("Which region faces a major hunger crisis?",
                    "South America", "Australia", "Sub-Saharan Africa", "Iceland", 2));

            questions.add(new Question("What does 'digital divide' refer to?",
                    "Keyboard shortcuts", "Difference in tech access", "Printer gaps", "Software patches", 1));
        }
        if (category.equals("politics") && quizIndex == 0) {
            questions.add(new Question("What is the core belief of socialism?",
                    "Private ownership", "State control of key industries and social equality", "Religious governance", "Complete free markets", 1));

            questions.add(new Question("What does liberalism promote?",
                    "Authoritarianism", "Individual rights and freedoms", "Absolute monarchy", "Feudalism", 1));

            questions.add(new Question("Which system supports free markets and private property?",
                    "Communism", "Capitalism", "Socialism", "Theocracy", 1));

            questions.add(new Question("What is a key idea in communism?",
                    "Abolition of class system", "Total military rule", "Religious dominance", "Absolute monarchy", 0));

            questions.add(new Question("Which political ideology emphasizes tradition and national sovereignty?",
                    "Progressivism", "Conservatism", "Anarchism", "Technocracy", 1));

            questions.add(new Question("What form of government does theocracy refer to?",
                    "Military rule", "Rule by religious leaders", "Corporate governance", "Direct democracy", 1));

            questions.add(new Question("Which ideology rejects government authority entirely?",
                    "Communism", "Anarchism", "Fascism", "Liberalism", 1));

            questions.add(new Question("What characterizes a fascist regime?",
                    "Decentralized power", "Extreme nationalism and authoritarianism", "Free press", "Balanced government", 1));

            questions.add(new Question("Which ideology supports equal wealth distribution?",
                    "Capitalism", "Authoritarianism", "Socialism", "Totalitarianism", 2));

            questions.add(new Question("Which country follows a constitutional monarchy?",
                    "USA", "France", "UK", "Russia", 2));

            questions.add(new Question("Which ideology values environmental sustainability in politics?",
                    "Fascism", "Green politics", "Technocracy", "Imperialism", 1));

            questions.add(new Question("What is neoliberalism known for promoting?",
                    "State ownership", "Market deregulation and free trade", "Religious law", "Military rule", 1));

            questions.add(new Question("Which ideology influenced Karl Marx?",
                    "Social Darwinism", "Romanticism", "German philosophy and socialism", "Liberal capitalism", 2));

            questions.add(new Question("Which ideology dominated Nazi Germany?",
                    "Socialism", "Fascism", "Democracy", "Communism", 1));

            questions.add(new Question("Which ideology is the foundation of U.S. democracy?",
                    "Authoritarianism", "Monarchy", "Liberalism", "Anarchism", 2));
        }
        if (category.equals("politics") && quizIndex == 1) {
            questions.add(new Question("What is political corruption?",
                    "Efficient governance", "Using power for personal gain", "Democratic debate", "Public service", 1));

            questions.add(new Question("Which of the following is a form of corruption?",
                    "Transparent budgeting", "Bribery", "Public voting", "Open hearings", 1));

            questions.add(new Question("What is nepotism?",
                    "Hiring based on merit", "Favoring family or friends", "Public service", "Media bias", 1));

            questions.add(new Question("How does corruption affect public trust?",
                    "Improves it", "Destroys it", "Strengthens institutions", "Does not impact", 1));

            questions.add(new Question("Which organization monitors global corruption?",
                    "World Bank", "Transparency International", "IMF", "Red Cross", 1));

            questions.add(new Question("What is a common anti-corruption measure?",
                    "Secret deals", "Whistleblower protection", "Media censorship", "Limited auditing", 1));

            questions.add(new Question("Which type of corruption involves taking a cut from contracts?",
                    "Kickbacks", "Lobbying", "Bribery", "Procurement", 0));

            questions.add(new Question("Why is accountability important in governance?",
                    "It confuses voters", "Prevents abuse of power", "Ensures secrecy", "Reduces participation", 1));

            questions.add(new Question("Which country has had major anti-corruption protests in recent years?",
                    "Iceland", "Brazil", "Canada", "Norway", 1));

            questions.add(new Question("What is 'state capture'?",
                    "Government expansion", "Private interests taking control of public institutions", "Nationalization", "Technological dominance", 1));

            questions.add(new Question("How does transparency help prevent corruption?",
                    "Reduces oversight", "Increases public knowledge and accountability", "Hides fraud", "Promotes favoritism", 1));

            questions.add(new Question("Which tool is often used to expose corruption?",
                    "Propaganda", "Investigative journalism", "Data privacy", "Stock market", 1));

            questions.add(new Question("What sector is most vulnerable to corruption globally?",
                    "Fashion", "Construction and public procurement", "Education", "Space exploration", 1));

            questions.add(new Question("Which of the following is NOT a corruption-related crime?",
                    "Tax evasion", "Illegal lobbying", "Open elections", "Money laundering", 2));

            questions.add(new Question("Why do citizens protest corruption?",
                    "To support secrecy", "To demand reforms and justice", "To fund campaigns", "To promote monopolies", 1));
        }
        if (category.equals("politics") && quizIndex == 2) {
            questions.add(new Question("What is the key feature of democracy?",
                    "One-party rule", "Free and fair elections", "State censorship", "Absolute authority", 1));

            questions.add(new Question("What is a characteristic of authoritarian regimes?",
                    "Independent media", "Suppression of opposition", "Open parliaments", "Checks and balances", 1));

            questions.add(new Question("Which of the following best describes rule of law?",
                    "Leader decides law", "All people are subject to the same laws", "Law is optional", "Only elites follow law", 1));

            questions.add(new Question("How do authoritarian governments often control citizens?",
                    "Freedom of press", "State propaganda and surveillance", "Public debate", "Independent judiciary", 1));

            questions.add(new Question("Which country is widely seen as a strong democracy?",
                    "North Korea", "Canada", "Syria", "Belarus", 1));

            questions.add(new Question("What is electoral fraud?",
                    "Legal campaign funding", "Manipulation of voting process", "Public vote counting", "Debate system", 1));

            questions.add(new Question("Which of these institutions is essential in a democracy?",
                    "State-run TV", "Military-only courts", "Independent judiciary", "Royal council", 2));

            questions.add(new Question("How do democracies ensure accountability?",
                    "By banning opposition", "Through elections and public oversight", "By silencing critics", "By suspending constitutions", 1));

            questions.add(new Question("Which leader is typically associated with authoritarian rule?",
                    "Elected prime minister", "Absolute dictator", "Parliament speaker", "Mayor", 1));

            questions.add(new Question("Which freedom is central to democratic societies?",
                    "Censorship", "Freedom of expression", "Forced allegiance", "Party loyalty", 1));

            questions.add(new Question("What can lead to democratic backsliding?",
                    "Judicial independence", "Strong civil society", "Erosion of checks and balances", "Peaceful protests", 2));

            questions.add(new Question("What is a hybrid regime?",
                    "No political structure", "Mix of democratic and authoritarian features", "Global alliance", "Federal parliament", 1));

            questions.add(new Question("What is civic engagement?",
                    "Paying taxes", "Participation in public and political life", "Mandatory military service", "Ignoring politics", 1));

            questions.add(new Question("Which of the following is a democratic value?",
                    "Absolute control", "Transparency", "State loyalty", "Media blackout", 1));

            questions.add(new Question("What is voter suppression?",
                    "Encouraging turnout", "Preventing eligible people from voting", "Fixing polls", "Counting faster", 1));
        }

        return questions;
    }
}
