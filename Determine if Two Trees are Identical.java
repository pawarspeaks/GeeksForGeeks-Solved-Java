class Solution
{
    //Function to check if two trees are identical.
	boolean isIdentical(Node root1, Node root2)
	{
	    // Code Here
	     if(root1==root2 && root2==null){
            return true;
        }
        
        else if(root1==null || root2==null){
            return false;
        }
        
        else{
               boolean l= isIdentical(root1.left,root2.left);
           boolean r= isIdentical(root1.right,root2.right);
           
        if(root1.data==root2.data && l==true && r==true){
            return true;
        }
        else{
            return false;
        }
          }
	}
	
}
