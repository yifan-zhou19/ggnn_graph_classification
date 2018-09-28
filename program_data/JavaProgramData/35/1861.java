package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[9][9];
		int i;
		int j;
		int m;
		int n;
		int y = 0;
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
			int max = a[i][0];
			int t = 0;
			int x = 1;
			for (j = 1;j < n;j++)
			{
				if (a[i][j] > max)
				{
				max = a[i][j];
				t = j;
				}
			}
			for (j = 0;j < m;j++)
			{
				if (j != i && max > a[j][t])
				{
					x = 0;
					break;
				}
			}
			if (x != 0)
			{
				System.out.printf("%d+%d",i,t);
				y = 1;
				break;
			}
		}
		if (y == 0)
		{
			System.out.print("No");
		}
	}
}

