package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[][] height = new int[40][40];
	public static double[][] average = new double[40][40];

	public static int Main()
	{
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(average,0,(Double.SIZE / Byte.SIZE));

		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					height[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				int count = 0;
				int sum = 0;
				if (i > 0)
				{
					sum += height[i - 1][j];
					count++;
				}
				if (i < m - 1)
				{
					sum += height[i + 1][j];
					count++;
				}
				if (j > 0)
				{
					sum += height[i][j - 1];
					count++;
				}
				if (j < n - 1)
				{
					sum += height[i][j + 1];
					count++;
				}
				average[i][j] = (double) sum / count;
			}
		}

		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				double maxh;
				maxh = height[i][j];
				if (i > 0 && height[i - 1][j] > maxh)
				{
					maxh = height[i - 1][j];
				}
				if (i < m - 1 && height[i + 1][j] > maxh)
				{
					maxh = height[i + 1][j];
				}
				if (j > 0 && height[i][j - 1] > maxh)
				{
					maxh = height[i][j - 1];
				}
				if (j < n - 1 && height[i][j + 1] > maxh)
				{
					maxh = height[i][j + 1];
				}
				if (Math.abs(maxh - (double)height[i][j]) < 0.000001)
				{
					System.out.printf("%d %d\n",i,j);
				}
			}
		}

		return 0;
	}

}

