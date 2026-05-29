public class Level3Test{

    @org.junit.jupiter.api.Test
    public void Test_that_arrayFlattenerMethod_Exists(){

        int[][] arr = {{9, 0, 7},{3, 5, 1},{8, 1, 7},{9, 9, 6}};
        Level3.arrayFlattener(arr);

    }

    @org.junit.jupiter.api.Test
    public void Test_arrayFlattenerMethod_With2DArray_Returns1DArray(){

        int[][] arr = {{9, 0, 7},{3, 5, 1},{8, 1, 7},{9, 9, 6}};
        int[] actual = Level3.arrayFlattener(arr);
        int[] expected = {9, 0, 7, 3, 5, 1, 8, 1, 7, 9, 9, 6};
        org.junit.jupiter.api.Assertions.assertArrayEquals(expected,actual);

    }

}
