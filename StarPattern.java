public class StarPattern {
    public static void main(String[] args) {
        int arr[]={-5,1,2,6,-6,0};
        int mini= Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
            mini = Math.min(mini,arr[i]);
        if(mini<0)
            mini=-mini;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                for(int j=arr[i];j<=0;j++)
                    System.out.print("*");
            }
            else{
                for(int j = 0;j<mini;j++)
                    System.out.print(" ");
                for(int j=0;j<=arr[i];j++)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
