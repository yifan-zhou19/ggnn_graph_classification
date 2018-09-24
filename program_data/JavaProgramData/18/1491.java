package <missing>;

public class GlobalMembers
{
	public static int minline(int n, int u, int[][] a)
	{
		int temp = a[0][u];
		for (int i = 1;i < n;i++)
		{
			if (temp > a[i][u])
			{
				temp = a[i][u];
			}
		}
		return temp;
	}
	public static int mincross(int n, int[] a)
	{
		int temp = a[0];
		for (int i = 0;i < n;i++)
		{
			if (temp > a[i])
			{
				temp = a[i];
			}
		}
		return temp;
	}

	public static int ans(int n, int[][] pp)
	{

			int sum = 0;

			for (int y = 0;y < n - 1;y++)
			{
					for (int i = 0;i < n - y;i++)
					{
						int minTemp = mincross(n - y, pp[i]);
						for (int j = 0;j < n - y;j++)
						{
						pp[i][j] = pp[i][j] - minTemp;
						}
					}
					for (int i = 0;i < n - y;i++)
					{
						int minTemp = minline(n - y, i, pp);
						for (int j = 0;j < n - y;j++)
						{
						pp[j][i] = pp[j][i] - minTemp;
						}
					}
					sum = sum + pp[1][1];

					for (int i = 0;i < n - y;i++)
					{
						for (int j = 1;j < n - 1 - y;j++)
						{
							pp[i][j] = pp[i][j + 1];
						}
					}

					for (int i = 0;i < n - 1 - y;i++)
					{
						for (int j = 1;j < n - y - 1;j++)
						{
							pp[j][i] = pp[j + 1][i];
						}
					}

			}
		return sum;
	}

	public static int Main()
	{
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] pp;
		pp = new int[n];
		for (int i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			pp[i] = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
		}



		for (int w = 0;w < n;w++)
		{
				for (int i = 0;i < n;i++)
				{
					for (int j = 0;j < n;j++)
					{
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							pp[i][j] = Integer.parseInt(tempVar2);
						}
					}
				}
			System.out.printf("%d\n", ans(n, pp));
		}

		for (int i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(pp[i]);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(pp);

		return 0;
	}

}

