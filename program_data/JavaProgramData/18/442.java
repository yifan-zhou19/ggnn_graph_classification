package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[][] a = new int[100][100];
		int[] b = new int[100];
		int[] c = new int[100];
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
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
			int sum = n;
			int l = 0;
			while (sum > 1)
			{
			for (i = 0;i < sum;i++)
			{
				b[i] = a[i][0];
				for (j = 0;j < sum;j++)
				{
					if (a[i][j] < b[i])
					{
						b[i] = a[i][j];
					}
				}
				for (j = 0;j < sum;j++)
				{
					a[i][j] = a[i][j] - b[i];
				}
			}
			for (j = 0;j < sum;j++)
			{
				c[j] = a[0][j];
				for (i = 0;i < sum;i++)
				{
					if (a[i][j] < c[j])
					{
						c[j] = a[i][j];
					}
				}
				for (i = 0;i < sum;i++)
				{
					a[i][j] = a[i][j] - c[j];
				}
			}
			l = l + a[1][1];
			for (i = 0;i < sum;i++)
			{
				for (j = 1;j < sum - 1;j++)
				{
					a[i][j] = a[i][j + 1];
				}
			}
			for (j = 0;j < sum;j++)
			{
				for (i = 1;i < sum - 1;i++)
				{
					a[i][j] = a[i + 1][j];
				}
			}
			sum--;
			}
			System.out.printf("%d\n",l);
		}
	}
}

