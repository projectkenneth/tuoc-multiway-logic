package TheComplex;

public class BubbleSort extends SortingAlgorithm {

    public BubbleSort() {
        super();
    }

    public BubbleSort(SortingAlgorithm NextAlgo) {
        super(NextAlgo);
    }

    @Override
    protected boolean canSort(int[] arrToSort) {
        return arrToSort.length <= 100;
    }

    @Override
    protected int[] sortInternal(int[] arrToSort) {
        System.out.println("  Sorted " + arrToSort.length+ " items by bubble sort!");
        // Implement bubble sort
        return arrToSort;
    }
    
}