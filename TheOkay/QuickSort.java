package TheOkay;

public class QuickSort implements ISortingAlgorithm{

    @Override
    public int[] sort(int[] arrToSort) {
        System.out.println("  Sorted " + arrToSort.length+ " items by quick sort!");
        // Implement quick sort

        return arrToSort;
    }

    @Override
    public boolean canSort(int[] arrToSort) {
        return arrToSort.length > 100;
    }
    
}
