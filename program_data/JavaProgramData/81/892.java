package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int t = new int(int x,int y);
		int a;
		int b;
		int i;
		int j;
		int d;
		int[][] c = new int[6][5];
		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j <= 4;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					c[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		d = t(a, b);
		if (d == 1)
		{
			for (i = 0;i <= 4;i++)
			{
				c[5][i] = c[a][i];
				c[a][i] = c[b][i];
				c[b][i] = c[5][i];
			}
			for (i = 0;i <= 4;i++)
			{
				System.out.printf("%d",c[i][0]);
				for (j = 1;j <= 4;j++)
				{
					System.out.printf(" %d",c[i][j]);
				}
				System.out.print("\n");
			}
		}
		else
		{
			System.out.print("error\n");
		}
	}
	public static int t(int x,int y)
	{
		if (x <= 4 && x >= 0 && y <= 4 && y >= 0)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
}

