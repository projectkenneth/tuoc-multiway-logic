package TheComplex;

public class QuickSort extends SortingAlgorithm {

    public QuickSort() {
        super();
    }

    public QuickSort(SortingAlgorithm NextAlgo) {
        super(NextAlgo);
    }

    @Override
    protected boolean canSort(int[] arrToSort) {
        return arrToSort.length > 100;
    }

    @Override
    protected int[] sortInternal(int[] arrToSort) {
        System.out.println("  Sorted " + arrToSort.length+ " items by quick sort!");
        // Implement quick sort
        return arrToSort;
    }
    
}