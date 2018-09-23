package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m = 0;
		int min;
		int sum = 0;
		int i;
		int j;
		int k;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] a = new int[n];
		for (k = 0;k < n;k++)
		{
			for (i = 0;i < n;i++)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
				a[i] = (int)calloc(n,(Integer.SIZE / Byte.SIZE));
				for (j = 0;j < n;j++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[i][j] = Integer.parseInt(tempVar2);
					}
					if (a[i][j] > m)
					{
					m = a[i][j];
					}
				}
			}
			min = m;
			for (q = 0;q < n - 1;q++)
			{
			for (i = 0;i < n - q;i++)
			{
				for (j = 0;j < n - q;j++)
				{
					if (a[i][j] < min)
					{
					min = a[i][j];
					}
				}
				for (j = 0;j < n - q;j++)
				{
					a[i][j] = a[i][j] - min;
				}
				min = m;
			}
			for (j = 0;j < n - q;j++)
			{
				for (i = 0;i < n - q;i++)
				{
					if (a[i][j] < min)
					{
					min = a[i][j];
					}
				}
				for (i = 0;i < n - q;i++)
				{
					a[i][j] = a[i][j] - min;
				}
				min = m;
			}
			sum = a[1][1] + sum;
			for (i = 0;i < n - q;i++)
			{
				for (j = 1;j < n - q - 1;j++)
				{
					a[i][j] = a[i][j + 1];
				}
			}
			for (i = 1;i < n - q - 1;i++)
			{
				for (j = 0;j < n - q;j++)
				{
				a[i][j] = a[i + 1][j];
				}
			}
			}
			System.out.printf("%d\n",sum);
			sum = 0;

		}

	}


}

