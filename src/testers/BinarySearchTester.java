package testers;

import searchAlgorithms.BinarySearch;
import java.util.Scanner;

public class BinarySearchTester
{
   public static void main(String[] args)
   {
       int[] myArray = {1, 2, 3, 4, 5, 6, 3001, 3151, 3251, 3255};
       BinarySearch binarySearch = new BinarySearch(myArray);
       Scanner input = new Scanner(System.in);

       String result = "";
       String reason = "";

       //Target 1
       if(binarySearch.binarySearch(myArray,1) == 0)
           result += "Test 1 \t:\t Passed\n";

       else if(binarySearch.binarySearch(myArray,1) != 0)
           result += "Test 1 \t:\t Failed - Target 1 should be 0\n";

       if(binarySearch.binarySearch(myArray,3001) == 6)
           result += "Test 2 \t:\t Passed\n";

       else if(binarySearch.binarySearch(myArray,3001) != 6)
           result += "Test 2 \t:\t Failed - Target 3001 should be 6\n";

       if(binarySearch.binarySearch(myArray, 3255) == 9)
           result += "Test 3 \t:\t Passed\n";

       else if(binarySearch.binarySearch(myArray, 3255) != 9)
           result += "Test 3 \t:\t Failed - Target 3255 should be 9\n";

       if(binarySearch.binarySearch(myArray, 4548) == -1)
           result += "Test 4 \t:\t Passed";

       else if(binarySearch.binarySearch(myArray, 4548) != -1)
           result += "Test 4 \t:\t Failed - Target 4548 should be -1\n";

       System.out.println(result);
   }

   public static void tests(int[] array, String testTittle,String explanation ,int result)
   {

   }

}
