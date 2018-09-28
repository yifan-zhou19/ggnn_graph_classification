package <missing>;

public class GlobalMembers
{
	public static int g(int[][] a, int m, int j)
	{
		int min = a[0][j];
		int i;
		int y;
		for (i = 0;i < m;i++)
		{
			if (a[i][j] <= min)
			{
					min = a[i][j];
					y = i;
			}
		}
		return y;
	}



	public static int f(int[][] a, int n, int i)
	{
		int j;
		int max = a[i][0];
		int x;


			for (j = 0;j < n;j++)
			{
				if (a[i][j] >= max)
				{
					max = a[i][j];
					x = j;
				}
			}
			return x;
	}




	public static int Main()
	{

		int[][] a = new int[8][8];
		int row;
		int col;
		int i;
		int j;
		int k;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}

		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < row;i++)
		{
			k = f(a, col, i);
			p = g(a, row, k);
			if (p == i)
			{
				System.out.printf("%d+%d\n",p,k);
				i = row + 1;
			}
		}
		if (i == row)
		{
			System.out.print("No\n");
		}

		return 0;
	}



}

