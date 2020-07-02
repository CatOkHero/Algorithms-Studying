import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearchAlgorithm {
    public class BreadthFirstSearchModel {
        public Integer Depth;
        public Integer Predecessor;
    }

    public void BreadthFirstSearch(final Integer[][] array, final int valueToSearch) {
        final BreadthFirstSearchModel[] bfsArray = new BreadthFirstSearchModel[array.length];
        for (int i = 0; i < array.length; i++) {
            bfsArray[i] = new BreadthFirstSearchModel();
            bfsArray[i].Depth = null;
            bfsArray[i].Predecessor = null;
        }

        bfsArray[valueToSearch].Depth = 0;
        bfsArray[valueToSearch].Predecessor = -1;


        final Queue<Integer> queue = new LinkedList<>();
        queue.add(valueToSearch);

        while (!queue.isEmpty()) {
            final Integer element = queue.poll();

            for(int i = 0; i < array[element].length; i++) {
                Integer ancestor = array[element][i];

                if(bfsArray[ancestor].Predecessor == null && ancestor != valueToSearch) {
                    bfsArray[ancestor].Predecessor = element;
                    bfsArray[ancestor].Depth = bfsArray[element].Depth + 1;
                    queue.add(ancestor);
                }
            }
        }

        for(Integer i = 0; i < array.length; i++) {
            System.out.println("Depth = ".concat(bfsArray[i].Depth.toString())
                .concat(" Predecessor = ").concat(bfsArray[i].Predecessor.toString())
                .concat(" Element = ").concat(i.toString()));
        }
    }
}