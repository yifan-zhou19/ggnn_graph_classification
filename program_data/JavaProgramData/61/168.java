package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i = 1;
		int p;
		int a = 1;
		int b = 1;
		int[] c = new int[20];
		int sum;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (p = 0;p <= m - 1;p++)
		{
			c[p] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		p = 0;
		for (p = 0;p <= m - 1;p++)
		{
			a = 1;
			b = 1;
			for (i = 1;i <= c[p] - 2;i++)
			{
			  sum = a + b;
			  a = b;
			  b = sum;
			}
		  System.out.print(b);
		  System.out.print("\n");
		}
		return 0;
	}


}

