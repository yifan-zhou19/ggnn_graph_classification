package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[8][8];
		int[][] b = new int[8][8];
		int m;
		int n;
		int i;
		int j;
		int k;
		int c = 0;
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
			b[i][j] = 1;
		}
		}
		for (i = 0;i < m;i++)
		{
		for (j = 0;j < n;j++)
		{
			for (k = 0;k < n;k++)
			{
				if (a[i][k] > a[i][j])
				{
				b[i][j] = 0;
				}
			}
			for (k = 0;k < m;k++)
			{
				if (a[k][j] < a[i][j])
				{
				b[i][j] = 0;
				}
			}
		}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
			if (b[i][j] == 1)
			{
				System.out.printf("%d+%d",i,j);
				c = 1;
			}
			}
		}
		if (c == 0)
		{
		System.out.print("No\n");
		}
	}

}

