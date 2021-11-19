package sortingAlgorithms;

public class SelectionSort2
{
    public static void main(String[] args)
    {
        int[] array = {3,7,1,2,4};

        //Finding the indexSmallest number in the array /*PASSED*/
        int indexSmallest = 0;
        for(int i = 0; i<array.length; i++)
        {
            if(array[i] < array[indexSmallest])
                indexSmallest = i;
        }

        //Make indexSmallest be the leading value /*PASSED*/
        if(indexSmallest != 0)
        {
            int temp = array[0];
            array[0] = array[indexSmallest];
            array[indexSmallest] = temp;
        }

        for( int currentIndex = 1; currentIndex < array.length; currentIndex++)
        {
            indexSmallest = currentIndex;
            for(int i = currentIndex; i < array.length; i++)
            {
                if(array[indexSmallest] > array[i])
                    indexSmallest = i;
            }

            if(indexSmallest != currentIndex)
            {
                int temp = array[currentIndex];
                array[currentIndex] = array[indexSmallest];
                array[indexSmallest] = temp;
            }
        }

        //Test the sorting algorithm
        System.out.print("The sorted array is : ");
        for(int each : array)
            System.out.print(each + " ");

    }
}