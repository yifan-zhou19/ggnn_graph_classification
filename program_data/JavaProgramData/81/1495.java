package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		if (m <= 4 && n <= 4)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void Main()
	{
		int x;
		int y;
		int i;
		int j;
		int[][] a = new int[5][5];
		int c;
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			y = Integer.parseInt(tempVar3);
		}
		if (f(x, y) == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				c = a[x][i];
				a[x][i] = a[y][i];
				a[y][i] = c;
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					if (j == 0)
					{
						System.out.printf("%d",a[i][j]);
					}
					else
					{
						System.out.printf(" %d",a[i][j]);
					}
				}
				System.out.print("\n");
			}
		}
	}



}

