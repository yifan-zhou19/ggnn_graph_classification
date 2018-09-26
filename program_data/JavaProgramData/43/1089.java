package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int k;
		int n;
		int a;
		int b;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= m / 2;i++)
		{
			a = 0;
			b = 0;
		n = Math.sqrt(i) + 1;
		x = Math.sqrt(m - i) + 1;
		for (k = 2;k <= n != 0 && k != i;k++)
		{
			if (i % k == 0)
			{
		a = a - 1;
			}
		}
		for (k = 2;k <= x != 0 && k != (m - i);k++)
		{
			if ((m - i) % k == 0)
			{
		b = b - 1;
			}
		}
		if (a == 0 && b == 0)
		{
			System.out.printf("%d %d\n",i,m - i);
		}
		}
		return 0;
	}


}

