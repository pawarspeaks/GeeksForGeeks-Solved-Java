/*Complete the function below*/

class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       //add code here.
         int low = 0, high = n - 1;
       while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if the mid element is a peak element
            if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid])) {
                return mid;
            }

            // If the element to the left of mid is greater, move left
            if (mid > 0 && arr[mid - 1] > arr[mid]) {
                high = mid - 1;
            } else { // Otherwise, move right
                low = mid + 1;
            }
        }

        return -1; // No peak element found
    }
}