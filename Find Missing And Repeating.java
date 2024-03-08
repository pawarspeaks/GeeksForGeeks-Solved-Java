class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
    int xor=0;
        for(int i=1;i<=n;i++){
            xor^=i;
        }
        for(int i=0;i<n;i++){
            xor^=arr[i];
        }
        
        int diff=0;
        for(int i=0;i<32;i++){
            if(((xor>>i)&1)==1){
                diff=i;
                break;
            }
        }
        // System.out.print(diff);
        int a=0;
        int b=0;
        for(int i=1;i<=n;i++){
            if(((i>>diff)&1)==0){
                a^=i;
            }else{
                b^=i;
            }
        }
        for(int i=0;i<n;i++){
            if(((arr[i]>>diff)&1)==0){
                a^=arr[i];
            }else{
                b^=arr[i];
            }
        }
        
        boolean isA=false;
        for(int i=0;i<n;i++){
            if(a==arr[i]){
                isA=true;
                break;
            }
        }
        int[] ans=new int[2];
        if(isA){
            ans[0]=a;
            ans[1]=b;
        }else{
            ans[0]=b;
            ans[1]=a;
        }
        // System.out.print(a+" "+b);
        
        return ans;
        
    }
}