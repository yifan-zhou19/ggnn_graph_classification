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
		int[] p = new int[8];
		int[] q = new int[8];
		int r = 0;
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
					(a[i][j]) = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			p[i] = 0;
			for (j = 0;j < n;j++)
			{
				if (a[i][j] > a[i][p[i]])
				{
					p[i] = j;
				}
			}
		}
		for (j = 0;j < n;j++)
		{
			q[j] = 0;
			for (i = 0;i < m;i++)
			{
				if (a[i][j] < a[q[j]][j])
				{
					q[j] = i;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (p[i] == j && q[j] == i)
				{
					System.out.printf("%d+%d",i,j);
					r = 1;
					break;
				}
			}
		}
		if (r == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

