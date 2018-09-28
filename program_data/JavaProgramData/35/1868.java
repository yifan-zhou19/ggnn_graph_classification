package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int max;
		int re;
		int x = 0;
		int[][] a = new int[9][9];
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
			max = a[i][0];
			re = 0;
			for (j = 1;j < n;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					re = j;
				}
			}
			for (j = 0;j < m;j++)
			{
				if (a[j][re] < max)
				{
					break;
				}
			}
			if (j == m)
			{
				System.out.printf("%d+%d\n",i,re);
				x = 1;
				break;
			}
		}
		if (x == 0)
		{
			System.out.print("No\n");
		}
	}

}

