package searchAlgorithms;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 19, 52, 58, 204, 351, 352, 353, 354, 3001, 3151, 3251, 3255};
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the target here : ");
        int target = input.nextInt();

        System.out.println("The target " + target + " is in index : " + binarySearch(myArray, target) );

    }

    public static int binarySearch(int[] array, int target)
    {
        int posMin, posMax, middle;
        posMin = 0;
        posMax = array.length;
        boolean found = false;

        while(!found)
        {
            middle = (posMax + posMin)/2;
            System.out.println(middle);

            if(middle == posMax)
                found = true;

            if(target == array[middle])
            {
                found = true;
                return middle;
            }

            else if(target > array[middle])
            {
                posMin = middle;
                middle = (posMin + posMax)/2;
            }

            else if(target < array[middle])
            {
                posMax = middle;
                middle = (posMin + posMax)/2;
            }

        }

        return -1;
    }

}
