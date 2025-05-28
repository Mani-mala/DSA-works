package sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr= {89,23,12,67,547,34,18};
		int n=arr.length;
		System.out.println("Array elements : "+Arrays.toString(arr));
		for(int i=0;i<n;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				//System.out.println("Array in while : "+Arrays.toString(arr)+ " j :"+j+" i : "+i);
				j--;
			}
			arr[j+1]=key;
		}
		System.out.println("Ascending order: "+Arrays.toString(arr));
		for(int i=0;i<n;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]<key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		System.out.println("Descending order: "+Arrays.toString(arr));
	}

}
