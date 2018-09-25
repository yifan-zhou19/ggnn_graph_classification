package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[1000][1000];
		int i;
		int n;
		int j;
		int b;
		int c;
		int d;
		int e;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == 0)
				{
					b = i;
					c = j;
					j = n;
					i = n;
				}
			}

		}
		for (i = n - 1;i >= 0;i--)
		{
			for (j = n - 1;j >= 0;j--)
			{
				if (a[i][j] == 0)
				{
					d = i;
					e = j;
					i = -1;
					j = -1;
				}
			}
		}
		x = (d - b + 1) * (e - c + 1) - 2 * (d - b + 1) - 2 * (e - c + 1) + 4;
		System.out.printf("%d",x);
		return 0;
	}


}

