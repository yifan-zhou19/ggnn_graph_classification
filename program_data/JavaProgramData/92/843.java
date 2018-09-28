package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] a = new int[1010];
	public static int[] b = new int[1010];
	public static int[][] l = new int[1010][1010];

	public static int cmp(Object elem1, Object elem2)
	{
		return *((int)elem2) - (int)elem1;
	}


	public static int Main()
	{
		int i;
		int j;

		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
				return 0;
			}
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					b[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i] = Integer.parseInt(tempVar3);
				}
			}


			qsort(a,n,(Integer.SIZE / Byte.SIZE),cmp);
			qsort(b,n,(Integer.SIZE / Byte.SIZE),cmp);
			for (i = 0;i < n;i++)
			{
				if (a[i] < b[0])
				{
					l[i][0] = 1;
				}
				else
				{
					if (a[i] == b[0])
					{
						l[i][0] = 0;
					}
					else
					{
						l[i][0] = -1;
					}
				}
			}
			for (i = n - 2;i >= 0;i--)
			{
				for (j = 1;j < n - i;j++)
				{
					if (a[i + j] < b[j])
					{
						l[i][j] = l[i][j - 1] + 1;
					}
					else
					{
						if (a[i + j] > b[j])
						{
							l[i][j] = l[i + 1][j - 1] - 1;
						}
						else
						{
							if (l[i + 1][j - 1] - 1 > l[i][j - 1])
							{
								l[i][j] = l[i + 1][j - 1] - 1;
							}
							else
							{
								l[i][j] = l[i][j - 1];
							}
						}
					}
				}
			}
			System.out.printf("%d\n",200 * l[0][n - 1]);
		}
	}

}

