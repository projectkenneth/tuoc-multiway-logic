package TheOkay;

public class BubbleSort implements ISortingAlgorithm{

    @Override
    public int[] sort(int[] arrToSort) {
        System.out.println("  Sorted " + arrToSort.length+ " items by bubble sort!");
        // Implement quick sort

        return arrToSort;
    }

    @Override
    public boolean canSort(int[] arrToSort) {
        return arrToSort.length <= 100;
    }
    
}
