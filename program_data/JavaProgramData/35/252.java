package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int j;
		int[][] n = new int[8][8];
		int[][] c = new int[8][8];
		int[][] d = new int[8][8];
		int e;
		int f;
		int g = 0;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < 8;i++)
		{
			for (j = 0;j < 8;j++)
			{
				c[i][j] = 0;
				d[i][j] = 0;
			}
		}
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < b;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					n[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < a;i++)
		{
			e = 0;
			for (j = 0;j < b;j++)
			{
				if (e < n[i][j])
				{
					e = n[i][j];
				}
			}
			for (j = 0;j < b;j++)
			{
				if (e == n[i][j])
				{
					c[i][j] = 1;
				}
			}
		}
		for (j = 0;j < b;j++)
		{
			f = 1000;
			for (i = 0;i < a;i++)
			{
				if (f > n[i][j])
				{
					f = n[i][j];
				}
			}
			for (i = 0;i < a;i++)
			{
				if (f == n[i][j])
				{
					d[i][j] = 1;
				}
			}
		}
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < b;j++)
			{
				if (c[i][j] == 1 && d[i][j] == 1)
				{
					g = n[i][j];
					p = i;
					q = j;
				}
			}
		}
		if (g != 0)
		{
			System.out.printf("%d+%d",p,q);
		}
		else
		{
			System.out.print("No");
		}
		return 0;
	}
}

