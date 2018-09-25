package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int n;
		int[][] a = new int[100][100];
		int min;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (l = 0;l < n;l++)
		{
			sum = 0;
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
			while (k > 1)
			{
			for (i = 0;i < k;i++)
			{
			min = 100000;
			for (j = 0;j < k;j++)
			{
			if (a[i][j] < min)
			{
				min = a[i][j];
			}
			}
			for (j = 0;j < k;j++)
			{
			a[i][j] -= min;
			}
			}
			for (j = 0;j < n;j++)
			{
			min = 100000;
			for (i = 0;i < k;i++)
			{
			if (a[i][j] < min)
			{
				min = a[i][j];
			}
			}
			if (min == 0)
			{
				continue;
			}
			else
			{
				for (i = 0;i < k;i++)
				{
			a[i][j] -= min;
				}
			}
			}
			sum += a[1][1];
			for (i = 1;i < k - 1;i++)
			{
			a[i][0] = a[i + 1][0];
			}
			for (j = 1;j < k - 1;j++)
			{
			a[0][j] = a[0][j + 1];
			}
			for (i = 1;i < k - 1;i++)
			{
			for (j = 1;j < k - 1;j++)
			{
			a[i][j] = a[i + 1][j + 1];
			}
			}
			k--;
			}
			System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

