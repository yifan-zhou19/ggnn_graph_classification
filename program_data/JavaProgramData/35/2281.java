package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[8][8];
		int i;
		int j;
		int k;
		int g;
		int x;
		int y;
		int z = 0;
		int m;
		int n;
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
				   x = 0;
				   y = 0;
					for (k = 0;k < n;k++)
					{
						if (a[i][j] >= a[i][k])
						{
						x = x + 1;
						}
					}
					for (g = 0;g < m;g++)
					{
						if (a[i][j] <= a[g][j])
						{
						y = y + 1;
						}
					}
					if (x == n && y == m)
					{
					System.out.printf("%d+%d",i,j);
					z = 1;
					}
			   }
			}
			if (z == 0)
			{
			System.out.print("No");
			}
			return 0;
	}
}

