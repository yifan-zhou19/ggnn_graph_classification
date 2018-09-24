package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[200][200];
	public static int[][] f = new int[200][200];
	public static int n;
	public static int m;
	public static int i;
	public static int j;
	public static int flag;
	public static int si;
	public static int sj;
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		while (true)
		{
			flag = 0;
			for (i = 1;i <= m;i++)
			{
				if (f[1][i] == 0)
				{
					flag = 1;
					f[1][i] = 1;
					break;
				}
			}
			if (flag == 0)
			{
			for (i = 1;i <= n;i++)
			{
				if (f[i][m] == 0)
				{
					flag = 2;
					f[i][m] = 1;
					break;
				}
			}
			}
			if (flag == 1)
			{
				si = 1;
				sj = i;
			}
			if (flag == 2)
			{
				si = i;
				sj = m;
			}
			if (flag == 0)
			{
				return 0;
			}
			for (;si <= n != 0 && sj >= 1;si++, sj--)
			{
				System.out.printf("%d\n",a[si][sj]);
			}
		}
		return 0;
	}

}

