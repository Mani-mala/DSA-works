package sorting;
import java.util.Arrays;
import java.util.Scanner;
public class HeapSort {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	//System.out.println("Enter array size");
	//int n=sc.nextInt();
	System.out.println("Enter array elements");
	//int[] arr=new int[n];
	int[] arr= {89,23,12,67,547,34,18};
	int n=arr.length;
//	for(int i=0;i<n;i++)
//	{
//		arr[i]=sc.nextInt();
//	}
	sc.close();
	System.out.println("Array elements : "+Arrays.toString(arr));
	HeapSort hs=new HeapSort();
	hs.heapsort(arr,n);
	System.out.println("After heap sort : "+Arrays.toString(arr));
	}

void heapsort(int[] arr,int n)
{
	for(int i=n/2 -1;i>=0;i--)
	{
		heapify(arr,n,i);
		System.out.println("In 1st for loop : "+Arrays.toString(arr));
	}
	System.out.println("After 1st for loop : "+Arrays.toString(arr));
	for(int i=n-1;i>=0;i--)
	{
		int temp=arr[0];
		arr[0]=arr[i];
		arr[i]=temp;
		heapify(arr,i,0);
		System.out.println("in 2nd for loop : "+Arrays.toString(arr));
	}
	System.out.println("After 2nd for loop : "+Arrays.toString(arr));
}
void heapify(int[] arr,int n, int i)
{
	int largest=i;
	int left=2*i+1;
	int right=2*i+2;
	if(left<n && arr[left]>arr[largest])
	{
		largest=left;
	}
	if(right<n && arr[right]>arr[largest])
	{
		largest=right;
	}
	if(largest !=i)
	{
		int temp=arr[i];
		arr[i]=arr[largest];
		arr[largest]=temp;
		heapify(arr,n,largest);
	}
	//System.out.println("After heap sort : "+Arrays.toString(arr));
}

}
