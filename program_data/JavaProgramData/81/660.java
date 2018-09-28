package <missing>;

public class GlobalMembers
{
	public static int[][] sz = new int[5][5];
	public static int i;
	public static int j;
	public static int e;
	public static int h(int m, int n)
	{
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		if (m < 0 || m>4 || n < 0 || n>4)
		{
			return 0;
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				e = sz[m][i];
				sz[m][i] = sz[n][i];
				sz[n][i] = e;
			}
			return 1;
		}
	}
	public static int Main()
	{
		int x;
		int y;
		int a;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[i][j] = Integer.parseInt(tempVar);
				}
			}

		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			y = Integer.parseInt(tempVar3);
		}
		a = h(x, y);
		if (a == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
				   System.out.printf("%d ",sz[i][j]);
				}
				System.out.printf("%d\n",sz[i][4]);
			}
		}
	return 0;
	}



















}

