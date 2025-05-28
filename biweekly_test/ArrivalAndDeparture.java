package biweekly_test;

import java.util.Arrays;

public class ArrivalAndDeparture {
	public static void main(String[] args)
	{
//		int[] arr= {900, 940, 950, 1100, 1500, 1800};
//		int[] dep= {910, 1200, 1120, 1130, 1900, 2000};
		int[] arr= {900,900,900};
		int[] dep= {1000,1000,1000};
		System.out.println("Train arrival time : "+Arrays.toString(arr));
		System.out.println("Train departure time : "+Arrays.toString(dep));
		int min=0;
		int platform=0;
		for(int i=0;i<dep.length;i++)
		{
			min=0;
			for(int j=i;j<arr.length;j++)
			{
				if(dep[i]>arr[j])
					min++;
			}
			if(platform<min)
			{
				platform=min;
			}
		}
		System.out.println("Minimum platform needed : "+platform);
	}
}
