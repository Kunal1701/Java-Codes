public class SearchInRotateArray{
    public static int search(int arr[],int target,int si,int ei){
        if(si>ei)
        return -1;
        int mid  = (si+ei)/2;
        if(arr[mid]==target)
        return mid;
        if(arr[mid]>=arr[si]){
                if(target>=arr[si] && target<arr[mid])
                return search(arr, target, si, mid-1);
                else
                return search(arr, target, mid+1, ei);
        }
        else{
            if(target<=arr[ei]&&target>arr[mid])
            return search(arr, target, mid+1, ei);
            else
            return search(arr, target, si, mid-1);
        }
    }
    public static void main(String[] args){
        int arr[] = {4,5,6,7,0,1,2,3};
        int trgt = 0;
        int index = search(arr,trgt,0,arr.length-1);
        System.out.println(index);
    }

}