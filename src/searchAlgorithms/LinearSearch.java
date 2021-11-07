package searchAlgorithms;

public class LinearSearch
{
    public int linearSearch(int[] array, int target)
    {
        int arraySize = array.length;
        for(int i = 0; i < arraySize; ++i)
        {
            if(array[i] == target)
                return i;
        }
        return -1;
    }
}
