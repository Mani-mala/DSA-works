package biweekly_test;
public class CroakOgFrogs {
	public static void main(String[] args) {
		String input="croakcrook";
		System.out.println("Input string : "+input);
		System.out.println("output : "+crockOfFrogs(input));
	}
	public static int crockOfFrogs(String input)
	{
		int[] freq=new int[26];
		for(int i=0;i<input.length();i++)
		{
			freq[input.charAt(i)-'a']++;
		}
		int c=freq['c'-'a'];
		int r=freq['r'-'a'];
		int o=freq['o'-'a'];
		int a=freq['a'-'a'];
		int k=freq['k'-'a'];
		if(input.equals("croak"))
		{
			return 1;
		}
		int op=c;
		if(c!=r || c!=o || c!=a || c!=k || r!=o || r!=a || r!=k || o!=a || o!=k || a!=k)
			return -1;
		else
		{
			for(int i=0;i<input.length();i+=5)
			{
				if(i!=0 && input.substring(i,5+i).equals("croak"))
				{
					op--;
				}
			}
		}
			return op;
	}

}
