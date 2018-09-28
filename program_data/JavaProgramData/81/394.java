package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int ch = new int(int a[5][5],int n,int m);
		int[][] b = new int[5][5];
		int x;
		int y;
		int i;
		int j;
		int t;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					b[i][j] = Integer.parseInt(tempVar);
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
		if (ch(b, x, y) != 0)
		{
			for (j = 0;j < 5;j++)
			{
			  t = b[x][j];
			  b[x][j] = b[y][j];
			  b[y][j] = t;
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",b[i][j]);
				}
				System.out.printf("%d\n",b[i][4]);
			}
		}
		else
		{
			System.out.print("error");
		}

	}
	public static int ch(int[][] a, int n, int m)
	{
		if (n >= 0 && n <= 4 && m >= 0 && m <= 4)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}


}

