package TheUsual;

import Helpers.Helpers;

public class TheUsualImplementation {

    private int[] quickSort(int[] arrToSort) {
        System.out.println("  Sorted " + arrToSort.length+ " items by quick sort!");
        // Implement quick sort

        return arrToSort;
    }

    private int[] bubbleSort(int[] arrToSort) {
        System.out.println("  Sorted " + arrToSort.length+ " items by bubble sort!");
        // Implement bubble sort

        return arrToSort;
    }

    private int[] sort(int[] arrToSort) {
        if (arrToSort.length <= 100) {
            return this.bubbleSort(arrToSort);
        }

        return this.quickSort(arrToSort);
    }

    public void execute() {
        var fiftyArray = Helpers.generateArray(50);
        var hundredFiftyArray = Helpers.generateArray(150);

        System.out.println("The Usual Implementation:");

        this.sort(fiftyArray); // bubble sort
        this.sort(hundredFiftyArray); // quick sort
        
        System.out.println("---");
    }
}
