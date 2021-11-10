package testers;

import searchAlgorithms.BinarySearch;
import java.util.Scanner;

public class BinarySearchTester
{
   public static void main(String[] args)
   {
       int[] targetArray;
       int[] evenArray = {1, 2, 3, 4, 5, 6, 3001, 3151, 3251, 3255};
       BinarySearch binarySearch = new BinarySearch(evenArray);
       Scanner input = new Scanner(System.in);

       String result = "";
       String reason = "";

       /**
        * Tests for an array with even number of elements
        */
       //Target 1
       targetArray = evenArray;
       if(binarySearch.binarySearch(targetArray,1) == 0)
           result += "Test 1 \t:\t Passed\n";

       else if(binarySearch.binarySearch(targetArray,1) != 0)
           result += "Test 1 \t:\t Failed - Target 1 should be 0\n";

       if(binarySearch.binarySearch(targetArray,3001) == 6)
           result += "Test 2 \t:\t Passed\n";

       else if(binarySearch.binarySearch(targetArray,3001) != 6)
           result += "Test 2 \t:\t Failed - Target 3001 should be 6\n";

       if(binarySearch.binarySearch(targetArray, 3255) == 9)
           result += "Test 3 \t:\t Passed\n";

       else if(binarySearch.binarySearch(targetArray, 3255) != 9)
           result += "Test 3 \t:\t Failed - Target 3255 should be 9\n";

       if(binarySearch.binarySearch(targetArray, 4548) == -1)
           result += "Test 4 \t:\t Passed";

       else if(binarySearch.binarySearch(targetArray, 4548) != -1)
           result += "Test 4 \t:\t Failed - Target 4548 should be -1\n";

       System.out.println("Even number of elements\n" + result);

       result = "";

       int[] oddArray = {1, 2, 3, 4, 5, 6, 3001, 3151, 3251};
       targetArray = oddArray;
       /**
        * Tests for an array with odd number of elements
        */
       //Target 1
       if(binarySearch.binarySearch(targetArray,1) == 0)
           result += "Test 1 \t:\t Passed\n";

       else if(binarySearch.binarySearch(targetArray,1) != 0)
           result += "Test 1 \t:\t Failed - Target 1 should be 0\n";

       if(binarySearch.binarySearch(targetArray,3001) == 6)
           result += "Test 2 \t:\t Passed\n";

       else if(binarySearch.binarySearch(targetArray,3001) != 6)
           result += "Test 2 \t:\t Failed - Target 3001 should be 6\n";

       if(binarySearch.binarySearch(targetArray, 3251) == 8)
           result += "Test 3 \t:\t Passed\n";

       else if(binarySearch.binarySearch(targetArray, 3255) != 8)
           result += "Test 3 \t:\t Failed - Target 3255 should be 8\n";

       if(binarySearch.binarySearch(targetArray, 4548) == -1)
           result += "Test 4 \t:\t Passed";

       else if(binarySearch.binarySearch(targetArray, 4548) != -1)
           result += "Test 4 \t:\t Failed - Target 4548 should be -1\n";

       System.out.println("\nOdd number of elements\n" + result);

       System.out.println("\nTests for an array of 1 element");

   }

   public static void tests(int[] array, String testTittle,String explanation ,int result)
   {

   }

}
