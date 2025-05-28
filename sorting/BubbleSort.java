package sorting;
import java.util.Arrays;
//import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter array size");
//		int n=sc.nextInt();
//		System.out.println("Enter array elements");
//		int[] arr=new int[n];
		int[] arr= {89,23,12,67,547,34,18};
		int n=arr.length;
//		for(int i=0;i<n;i++)
//		{
//			arr[i]=sc.nextInt();
//		}
		//sc.close();
		System.out.println("Array elements : "+Arrays.toString(arr));
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Array elements : "+Arrays.toString(arr));
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Array elements : "+Arrays.toString(arr));
	}

}
