public class PermutationsUsingRecursion {
    public static void FindPermutation(String s,String ans){
        //base case
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion work
        for(int i = 0;i<s.length();i++){
            char curr = s.charAt(i);
            String a = s.substring(0,i)+s.substring(i+1);//to remove Ith index character from string
            FindPermutation(a, ans+curr);
        }
    }

    public static void main(String []args){
        String s = "abc";
        FindPermutation(s,"");//function call
    }
}
