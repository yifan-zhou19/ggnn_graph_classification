package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void shuru(int,int);
		int row;
		int col;
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
		shuru(row - 1, col - 1);
	}
	public static void shuru(int x,int y)
	{
		void huixing(int p[100],int,int,int);
		int i;
		int j;
		int k;
		int t;
		int[][] a = new int[100][100];
		int[] p = new int[100];
		p = a;
		for (i = 0;i <= x;i++)
		{
			for (j = 0;j <= y;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		if (x < y)
		{
			t = x;
		}
		else
		{
			t = y;
		}
		for (k = 0;k <= t / 2;k++)
		{
			huixing(p, k, x, y);
		}
	}
	public static void huixing(int[] p, int g, int h, int l)
	{
		int i;
		int sum = 0;
		for (i = 0;i <= l - 2 * g;i++)
		{
			if (sum < (h - 2 * g + 1) * (l - 2 * g + 1))
			{
				System.out.printf("%d\n",*(p[g] + g + i));
				sum = sum + 1;
			}
		}
		for (i = 1;i <= h - 2 * g;i++)
		{
			if (sum < (h - 2 * g + 1) * (l - 2 * g + 1))
			{
				System.out.printf("%d\n",*(p[g + i] + l - g));
				sum = sum + 1;
			}
		}
		for (i = 1;i <= l - 2 * g;i++)
		{
			if (sum < (h - 2 * g + 1) * (l - 2 * g + 1))
			{
				System.out.printf("%d\n",*(p[h - g] + l - g - i));
				sum = sum + 1;
			}
		}
		for (i = 1;i < h - 2 * g;i++)
		{
			if (sum < (h - 2 * g + 1) * (l - 2 * g + 1))
			{
				System.out.printf("%d\n",*(p[h - g - i] + g));
				sum = sum + 1;
			}
		}
	}
}

