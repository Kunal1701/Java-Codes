public class FibonacciByRecursion {
    public static int FbNum(int n){
        if(n<=1)//base case
        return n;
        return FbNum(n-1)+FbNum(n-2);
    }
    public static void main(String []args){
        int res=FbNum(8);//function call
        System.out.println(res);
    }
}
