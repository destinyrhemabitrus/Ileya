import java.util.Arrays;
public class StudentGradeManager{

    public static void main(String[] args){

        java.util.Scanner inputCollector = new java.util.Scanner(System.in);

        System.out.println("Enter number of students: ");
        int students = inputCollector.nextInt();
        
        System.out.println("Enter number of subjects: ");
        int subjects = inputCollector.nextInt();

        int[][] grades = new int[students][subjects];
        System.out.println();

//        Creating a 1D to store total for all subjects written by each student
        int[] studentTotal = new int[students];
        

//        Storing the scores in 2D Array
        int score;
        for(int counter = 0; counter < grades.length; counter++){
            int totalScore = 0;
            for(int counterTwo = 0; counterTwo < grades[counter].length; counterTwo++){
                
                boolean isWithinRange;
                do{                    
                    System.out.printf("Entering score for student %d%nEnter score for subject %d%n", counter + 1, counterTwo + 1);
                    score = inputCollector.nextInt();
                    System.out.println();
                    if(score >= 0 && score <= 100){

                        isWithinRange = true;

                    }else{
                        isWithinRange = false;
                        System.out.println("Invalid score, Kindly enter a score between 0 and 100 to proceed");
                    }

                }while(!isWithinRange); 
                

                System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>");
                grades[counter][counterTwo] = score;        
                System.out.printf("%s%n%n","Saved succesfully");
                
                totalScore = totalScore + score;
            }
            studentTotal[counter] = totalScore;

        }
       

        System.out.println("==================================================================================================");
        System.out.printf("%-16s","STUDENT");        
        for(int counter = 0; counter < grades[0].length; counter++){
            System.out.printf("%s%-9d","SUB",counter + 1);        
        }
        System.out.printf("%-12s%-12s%-12s%n","TOTAL","AVE","POS");
        System.out.println("==================================================================================================");

        for(int counter = 0; counter < grades.length; counter++){
            double count = 0;
            int total = 0;
            int position = 1;
            System.out.printf("Student %-8d",counter + 1);        
            for(int counterTwo = 0; counterTwo < grades[counter].length; counterTwo++){

                System.out.printf("%-12d",grades[counter][counterTwo]);
                count = count + 1.0;
                total = total + grades[counter][counterTwo];
        
            }
//            position Ranking
            for(int counterThree = 0; counterThree < studentTotal.length; counterThree++){

                if(studentTotal[counterThree] > studentTotal[counter]){
                    position = position + 1;
                }
            
            }
            System.out.printf("%-12d",total);
            System.out.printf("%-12.2f",(total/count));
            System.out.printf("%-12d%n",position);
        }

    }


}



