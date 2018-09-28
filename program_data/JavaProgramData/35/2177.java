package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] a = new int[10][10];
		int[] max = new int[10];
		int[] po = new int[10];
		int x;
		int y;
		int ex = 0;
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
				if (a[i][j] > max[i])
				{
					max[i] = a[i][j];
					po[i] = j;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < m;j++)
			{
				if (max[i] > a[j][po[i]])
				{
					break;
				}
				if (j == m - 1)
				{
					ex = 1;
					x = i;
					y = po[i];
				}
			}
			if (ex == 1)
			{
				break;
			}
			ex = 0;
		}
		if (ex == 1)
		{
			System.out.printf("%d+%d\n",x,y);
		}
		else
		{
			System.out.print("No\n");
		}
		return 0;
	}
}

