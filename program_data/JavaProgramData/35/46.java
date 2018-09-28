package <missing>;

public class GlobalMembers
{
	public static void find(int[][] a, int m, int n)
	{
		int i;
		int j;
		int b;
		int k;
		int s;
		int[] min = new int[8];
		for (i = 0;i < m;i++)
		{
			k = 0;
			for (j = 1;j < n;j++)
			{
				if (a[i][k] < a[i][j])
				{
					k = j;
				}
			}
			min[i] = k;
		}
		for (j = 0;j < n;j++)
		{
			b = 0;
			for (k = 0;k < m;k++)
			{
				if (min[k] == j)
				{
					s = k;
					b = 1;
					for (i = 0;i < m;i++)
					{
						if (a[i][j] < a[s][min[s]])
						{
							b = 0;
							break;
						}
					}
					if (b != 0)
					{
						System.out.printf("%d+%d",s,min[s]);
						break;
					}
				}
				if (b != 0)
				{
					break;
				}
			}
			if (b != 0)
			{
				break;
			}
		}
		if (b == 0)
		{
			System.out.print("No");
		}
	}

	public static void Main()
	{
		int[][] a = new int[8][8];
		int m;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		find(a, m, n);
	}
}

