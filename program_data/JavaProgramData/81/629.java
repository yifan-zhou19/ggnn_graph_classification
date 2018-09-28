package <missing>;

public class GlobalMembers
{
	public static int h(int m,int n)
	{
		int g;
		if (m <= 4 && m >= 0 && n >= 0 && n <= 4)
		{
			g = 1;
		}
		else
		{
			g = 0;
		}
		return g;
	}
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int e;
		int x;
		int y;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
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
		if (h(x, y) != 0)
		{
			for (j = 0;j < 5;j++)
			{
				e = a[x][j];
				a[x][j] = a[y][j];
				a[y][j] = e;
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",a[i][j]);
				}
				System.out.printf("%d\n",a[i][4]);
			}
		}
			else
			{
				System.out.print("error");
			}
			return 0;
	}


}

