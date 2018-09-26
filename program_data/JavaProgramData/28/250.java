package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int word = 0;
		int sum = 0;
		int i;
		int j;
		int[] a = new int[301];
		char c;
	   for (i = 0;(c = System.in.read()) != '\n';i++)
	   {
		if (c == ' ')
		{
			word = 0;
		}
		 else
		 {
		   if (word == 0)
		   {
			   word = 1;
			   sum = sum + 1;
			   j = sum;
		   }
			a[j] = a[j] + 1;
		 }
	   }
		System.out.printf("%d",a[1]);
		if (sum >= 2)
		{
		 for (i = 2;i <= sum;i++)
		 {
		System.out.printf(",%d",a[i]);
		 }
		}
	}


}
