package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final int x = 9;
		int i;
		int j;
		int k;
		int m;
		int n;
		int fx;
		int fy;
	int[][] a = new int[9][9];
	int[][] b = new int[9][9];


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
		memset(a, 0, (Integer.SIZE / Byte.SIZE));
		a[x / 2][x / 2] = m;

		for (k = 0; k < n; k++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b, 0, (Integer.SIZE / Byte.SIZE));
			for (i = 1; i < x - 1; i++)
			{
				for (j = 1; j < x - 1; j++)
				{
					b[i][j] += a[i][j];
					for (fx = -1; fx <= 1; fx++)
					{
						for (fy = -1; fy <= 1; fy++)
						{
							b[i + fx][j + fy] += a[i][j];
						}
					}
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
			memcpy(a, b, (Integer.SIZE / Byte.SIZE));
		}

		for (i = 0; i < x; i++)
		{
			for (j = 0; j < x - 1; j++)
			{
				System.out.printf("%d ", a[i][j]);
			}
			System.out.printf("%d\n", a[i][x - 1]);
		}

		return 0;
	}

}

