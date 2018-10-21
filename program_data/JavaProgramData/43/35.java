package <missing>;

public class GlobalMembers
{
	public static int panduan(int n)
	{
		int i;
		int a;
		int k = 1;
		a = n / 2 + 1;
		for (i = 2;i < a;i++)
		{
			if (n % i == 0)
			{
				k = 0;
			}
		}
		return k;
	}

	public static void Main()
	{
		int i;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		i = 3;
		while (i < m / 2 + 1)
		{
			if (panduan(i) == 1 && panduan(m - i) == 1)
			{
				System.out.printf("%d %d\n",i,m - i);
			}
			i += 2;
		}
	}
}

