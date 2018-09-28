package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[8][8];
		int i;
		int j;
		int p = 0;
		int k;
		int c = 0;
		int x;
		int y;
		int q = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(", ");
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
			c = 0;
			for (j = 0;j < n;j++)
			{
				if (a[i][j] > p)
				{
					p = a[i][j];
					x = i;
					y = j;
				}
			}
			for (k = 0;k < m;k++)
			{
				if (a[k][y] > p)
				{
					c++;
					if (c == m - 1)
					{
						q = 0;
						System.out.printf("%d+%d",x,y);
					}
				}
			}
		}
		if (q == 1)
		{
			System.out.print("No");
		}
		return 0;
	}

}

