package TheComplex;

public abstract class SortingAlgorithm {
    private SortingAlgorithm NextAlgo = null;

    public SortingAlgorithm() {
    }

    public SortingAlgorithm(SortingAlgorithm NextAlgo) {
        this.NextAlgo = NextAlgo;
    }

    protected abstract boolean canSort(int[] arrToSort);

    protected abstract int[] sortInternal(int[] arrToSort);

    public int[] sort(int[] arrToSort) {
        if (this.canSort(arrToSort)) {
            return this.sortInternal(arrToSort);
        } else if (this.NextAlgo != null) {
            return this.NextAlgo.sort(arrToSort);
        } else {
            return arrToSort;
        }
    }
}