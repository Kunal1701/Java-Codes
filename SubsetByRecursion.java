public class SubsetByRecursion {
    public static void subset(String s,String a,int i){

        if(i==s.length()){
            if(a.length()==0)
            System.out.println("Empty Set");//for empty set
            else
            System.out.println(a);
            return;
        }
        subset(s,a+s.charAt(i),i+1);//yes choice
        subset(s, a, i+1);//no choice
        
    }
    public static void main(String []args){
        String s = "abc";
        String a="";
        subset(s,a,0);
    }
}
