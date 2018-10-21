package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[8][8];
		int row = new int(int x[8][8],int y,int i,int j,int m,int n);
		int m;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (row(a, a[i][j], i, j, m, n) == 1)
				{
					System.out.printf("%d+%d\n",i,j);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto l1;
				}
			}
		}
		System.out.print("No\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	l1:
	;
	}


	public static int row(int[][] x, int y, int i, int j, int m, int n)
	{
		int p;
		int max = x[i][0];
		int min = x[0][j];
		for (p = 0;p < n - 1;p++)
		{
			if (x[i][p + 1] > x[i][p])
			{
				max = x[i][p + 1];
			}
		}
		if (y == max)
		{
			for (p = 0;p < m - 1;p++)
			{
				if (x[p + 1][j] < x[p][j])
				{
					min = x[p + 1][j];
				}
			}
			if (y == min)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		else
		{
			return 0;
		}
	}


}

