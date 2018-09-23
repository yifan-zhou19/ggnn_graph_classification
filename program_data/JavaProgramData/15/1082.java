package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[1000][1000];
		int n;
		int i;
		int k;
		int x;
		int y;
		int z;
		int w;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			for (k = 0;k < n;k++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][k] = Integer.parseInt(tempVar2);
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			for (k = 1;k < n;k++)
			{
				if (a[i][k - 1] != 0 && a[i][k] == 0 && a[i][k + 1] == 0 && a[i + 1][k] == 0)
				{
					x = i;
					y = k;
				}
			}
		}

		for (i = 1;i < n;i++)
		{
			for (k = 1;k < n - 1;k++)
			{
				if (a[i][k - 1] == 0 && a[i][k] == 0 && a[i][k + 1] != 0 && a[i - 1][k] == 0)
				{
					z = i;
					w = k;
				}
			}
		}

		s = (z - 1 - x) * (w - 1 - y);
		System.out.printf("%d",s);

		return 0;
	}

}

