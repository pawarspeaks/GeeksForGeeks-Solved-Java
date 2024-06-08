
/*Complete the function below*/
class Solution {
    public int findExtra(int n, int arr1[], int arr2[]) {
        Map<Integer,Integer> map = new HashMap<>();
        
        for (int num : arr2) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find the extra element in arr1
        for (int i = 0; i < arr1.length; i++) {
            if (!map.containsKey(arr1[i])) {
                return i; // Return the index of the extra element
            }
        }
        
        return -1;
    }


}