package testers;

import searchAlgorithms.LinearSearch;

public class LinearSearchTester
{
    public static void main(String[] args)
    {
        int[] myArray = {1,4,5,2,3,21,15,48,68,51,12,33};
        LinearSearch linSearchObj = new LinearSearch();

        String result = "";
        //Testing the first element
        if(linSearchObj.linearSearch(myArray, 1) == 0)
            result += "Test 1 \t:\t Passed\n";
        else
            result += "Test 1 \t:\t Failed -> 1 is in index 1 but the code returns " + linSearchObj.linearSearch(myArray,1) +'\n';

        //Testing the last element
        if(linSearchObj.linearSearch(myArray, 33) == 11)
            result += "Test 2 \t:\t Passed\n";
        else
            result += "Test 2 \t:\t Failed -> 33 is in index 11 but the code returns " + linSearchObj.linearSearch(myArray, 33) +'\n';

        //Testing a random element in the middle
        if(linSearchObj.linearSearch(myArray,15) == 6)
            result += "Test 3 \t:\t Passed\n";
        else
            result += "Test 3 \t:\t Failed -> 15 is in index 6 but the code returns " + linSearchObj.linearSearch(myArray, 15) +'\n';

        //Testing if an element does not exist
        if(linSearchObj.linearSearch(myArray, 456) == -1)
            result += "Test 4 \t:\t Passed\n";
        else
            result += "Test 4 \t:\t Failed -> 456 does not exist thus the code should return -1\n";

        System.out.println(result);
    }
}
