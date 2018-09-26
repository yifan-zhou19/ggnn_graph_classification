package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i; //m????????n???????//
		int j;
		int h;
		int[][] a = new int[8][8];
		int m;
		int n;
		int x;
		int p;
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
			x = 0;
			for (j = 0;j < n;j++)
			{
				if (a[i][j] > x)
				{
					x = a[i][j];
					p = j;
				}
			}
			for (h = 0;h < m;h++)
			{
				if (a[h][p] < x)
				{
					break;
				}
			}
			if (h == m)
			{
				System.out.printf("%d+%d\n",i,p);
				break;
			}
		}
		if (i == m)
		{
			System.out.print("No\n");
		}
	}
}

