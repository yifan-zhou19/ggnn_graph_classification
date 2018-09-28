package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int n;
		int i;
		int j;
		int k;
		int e;
		int o = 0;
		int l = 0;
		int u;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
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
		for (k = 1;k <= n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (a[i][0] > a[i + 1][0])
				{
					for (j = 0;j < 2;j++)
					{
					e = a[i + 1][j];
				   a[i + 1][j] = a[i][j];
				   a[i][j] = e;
					}
				}
			}
		}



	for (i = 1;i < n;i++)
	{
		for (u = 0;u < i;u++)
		{
		if (a[i][0] > a[u][1])
		{
			o++;
		}

		}
	if (o == i)
	{
		l++;
	}
	o = 0;
	}
	for (k = 1;k <= n;k++)
	{
			for (i = 0;i < n - k;i++)
			{
				if (a[i][1] > a[i + 1][1])
				{

					e = a[i + 1][1];
				   a[i + 1][1] = a[i][1];
				   a[i][1] = e;
				}
			}
	}



	if (l == 0)
	{
		System.out.printf("%d %d",a[0][0],a[n - 1][1]);
	}
	else
	{
		System.out.print("no");
	}
	return 0;
	}
}

