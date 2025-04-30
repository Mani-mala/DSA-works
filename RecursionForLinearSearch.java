public class RecursionForLinearSearch {
    public static void main(String[] args) {
        int[] arr={3,7,1,9,2,12,67,23,89,10};
        int k=9;
        System.out.println("The element "+k+" found at the index : "+linearSearch(arr,k,0));
    }
    public static int linearSearch(int[] arr,int k,int index)
    {
        if(index>=arr.length)
            return -1;
        if(arr[index]==k)
            return index;
       
        return linearSearch(arr,k,index+1);
    }
}
