import java.util.Arrays;
public class RecursionForBinarySearch {
    public static void main(String[] args)
    {
        int[] arr={3,7,1,9,2,12,67,23,89,10};
        int k=5;
        System.out.print("Array after sorting : [");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            if(i==arr.length-1)            
                System.out.print(arr[i]); 
            else
                System.out.print(arr[i]+", ");
        }
        System.out.print("]");
        System.out.println("The element "+k+" found at the index : "+binarySearch(arr,k,0));
    }
    public static int binarySearch(int[] arr,int k,int index)
    {
        if(arr[index]>k)
            return -index-1;
        if(arr[index]==k)
            return index;
       
        return binarySearch(arr,k,index+1);
    }
}
