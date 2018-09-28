package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] z = new int[100][100];
		int m;
		int n;
		int a;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (a = 0;a <= m - 1;a++)
		{
			for (b = 0;b <= n - 1;b++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					z[a][b] = Integer.parseInt(tempVar3);
				}
			}
		}
		a = 0;
		b = 0;
		for (c = 0;c <= m * n - 1;c++)
		{
			System.out.printf("%d\n",z[a][b]);
			a++;
			b--;
			if ((a > m - 1) || (b < 0))
			{
				while ((a > 0) && (b < n - 1))
				{
					a--;
					b++;
				}
				if ((a == 0) && (b < n - 1))
				{
					b++;
				}
				else
				{
					a++;
				}
			}
		}
		return 0;
	}
}

