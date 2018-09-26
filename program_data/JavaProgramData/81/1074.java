package <missing>;

public class GlobalMembers
{
	public static int f(int[][][] p, int m, int n)
	{
		if (m >= 0 && m <= 4 && n >= 0 && n <= 4)
		{
			int[] b = new int[5];
			int j;
			for (j = 0;j <= 4;j++)
			{
				b[j] = p[m][j];
				p[m][j] = p[n][j];
				p[n][j] = b[j];
			}
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void Main()
	{
		int[][] a = new int[5][5];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p[5][5];
		int[][] p = new int[5][5];
		int x;
		int y;
		for (x = 0;x <= 4;x++)
		{
			for (y = 0;y <= 4;y++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[x][y] = Integer.parseInt(tempVar);
				}
				p[x][y] = a[x][y];
			}
		}
		int m;
		int n;
		int re;
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
		re = f(p, m, n);
		if (re == 0)
		{
			System.out.print("error\n");
		}
		else
		{
			for (x = 0;x <= 4;x++)
			{
				for (y = 0;y <= 3;y++)
				{
					System.out.printf("%d ",p[x][y]);
				}
				System.out.printf("%d\n",p[x][y]);
			}
		}
	}


}

