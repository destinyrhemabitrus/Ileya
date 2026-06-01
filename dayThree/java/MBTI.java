import java.util.Scanner;
public class MBTI{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);
        
        String[] questionA = {"A. expend energy, enjoy groups",
                              "A. Interpret literally",
                            "A. logical, thinking, questioning",
                            "A. organized, orderly",
                            "A. more outgoing, think out loud",
                            "A. practical, realistic, experiential",
                            "A. candid, straight forward, frank",
                            "A. plan, schedule",
                            "A. seek many tasks, public activities, interaction with others",
                            "A. standard, usual, conventional",
                            "A. firm, tend to criticize, hold the line",
                            "A. regulated, structured", 
                            "A. external, communicative, express yourself",
                            "A. focus on here-and-now",
                             "A. tough-minded, just",
                            "A. preparation, plan ahead",
                            "A. active, initiate",
                            "A. facts, things, what is",
                            "A. matter of fact, issue-oriented",
                            "A. control, govern"};

        String[] questionB = {"B. conserve energy, enjoy one-on-one",
                              "B. look for meaning and possibilities",
                              "B. empathetic, feeling, accommodating",
                                "B. flexible, adaptable",
                                  "B. more reserved, think to yourself",
                                   "B. imaginative, innovative, theoretical",
                                    "B. tactful, kind, encouraging",
                                    "B. unplanned, spontaneous",
                                    "B. seek private, solitary activities with quiet to concentrate",
                                    "B. different, novel, unique",
                                    "B. gentle, tend to appreciate, conciliate",
                                    "B. easy-going, live and let live",
                                     "B. internal, reticent, keep to yourself",
                                      "B. look to the future, global perspective,big picture",
                                        "B. tender-hearted, merciful",
                                    "B. go with the flow, adapt as you go",
                                        "B. reflective, deliberate",
                                        "B. ideas, dreams, what could be, philosophical",
                                        "B. sensitive, people-oriented, compassionate",
                                        "B. latitude, freedom"};
        


        String[] response = new String[20];
        String choice;
        System.out.println("What is your name: ");
        String name = inputCollector.nextLine();
        for(int counter = 0; counter < questionA.length; counter++){

            System.out.printf("%-64s%s%n", questionA[counter], questionB[counter]);
            choice = inputCollector.nextLine();
            response[counter] = choice;

        }
    
        System.out.println("Hello " + name + " You selected" );
//        For Extroverted vs Introverted: Questions 1,5,9,13,17
        int countA1 = 0;
        int countB1 = 0;
        for(int counter = 0; counter < questionA.length; counter++){

            if(counter == 0 || counter == 4 || counter == 8 || counter == 12 || counter == 16){
                if(response[counter].equals("A")){
                    System.out.println(questionA[counter]);
                    countA1 = countA1 + 1; 
                }else if(response[counter].equals("B")){
                    System.out.println(questionB[counter]);
                    countB1 = countB1 + 1;
                }
            }

        }
        System.out.printf("Numbers of A selected: %d%nNumbers of B Selected: %d%n",countA1,countB1);
        System.out.println();

//        For Sensing vs Intuitive: Questions 2,6,10,14,18
        int countA2 = 0;
        int countB2 = 0;
        for(int counter = 0; counter < questionA.length; counter++){

            if(counter == 1 || counter == 5 || counter == 9 || counter == 13 || counter == 17){
                if(response[counter].equals("A")){
                    System.out.println(questionA[counter]);
                    countA2 = countA2 + 1; 
                }else if(response[counter].equals("B")){
                    System.out.println(questionB[counter]);
                    countB2 = countB2 + 1;
                }
            }

        }
        System.out.printf("Numbers of A selected: %d%nNumbers of B Selected: %d%n",countA2,countB2);
        System.out.println();



//        For Thinking vs Feeling: Questions 3,7,11,15,19
        int countA3 = 0;
        int countB3 = 0;
        for(int counter = 0; counter < questionA.length; counter++){

            if(counter == 2 || counter == 6 || counter == 10 || counter == 14 || counter == 18){
                if(response[counter].equals("A")){
                    System.out.println(questionA[counter]);
                    countA3 = countA3 + 1; 
                }else if(response[counter].equals("B")){
                    System.out.println(questionB[counter]);
                    countB3 = countB3 + 1;
                }
            }

        }
        System.out.printf("Numbers of A selected: %d%nNumbers of B Selected: %d%n",countA3,countB3);
        System.out.println();


//        For judging vs Perceptive: Questions 4,8,12,16,20
        int countA4 = 0;
        int countB4 = 0;
        for(int counter = 0; counter < questionA.length; counter++){

            if(counter == 3 || counter == 7 || counter == 11 || counter == 15 || counter == 19){
                if(response[counter].equals("A")){
                    System.out.println(questionA[counter]);
                    countA4 = countA4 + 1; 
                }else if(response[counter].equals("B")){
                    System.out.println(questionB[counter]);
                    countB4 = countB4 + 1;
                }
            }

        }
        System.out.printf("Numbers of A selected: %d%nNumbers of B Selected: %d%n",countA4,countB4);
        System.out.println();

//        highest count between A and B for each category behavior

        String highest1;
        String highest2;
        String highest3;
        String highest4;
        if(countA1 > countB1){

            highest1 = "E";
        }else{
            highest1 = "I";
        }

        if(countA2 > countB2){

            highest2 = "S";
        }else{
            highest2 = "N";
        }


        if(countA3 > countB3){

            highest3 = "T";
        }else{
            highest3 = "F";
        }

        if(countA4 > countB4){

            highest4 = "J";
        }else{
            highest4 = "P";
        }

//    Combination formed

        String combination = highest1 + highest2 + highest3 + highest4;
        System.out.printf("Personality is: %s%n", combination);
        
        String personality1 = "INFP";
        if(combination.equals(personality1)){

            System.out.printf("INFP%nHealer%nThe Thoughtful Idealist (MBTI)%nThe Mediator (16Personalities)%n%nThe INFP Personality Type%nINFPs are imaginative idealists, guided by their own core values and beliefs. To a Healer, possibilities are paramount; the realism of the moment is only of passing concern. They see potential for a better future, and pursue truth and meaning with their own individual flair.%n%nINFPs are sensitive, caring, and compassionate, and are deeply concerned with the personal growth of themselves and others. Individualistic and nonjudgmental, INFPs believe that each person must find their own path. They enjoy spending time exploring their own ideas and values, and are gently encouraging to others to do the same. INFPs are creative and often artistic; they enjoy finding new outlets for self-expression.%n%nWhat does INFP stand for?%nINFP is one of the sixteen personality types created by Katharine Briggs and Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI®). INFP stands for Introversion, iNtuition, Feeling, and Perceiving, which are four core personality traits based on the work of psychologist C.G. Jung.%n%nEach of the four letters of the INFP code signifies a key personality trait of this type. INFPs are energized by time alone (Introverted), focus on ideas and concepts rather than facts and details (iNtuitive), make decisions based on feelings and values (Feeling), and prefer to be spontaneous and flexible rather than planned and organized (Perceiving).%n");
        }
        
    }




    public static String name(String name){
        return name;
    }


}


