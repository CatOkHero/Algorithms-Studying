public class InsertionSortAlgorithm {
    private void Insert(int[] array, int toPoint, int value) {
        int i = -1;
        for(i = toPoint; i >= 0 && array[i] > value; i--) {
            array[i + 1] = array[i];
        }

        array[i + 1] = value;
    }
    
    public void InsertionSort(int[] array) {
        int lastElement = array[0];

        for(int i = 1; i < array.length; i++) {
            if(array[i] < lastElement) {
                Insert(array, i - 1, array[i]);
            }

            lastElement = array[i];
        }
    }
}