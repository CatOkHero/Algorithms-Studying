public class BinarySearchAlgorithm {
    public int BinarySearch(int[] array, int startingPoint, int lastPoint, int valueToFind) {
        int indexOfValue = -1;
        
        while(startingPoint <= lastPoint) {
            int midPoint = Math.round((startingPoint + lastPoint) / 2);

            if(array[midPoint] == valueToFind) {
                indexOfValue = midPoint;
                return indexOfValue;
            } else if(array[midPoint] < valueToFind){
                startingPoint = midPoint + 1;
            } else if (array[midPoint] > valueToFind) {
                lastPoint = midPoint - 1;
            }
        }

        return indexOfValue;
    }
}