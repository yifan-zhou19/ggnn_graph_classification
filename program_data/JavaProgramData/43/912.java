package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = int n;
		int m;
		int a = 3;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		while (a <= (m / 2))
		{
			if (f(a) == 1)
			{
				b = m - a;
				if (f(b) == 1)
				{
					System.out.printf("%d %d\n",a,b);
				}
			}
			a = a + 2;
		}
	}
	public static int f(int n)
	{
		int j;
		j = 2;
		for (j = 2;n % j != 0;j++)
		{
			;
		}
		return (j > n / 2?1:0);
	}


}

