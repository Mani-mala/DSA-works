public class SummaLinearSearchPannen {
    public static void main(String[] args) {
        int[] arr={3,7,1,9,2,12,67,23,89,10};
        int k=39;
        boolean check=false;
        for(int i=0;i<arr.length;i++)
        {
            if(search(arr[i],k))
            {
                System.out.println(k+" is in the index of "+ i+" in an array");
                check=true;
            }
        }
        if(!check)
            System.out.println("Element not found in an array so index = -1 ");
    }
    public static boolean search(int num,int k)
    {
        if(num==k)
            return true;
        
        return false;
    }
}
