

public class astrickgraph {
    public static void main(String[] args) {
        int arr[] = {0,1,2,7};
        int max = -1;
        for(int i=0;i<arr.length;i++)
        max = Math.max(max, arr[i]);
        char matrix[][]  =new char[max][arr.length];
        int idx = matrix.length-1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==0){
                for(int j = 0;j<max;j++){
                    matrix[idx][i]=' ';
                    idx--;
                }
            }
            else{
            for(int j = 0;j<arr[i];j++){
                matrix[idx][i]='*';
                idx--;
            }
        }
            idx = matrix.length-1;
        
        }
        for(int i=0;i<matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
