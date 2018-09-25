package <missing>;

public class GlobalMembers
{
	public static void sub(int[] a, int n)
	{
		int i;
		int min = a[0];
		for (i = 1;i < n;i++)
		{
			if (min > a[i])
			{
				min = a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			a[i] -= min;
		}
	}
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int count;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
			int[][] a = new int[M][M];
			int[] temp = new int[M];
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
			for (count = 0;count < n - 1;count++)
			{
				for (i = count;i < n;i++)
				{
					for (j = count;j < n;j++)
					{
						temp[j - count] = a[i][j];
					}
					sub(temp, n - count);
					for (j = count;j < n;j++)
					{
						a[i][j] = temp[j - count];
					}
				}
				for (j = count;j < n;j++)
				{
					for (i = count;i < n;i++)
					{
						temp[i - count] = a[i][j];
					}
					sub(temp, n - count);
					for (i = count;i < n;i++)
					{
						a[i][j] = temp[i - count];
					}
				}
				sum += a[count + 1][count + 1];
				for (i = 0;i < n;i++)
				{
					a[i][count + 1] = a[i][count];
				}
				for (j = 0;j < n;j++)
				{
					a[count + 1][j] = a[count][j];
				}
			}
			System.out.printf("%d\n",sum);
		}
		return 0;
	}

}

