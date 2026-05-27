public class Level2Test{

//  Question 1
    @org.junit.jupiter.api.Test
    public void Test_That_duplicateExtractorMethod_Exists(){

        int[] arr = {45,60,3,10,9,22};
        Level2.duplicateExtractor(arr);

    }

    @org.junit.jupiter.api.Test
    public void Test_That_duplicateExtractorMethod_ReturnsUniqueDuplicateArr(){

        int[] arr = {1, 2, 3, 2, 4, 3, 6,6,9,9,9};
        int[] actual = Level2.duplicateExtractor(arr);
        int[] expected = {2,3,6,9};
        org.junit.jupiter.api.Assertions.assertArrayEquals(expected,actual);

    }


//  Question 3
    @org.junit.jupiter.api.Test
    public void Test_That_zeroShifterMethod_Exists(){

        int[] arr = {5,0,3,0,2,0};
        Level2.zeroShifter(arr);

    }

    @org.junit.jupiter.api.Test
    public void Test_That_zeroShifterMethod_ReturnsArrayWithAllZerosAtTheEnd(){

        int[] arr = {5,0,3,0,2,0};
        int[] actual = Level2.zeroShifter(arr);
        int[] expected = {5,3,2,0,0,0};
        org.junit.jupiter.api.Assertions.assertArrayEquals(expected,actual);

    }



}
