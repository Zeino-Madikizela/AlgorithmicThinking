package sortingAlgorithms;

public class BubbleSort
{
    public static void main(String[] args)
    {
        int[] array = {9,3,7,2,5,1};
        System.out.print("The array is \t\t\t : ");
        for(int each: array)
            System.out.print(each +" ");
        System.out.println();

        boolean change = true;
        while (change)
        {
            change = false;
            for(int current = 0; current <= array.length-2; current++)
            {
                if(array[current] > array[current + 1])
                {
                    int temp = array[current];
                    array[current] = array[current+1];
                    array[current+1] = temp;
                    change = true;
                }
            }

            if(change)
            {
                System.out.print("The semi-sorted array is : ");
                for(int each: array)
                    System.out.print(each +" ");
                System.out.println();
            }
        }

        System.out.print("The sorted array is \t : ");
        for(int each: array)
            System.out.print(each +" ");
        System.out.println();
    }
}
