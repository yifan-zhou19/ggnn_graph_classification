package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] num = new int[8][8];
		int i;
		int j;
		int max;
		int min;
		int l;
		int h = 0;
		int u;
		int y;
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
					num[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			max = num[i][0];
			l = 0;
			for (j = 1;j < n;j++)
			{
				if (num[i][j] > max)
				{
					max = num[i][j];
					l = j;
				}
			}
			y = 0;
			for (u = 0;u < m;u++)
			{
				min = max;
				if (num[u][l] < min)
				{
					y++;
				}
			}
			if (y == 0)
			{
				System.out.printf("%d+%d",i,l);
			}
			else
			{
				h++;
			}
		}
		if (h == m)
		{
			System.out.print("No");
		}
		return 0;
	}
}

