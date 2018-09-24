package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int t = 0;
		int[] a = new int[300];
		int s = 0;
		int i;
		char c;
		for (i = 1;i < 300;i++)
		{
			a[i] = 0;
		}
		while ((c = System.in.read()) != '\n')
		{
			if (c != ' ')
			{
				if (t == 0)
				{
				  s++;
				}
				  t = 1;
				  a[s]++;
			}
			if (c == ' ')
			{
				t = 0;
			}
		}
		System.out.printf("%d",a[1]);
		if (s > 1)
		{
		   for (i = 2;i <= s;i++)
		   {
			 System.out.printf(",%d",a[i]);
		   }
		}
	}


}
