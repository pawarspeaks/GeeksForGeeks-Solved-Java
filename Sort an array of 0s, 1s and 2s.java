
//User function template for Java
class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
          int  current = 0 , next0 = 0 , next2 = n-1;
        while(current <= next2){
            if(a[current] == 0){
                swap(a, current, next0);
                current++;
                next0++;
            } else if(a[current] == 2){
                swap(a,current,next2);
                next2--;
            } else {
                current++;      
            } 
        }
    }

    static void swap(int a[] , int i , int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
