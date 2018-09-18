package <missing>;

public class GlobalMembers
{
	public static void f1(int[][] a, int k)
	{
		int i;
		int j;
		int min;
		for (j = 0;j < k;j++)
		{
			min = a[j][0];
			for (i = 1;i < k;i++)
			{
				if (a[j][i] < min)
				{
					min = a[j][i];
				}
			}
			for (i = 0;i < k;i++)
			{
				a[j][i] = a[j][i] - min;
			}
		}
		for (i = 0;i < k;i++)
		{
			min = a[0][i];
			for (j = 0;j < k;j++)
			{
				if (a[j][i] < min)
				{
					min = a[j][i];
				}
			}
			for (j = 0;j < k;j++)
			{
				a[j][i] -= min;
			}
		}
	}
	public static void f2(int[][] a, int k)
	{
		int i;
		int j;
		for (i = 0;i < k;i++)
		{
			for (j = 1;j < k - 1;j++)
			{
				a[i][j] = a[i][j + 1];
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = 1;j < k - 1;j++)
			{
				a[j][i] = a[j + 1][i];
			}
		}
	}
	public static int Main()
	{
		int n;
		int z;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k = n;
		for (z = 0;z < n;z++)
		{
			int i;
			int j;
			int sum = 0;
			int[][] a = new int[100][100];
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
			k = n;
			for (k;k > 1;k--)
			{
				f1(a, k);
				sum += a[1][1];
				f2(a, k);
			}
			System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

