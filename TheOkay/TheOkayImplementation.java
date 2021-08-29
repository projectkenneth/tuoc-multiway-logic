package TheOkay;

import Helpers.Helpers;

public class TheOkayImplementation {
    private int[] sort(int[] arrToSort) {
        var sortingAlgos = new ISortingAlgorithm[] {
            new BubbleSort(),
            new QuickSort()
        };

        var canSort = false;
        var i = 0;
        do {
            canSort = sortingAlgos[i].canSort(arrToSort);

            if (canSort) {
                return sortingAlgos[i].sort(arrToSort);
            }

            i++;
        } while (!canSort && i < sortingAlgos.length);

        return arrToSort;
    }

    public void execute() {
        var fiftyArray = Helpers.generateArray(50);
        var hundredFiftyArray = Helpers.generateArray(150);

        System.out.println("The Okay Implementation:");

        this.sort(fiftyArray); // bubble sort
        this.sort(hundredFiftyArray); // quick sort
        
        System.out.println("---");
    }
}
