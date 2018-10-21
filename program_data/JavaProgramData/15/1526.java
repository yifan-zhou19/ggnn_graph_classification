package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[1000][1000];
		int n;
		int i;
		int j;
		int c;
		int d;
		int e;
		int f;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
				if (a[i][j] == 0)
				{
					c = i;
					d = j;
				}
			}
		}
		for (i = n;i >= 1;i--)
		{
			for (j = n;j >= 1;j--)
			{
				if (a[i][j] == 0)
				{
					e = i;
					f = j;
				}
			}
		}
		s = (c - e-1) * (f - d - 1);
		System.out.printf("%d",(c - e-1) * (d - f - 1));
		return 0;
	}


}

