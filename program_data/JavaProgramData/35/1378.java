package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int[][] a = new int[8][8];
		int[] b = new int[8];
		int[] c = new int[8];
		int flag = 0;
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
			b[i] = 0;
			for (j = 0;j < n - 1;j++)
			{
				if (a[i][b[i]] < a[i][j + 1])
				{
					b[i] = j + 1;
				}
			}
		}
		for (j = 0;j < n;j++)
		{
			c[j] = 0;
			for (i = 0;i < m - 1;i++)
			{
				if (a[c[j]][j] > a[i + 1][j])
				{
					c[j] = i + 1;
				}
			}
		}
		for (k = 0;k < m;k++)
		{
			if (c[b[k]] == k)
			{
				System.out.printf("%d+%d",k,b[k]);
			flag = 1;
			}
		}
		if (flag == 0)
		{
		System.out.print("No");
		}
		return 0;
	}


}

