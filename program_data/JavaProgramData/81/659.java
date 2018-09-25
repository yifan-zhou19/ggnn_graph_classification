package <missing>;

public class GlobalMembers
{
	public static int juzhen(int m, int n)
	{
		int i;
		int j;
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
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
			int e;
			for (i = 0;i < 5;i++)
			{
				e = sz[m][i];
				sz[m][i] = sz[n][i];
				sz[n][i] = e;
			}
			return 1;
		}
	}
	public static int[][] sz = new int[5][5];
	public static int Main()
	{

		int i;
		int j;
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			y = Integer.parseInt(tempVar3);
		}
		a = juzhen(x, y);
		if (a == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
			  System.out.printf("%d %d %d %d %d\n",sz[i][0],sz[i][1],sz[i][2],sz[i][3],sz[i][4]);
			}
		}
	return 0;
	}

}

