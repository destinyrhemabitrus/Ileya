import java.util.Arrays;
public class Level1{


    public static void main(String[] args){

//        int[] arr = {45, 3, 0, 45, 3,9};
//        
//        System.out.println(Arrays.toString(arrayInverter(arr)));
//
//        int number = 5;
//        int root = (int)Math.sqrt(number);
//        int result = root * root 
//        System.out.println(root);
//
    }

//    Helper method
    public static int evenArrCount(int[] arr){

        int count = 0;
        for(int counter = 0; counter < arr.length; counter++){

            if(arr[counter]%2 == 0){
            
                count = count + 1;    
        
            }

        }

        return count;

    }


//    Helper method
    public static int oddArrCount(int[] arr){

        int count = 0;
        for(int counter = 0; counter < arr.length; counter++){

            if(arr[counter]%2 != 0){
            
                count = count + 1;    
        
            }

        }

        return count;

    }


//
    public static int[][] arraySplitter(int[] arr){

        int evenCount =  evenArrCount(arr);
        int oddCount =  oddArrCount(arr);
        
        int rowOne = 0;
        int rowTwo = 1;
        int columnOne = 0;
        int columnTwo = 0;
        int[][] splitted = new int[2][];
        splitted[0] = new int[oddCount];
        splitted[1] = new int[evenCount];

        for(int counter = 0; counter < arr.length; counter++){

            if(arr[counter]%2 != 0){
            
                splitted[rowOne][columnOne] = arr[counter];
                columnOne = columnOne + 1;   
        
            }else{

                splitted[rowTwo][columnTwo] = arr[counter];
                columnTwo = columnTwo + 1;       
            
            }

        }
 
        return splitted;

    }




//---------------Question 2------------------Parlindrome

//    Helper method
    public static int[] arrayInverter(int[] arr){

        int[] output = new int[arr.length];
        int index = 0;
        for(int counter = arr.length - 1; counter >= 0; counter--){

            output[index] = arr[counter]; 
            index = index + 1;
        }

        return output;

    }


//------------parlindromeChecker


    public static boolean parlindromeChecker(int[] arr){

        int[] invertedArray = arrayInverter(arr);
        return Arrays.equals(invertedArray, arr);
    }


//---------Question 3----------

    public static int[] perfectSquare(int[] arr){
        int root;
        int count = 0;
        for(int counter = 0; counter < arr.length; counter++){
        
            root = (int)Math.sqrt(arr[counter]);
            
            if(root * root == arr[counter]){

                count = count + 1;

            }
                
        }
    
        int[] output = new int[count];
        int index = 0;
        for(int counter = 0; counter < arr.length; counter++){
        
            root = (int)Math.sqrt(arr[counter]);
            
            if(root * root == arr[counter]){

                output[index] = arr[counter];
                index = index + 1;

            }
                
        }


        return output;

    }

//----------Question 4---------------

    public static int[] nonPerfectSqrArrayElementReplacer(int[] arr){
    
        int root;
        for(int counter = 0; counter < arr.length; counter++){
        
            root = (int)Math.sqrt(arr[counter]);
            
            if(root * root == arr[counter]){

                arr[counter] = arr[counter];
                

            }else{

                arr[counter] = -1;                
                
            }
                
        }


        return arr;

    }


}
