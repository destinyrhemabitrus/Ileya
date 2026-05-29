import java.util.Arrays;
public class Level3{

    public static void main(String[] args){

//        int[][] arr = {{9, 0, 7},{3, 5, 1},{8, 1, 7},{9, 9, 6}};
//        System.out.println(arr[0][1]);
//
    }

    public static int[] arrayFlattener(int[][] arr){

        int count = 0;        
        for(int counter = 0; counter < arr.length; counter++){

            for(int counterTwo = 0; counterTwo < arr[counter].length; counterTwo++){

                count = count + 1;
    
            }
        }

        int[] output = new int[count];
        int index = 0;
        for(int counter = 0; counter < arr.length; counter++){

            for(int counterTwo = 0; counterTwo < arr[counter].length; counterTwo++){

                output[index] = arr[counter][counterTwo];
                index = index + 1;
            }
        }
        return output;
    }

}
