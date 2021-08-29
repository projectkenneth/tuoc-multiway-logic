package TheComplex;

public class SortingChain {
    private SortingAlgorithm RootAlgo;

    public SortingChain(SortingAlgorithm RootAlgo) {
        this.RootAlgo = RootAlgo;
    }
    
    public int[] sort(int[] arrToSort) {
        return this.RootAlgo.sort(arrToSort);
    }
}