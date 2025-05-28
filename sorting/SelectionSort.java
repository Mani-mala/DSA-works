package sorting;
import java.util.Arrays;
public class SelectionSort {
	public static void main(String[] args) {
		int[] arr= {89,23,12,67,547,34,18};
		int n=arr.length;
		System.out.println("Array elements : "+Arrays.toString(arr));
		for(int i=0;i<n-1;i++)
		{
			int idx=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[idx])
				{
					idx=j;
				}
			}
			int temp=arr[idx];
			arr[idx]=arr[i];
			arr[i]=temp;
			System.out.println("Array during sorting: "+Arrays.toString(arr));
		}
		System.out.println("Ascending order: "+Arrays.toString(arr));
		//descending
		for(int i=0;i<n-1;i++)
		{
			int idx=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]>arr[idx])
				{
					idx=j;
				}
			}
			int temp=arr[idx];
			arr[idx]=arr[i];
			arr[i]=temp;
		}
		System.out.println("Descending order : "+Arrays.toString(arr));
	}

}
