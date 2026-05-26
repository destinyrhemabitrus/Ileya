public class Level1Test{

    @org.junit.jupiter.api.Test
    public void Test_That_evenArrCountMethod_Exists(){

        int[] arr = {45,60,3,10,9,22};
        Level1.evenArrCount(arr);

    }

    @org.junit.jupiter.api.Test
    public void Test_That_evenArrCountMethod_ReturnsEvenCount(){

        int[] arr = {45,60,3,10,9,22,40,6,8};
        int actual = Level1.evenArrCount(arr);
        int expected = 6;
        org.junit.jupiter.api.Assertions.assertEquals(expected,actual);

    }



    @org.junit.jupiter.api.Test
    public void Test_That_oddArrCountMethod_Exists(){

        int[] arr = {45,60,3,10,9,22};
        Level1.oddArrCount(arr);

    }



    @org.junit.jupiter.api.Test
    public void Test_That_oddArrCountMethod_ReturnsOddCount(){

        int[] arr = {45,60,3,10,9,22,40,6,8,3};
        int actual = Level1.oddArrCount(arr);
        int expected = 4;
        org.junit.jupiter.api.Assertions.assertEquals(expected,actual);

    }


//-----------arraySplitter--------------

    @org.junit.jupiter.api.Test
    public void Test_That_arraySplitterMethod_Exists(){

        int[] arr = {45,60,3,10,9,22};
        Level1.arraySplitter(arr);

    }



    @org.junit.jupiter.api.Test
    public void Test_That_arraySplitterMethod_ReturnsSplitted2D_OddAndEvenArray(){

        int[] arr = {45,60,3,10,9,22,16,11,13,15};
        int[][] actual = Level1.arraySplitter(arr);
        int[][] expected = {{45,3,9,11,13,15},{60,10,22,16}};
        org.junit.jupiter.api.Assertions.assertArrayEquals(expected,actual);

    }



//-----------Question 2 ---------helper method

    @org.junit.jupiter.api.Test
    public void Test_That_arrayInverterMethod_Exists(){

        int[] arr = {45, 0, 8, 0, 45};
        Level1.arrayInverter(arr);

    }


    @org.junit.jupiter.api.Test
    public void Test_arrayInverterMethod_ReturnsInvertedArrayElements(){

        int[] arr = {45, 0, 8, 0, 4, 6};
        int[] actual = Level1.arrayInverter(arr);
        int[] expected = {6, 4, 0, 8, 0, 45};
        org.junit.jupiter.api.Assertions.assertArrayEquals(expected,actual);

    }

//------------parlindrome checker---------
    @org.junit.jupiter.api.Test
    public void Test_That_parlindromeCheckerMethod_Exists(){

        int[] arr = {45, 0, 8, 0, 45};
        Level1.parlindromeChecker(arr);

    }


    @org.junit.jupiter.api.Test
    public void Test_parlindromeCheckerMethod_withParlindromeArray_ReturnsTrue(){

        int[] arr = {45, 0, 8, 0, 45};
        boolean actual = Level1.parlindromeChecker(arr);
        org.junit.jupiter.api.Assertions.assertTrue(actual);


    }


    @org.junit.jupiter.api.Test
    public void Test_parlindromeCheckerMethod_withNonParlindromeArray_ReturnsFalse(){

        int[] arr = {45, 0, 8, 0, 4};
        boolean actual = Level1.parlindromeChecker(arr);
        org.junit.jupiter.api.Assertions.assertFalse(actual);

    }


//---------Question 3 perfectSquare computer-----
    @org.junit.jupiter.api.Test
    public void Test_That_perfectSquareMethod_Exists(){

        int[] arr = {45, 0, 8, 0, 45};
        Level1.perfectSquare(arr);

    }


    @org.junit.jupiter.api.Test
    public void Test_perfectSquareMethod_WithArrayOFPerfectAndNonPerfectSquareElements_ReturnsArrayOfPerfectSquareElements(){

        int[] arr = {4, 7, 9, 10, 16, 18, 49};
        int[] actual = Level1.perfectSquare(arr);
        int[] expected = {4,9,16,49};
        org.junit.jupiter.api.Assertions.assertArrayEquals(expected,actual);

    }


//-----------Question 4--------------------nonPerfectSqrArrayElementReplacer

    @org.junit.jupiter.api.Test
    public void Test_That_nonPerfectSqrArrayElementReplacerMethod_Exists(){

        int[] arr = {4, 7, 9, 10, 49, 6};
        Level1.nonPerfectSqrArrayElementReplacer(arr);

    }


    @org.junit.jupiter.api.Test
    public void Test_nonPerfectSqrArrayElementReplacerMethod_ReturnsArrayWithNonPerfectSquareElementReplacesByNegativeOne(){

        int[] arr = {3,4, 7, 9, 10, 49, 6,25};
        int[] actual = Level1.nonPerfectSqrArrayElementReplacer(arr);
        int[] expected = {-1,4,-1,9,-1,49,-1,25};
        org.junit.jupiter.api.Assertions.assertArrayEquals(expected,actual);

    }




}
