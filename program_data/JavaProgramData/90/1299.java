package <missing>;

public class GlobalMembers
{
	public static int sep(int m,int n)
	{
		int c;
		if (n == 1 || m == 0)
		{
			c = 1;
		}
		else if (m < n)
		{
			c = sep(m, m);
		}
		else
		{
			c = sep(m, n - 1) + sep(m - n, n);
		}
		return c;
	}
	public static int Main()
	{
		int[][] a = new int[20][2];
		int t;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			for (j = 0;j < 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < t;i++)
		{
			System.out.printf("%d\n",sep(a[i][0], a[i][1]));
		}
	}

}

