package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int p = int x;
		int n;
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;2 * i <= n;i++)
		{
			for (m = 3;m <= i;m++)
			{
				if (p(m) == 1 && p(2 * i - m) == 1)
				{
					System.out.printf("%ld=%ld+%ld\n",2 * i,m,2 * i - m);
					break;
				}
			}
		}
	}
	public static int p(int x)
	{
		int i;
		int c = 1;
		for (i = 2;i <= Math.sqrt(x);i++)
		{
			if (x % i == 0)
			{
				c = 0;
				break;
			}
		}
		return (c);
	}

}

