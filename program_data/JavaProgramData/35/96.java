package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[8][8];
		int i;
		int j;
		int k;
		int m;
		int n;
		int[] max = new int[8];
		int p = 12;
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
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (max[i] < a[i][j])
				{
					max[i] = a[i][j];
				}
			}
		}


		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == max[i])
				{
					for (k = 0;k <= m;k++)
					{
						if (k < m && a[i][j]> a[k][j])
						{
						break;
						}
						if (k == m)
						{
							System.out.printf("%d+%d",i,j);
							p = i;
						}
					}
				}
			}
		}
		if (p == 12)
		{
			System.out.print("No");
		}
	}
}

