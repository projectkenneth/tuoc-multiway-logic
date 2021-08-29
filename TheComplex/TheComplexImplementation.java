package TheComplex;

import Helpers.Helpers;

public class TheComplexImplementation {
    public void execute() {
        var fiftyArray = Helpers.generateArray(50);
        var hundredFiftyArray = Helpers.generateArray(150);

        var quickSort = new QuickSort();
        var bubbleSort = new BubbleSort(quickSort);

        var sortChain = new SortingChain(bubbleSort);

        System.out.println("The Complex Implementation:");

        sortChain.sort(fiftyArray); // bubble sort
        sortChain.sort(hundredFiftyArray); // quick sort
        
        System.out.println("---");
    }
}
