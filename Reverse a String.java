class Reverse
{
    // Complete the function
    // str: input string
    public static void find(char[]arr,int i,int j){
        while(i < j){
            arr[i] ^= arr[j];
            arr[j] ^= arr[i];
            arr[i] ^= arr[j];
            i++;
            j--;
        }
    }
    public static String reverseWord(String str)
    {
        // Reverse the string str
        char arr[] = new char[str.length()];
        for(int i = 0; i < str.length() ; i++){
            arr[i] = str.charAt(i);
        }
        find(arr,0,arr.length-1);
        String ans = "";
        for(int i = 0; i < arr.length ; i++)ans += arr[i];
        return ans;
    }
}
