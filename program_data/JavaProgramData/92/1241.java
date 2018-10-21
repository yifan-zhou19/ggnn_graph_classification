package <missing>;

public class GlobalMembers
{
	public static int[][] c = new int[1010][1010];

	public static int maximum(int x, int y)
	{
		if (x > y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}

	public static int cmp(Object x, Object y)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * a = (int *)x;
		int a = (int)x;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * b = (int *)y;
		int b = (int)y;
		if (a > b)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

	public static int Main()
	{
		int n;
		int[] a = new int[1010];
		int[] b = new int[1010];
		int i;
		int j;
		int k;
		int max;
		int val;

		for (i = 0; i < 1010; i++)
		{
			for (j = 0; j < 1010; j++)
			{
				c[i][j] = -100000;
			}
		}
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
				break;
			}
			for (i = 0; i < n; i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0; i < n; i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[i] = Integer.parseInt(tempVar3);
				}
			}
			qsort(a, n, (Integer.SIZE / Byte.SIZE), cmp);
			qsort(b, n, (Integer.SIZE / Byte.SIZE), cmp);
			j = 0;
			for (i = 0; i < n; i++)
			{
				for (j = 0; j <= i; j++)
				{
					c[i][j] = -10000;
					if (j == 0)
					{
						if (a[i] > b[j])
						{
							c[i][j] = 1;
						}
						else if (a[i] == b[j])
						{
							c[i][j] = 0;
						}
					}
					else
					{
						if (a[i] < b[j])
						{
							c[i][j] = c[i - 1][j];
						}
						if (a[i] == b[j])
						{
							c[i][j] = maximum(c[i - 1][j - 1], c[i - 1][j]);
						}
						if (a[i] > b[j])
						{
							c[i][j] = c[i - 1][j - 1] + 1;
						}
					}
				}
			}
			max = -100000;
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					if (max < c[i][j] - (n - j - 1))
					{
						max = c[i][j] - (n - j - 1);
					}
				}
			}
			if (max <= -5000)
			{
				max = -n;
			}
			System.out.printf("%d\n", max * 200);
		}
	}
}

