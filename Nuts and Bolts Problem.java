class Solution {
    private static final char[] order = { '!', '#', '$', '%', '&', '*', '?', '@', '^' };
    void matchPairs(int n, char nuts[], char bolts[]) {
        matchPairsUtil(nuts, bolts, 0, n - 1);
    }
    private void matchPairsUtil(char[] nuts, char[] bolts, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(nuts, low, high, bolts[high]);
            partition(bolts, low, high, nuts[pivotIndex]);
            matchPairsUtil(nuts, bolts, low, pivotIndex - 1);
            matchPairsUtil(nuts, bolts, pivotIndex + 1, high);
        }
    }
    private int partition(char[] array, int low, int high, char pivot) {
        int i = low;
        for (int j = low; j < high; j++) {
            if (compare(array[j], pivot) < 0) {
                swap(array, i, j);
                i++;
            } else if (compare(array[j], pivot) == 0) {
                swap(array, j, high);
                j--;
            }
        }
        swap(array, i, high);
        return i;
    }
    private int compare(char a, char b) {
        int indexA = -1, indexB = -1;
        for (int i = 0; i < order.length; i++) {
            if (order[i] == a) {
                indexA = i;
            }
            if (order[i] == b) {
                indexB = i;
            }
        }
        return indexA - indexB;
    }
    private void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
