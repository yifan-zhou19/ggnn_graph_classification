package <missing>;

public class GlobalMembers
{
	public static int f(int x,int y)
	{
		int z;
		if ((x >= 0 && x <= 4) && (y >= 0 && y <= 4))
		{
			z = 1;
		}
		else
		{
			z = 0;
		}
		return z;
	}
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int m;
		int n;
		int w;
		int[] b = {0, 1, 2, 3, 4};
		int t;
		int l;
		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j <= 4;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		w = f(n, m);
		if (w == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i <= 4;i++)
			{
				if (b[i] == n)
				{
					for (j = 0;j <= 4;j++)
					{
						if (b[j] == m)
						{
							t = m;
							b[j] = n;
							b[i] = t;
							l = 100;
							break;
						}
					}
				}
				if (l == 100)
				{
					break;
				}
			}
			for (i = 0;i <= 4;i++)
			{
				System.out.printf("%d",a[b[i]][0]);
				for (j = 1;j <= 4;j++)
				{
					System.out.printf(" %d",a[b[i]][j]);
				}
				System.out.print("\n");
			}
		}
		return 0;
	}
}

