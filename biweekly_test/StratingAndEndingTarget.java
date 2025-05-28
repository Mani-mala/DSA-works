package biweekly_test;
import java.util.Arrays;
public class StratingAndEndingTarget {
	public static void main(String[] args)
	{
		int[] nums= {5,7,7,8,8,10};
		System.out.println("Input array : "+Arrays.toString(nums));
		int target=8;
		System.out.println("Target : "+target);
		int[] output= {-1,-1};
		for(int i=0;i<nums.length;i++)
		{
			if(output[0] == -1 &&nums[i]==target)
			{
				output[0]=i;
				output[1]=i;
			}
			if(output[0] != -1 &&nums[i]==target)
			{
				output[1]=i;
			}
		}
		System.out.println("Output index array : "+Arrays.toString(output));
	}
}
