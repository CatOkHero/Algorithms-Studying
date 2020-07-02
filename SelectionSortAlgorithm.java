public class SelectionSortAlgorithm {
    private void SwapMethod(int[] array, int firstValueIndex, int secondValueIndex) {
        int temp = array[firstValueIndex];
        array[firstValueIndex] = array[secondValueIndex];
        array[secondValueIndex] = temp;
    }

    private int IndexOfMinimumValue(int[] array, int startingPoint) {
        int minValueIndex = -1;
        int minValue = array[startingPoint];

        for(int i = startingPoint + 1; i < array.length; i++) {
            if(array[i] < minValue) {
                minValue = array[i];
                minValueIndex = i;
            }
        }

        return minValueIndex;
    }

    public void SelectionSort(int[] array) {        
        for(int i = 0; i < array.length - 1; i++) {
            int minimumValueIndex = IndexOfMinimumValue(array, i);
            SwapMethod(array, i, minimumValueIndex);
        }
    }
}