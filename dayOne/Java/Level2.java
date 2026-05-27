import java.util.Arrays;
public class Level2{

   
//    Question 1
    public static int[] duplicateExtractor(int[] arr){
        
        int count = 0;
        for(int counter = 0; counter < arr.length; counter++){

            for(int counterTwo = 0; counterTwo < counter; counterTwo++){

                if(arr[counter] == arr[counterTwo]){

                    count = count + 1;
                    break;

                }
            }
        }

        int[] output = new int[count];
        int index = 0;

        for(int counter = 0; counter < arr.length; counter++){

            for(int counterTwo = 0; counterTwo < counter; counterTwo++){

                if(arr[counter] == arr[counterTwo]){

                    output[index] = arr[counter];
                    index = index + 1;
                    break;

                }
            }
        }

        int count2 = 0;
        for(int counter = 0; counter < output.length; counter++){
        
            boolean isDuplicate = false;
            for(int counterTwo = 0; counterTwo < counter; counterTwo++){

                if(output[counter] == output[counterTwo]){

                    isDuplicate = true;
                    break;

                }

            }

            if(isDuplicate == false){

                count2 = count2 + 1;

            }
        }

        int[] finalOutput = new int[count2];
        int index2 = 0;
        
        for(int counter = 0; counter < output.length; counter++){
        
            boolean isDuplicate = false;
            for(int counterTwo = 0; counterTwo < counter; counterTwo++){

                if(output[counter] == output[counterTwo]){

                    isDuplicate = true;
                    break;

                }
            }

            if(isDuplicate == false){

                finalOutput[index2] = output[counter];
                index2 = index2 + 1;               

            }
        }
       return finalOutput;
    }



//    Question 3
    public static int[] zeroShifter(int[] arr){

        int index = 0;
        for(int counter = 0; counter < arr.length; counter++){

            if(arr[counter] != 0){

                arr[index] = arr[counter];
                index = index + 1;

            }

        }

        while(index < arr.length){
            
            arr[index] = 0;
            index = index + 1;

        }
        return arr;
    }
















}
