package sortingAlgorithms;

/*
Selection sort finds the smallest number in the list and swaps it with the first element. It then finds the
smallest number remaining and swaps it with the second element, and so on, until only a single number remains
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] myArray = {9, 19, 2, 4};

        int[] sortedArray = selectionSort(myArray);
        System.out.println("The sorted array : ");
        for (int each : sortedArray)
            System.out.print(each + " ");

    }

    public static int[] selectionSort(int[] array)
    {
        for(int current = 0; current < array.length; ++current)
        {
            int min =  array[current];
            int minIndex = 0;

            boolean change = false;
            for(int i = current; i < array.length; ++i)
            {
                if(min > array[i])
                {
                    min = array[i];
                    minIndex = i;
                    change = true;
                }
            }

            if (change)
            {
                int temp = array[current];
                array[current] =  min;
                array[minIndex] = temp;
            }

        }
        return array;
    }//End sorting method
}
