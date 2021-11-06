package searchAlgorithms;
import java.util.Scanner;

public class BinarySearch {
    int array[];
    int target;

    public BinarySearch(int array[])
    {
        this.array = array;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public int binarySearch(int array[], int target)
    {
        int min = 0;
        int mid;
        int max = array.length - 1;

        while(min <= max)
        {
            mid = (min + max)/2;
            if (target == array[mid])
                return mid;

            else if(target > array[mid])
                min = mid + 1;

            else
                max = mid -1 ;

        }
        return -1;
    }

}
