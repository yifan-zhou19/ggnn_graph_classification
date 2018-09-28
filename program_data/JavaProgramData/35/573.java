package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int[][] a = new int[8][8];
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
		int count = 0;
		int p = 0;
		int k;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] > a[i][p])
				{
					p = j;
				}
			}
			for (k = 0;k < m;k++)
			{
				if (a[i][p] <= a[k][p])
				{
					count++;
				}
			}
			if (count == m)
			{
				break;
			}
			count = 0;
		}
		if (count == m)
		{
			System.out.printf("%d+%d",i,p);
		}
		if (count != m)
		{
			System.out.print("No");
		}
		return 0;
	}
}

