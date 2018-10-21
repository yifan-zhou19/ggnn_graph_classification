package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int row;
		int col;
		int[][] a = new int[100][100];
		int i;
		int k;
		void shun(int a[][100],int x,int y);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < row;i++)
		{
			for (k = 0;k < col;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][k] = Integer.parseInt(tempVar3);
				}
			}
		}
		shun(a, row, col);
	}
	public static void shun(int[][] a, int x, int y)
	{
		int b = 0;
		int c;
		int d = 0;
		int e = 0;
		int sum;
		int n = 0;
		sum = x * y;
		while (n <= sum)
		{
			for (c = b;c < y;c++)
			{
				System.out.printf("%d\n",a[b][c]);
				n = n + 1;
				if (n == sum)
				{
					break;
				}
			}
			b = b + 1;
			if (n == sum)
			{
				break;
			}

			for (c = b;c < x;c++)
			{
				System.out.printf("%d\n",a[c][y - 1]);
				n = n + 1;
				if (n == sum)
				{
					break;
				}
			}
			y = y - 1;
			if (n == sum)
			{
				break;
			}
			for (c = y - 1;c >= d;c--)
			{
				System.out.printf("%d\n",a[x - 1][c]);
				n = n + 1;
				if (n == sum)
				{
					break;
				}
			}
			x = x - 1;
			d = d + 1;
			if (n == sum)
			{
				break;
			}
			for (c = x - 1;c >= b;c--)
			{
				System.out.printf("%d\n",a[c][e]);
				n = n + 1;
				if (n == sum)
				{
					break;
				}
			}
			e = e+1;
			if (n == sum)
			{
				break;
			}
		}
	}
}

