package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[6][6];
		int i;
		int j;
		int min;
		int max;
		int k;
		int m;
		int n;
		int x;
		int y;
		int flag = 0;
		for (i = 1; i < 6; i++)
		{
			for (j = 1; j < 6; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (k = 1; k < 6; k++)
		{
			max = 0;
			for (m = 1; m < 6; m++)
			{
				if (max < a[k][m])
				{
					max = a[k][m];
					x = m;
				}
			}
			min = 100000;
			for (n = 1; n < 6; n++)
			{
				if (min >= a[n][x])
				{
					min = a[n][x];
					y = n;
				}
			}
			if (k == y)
			{
				flag = 1;
				System.out.print(y);
				System.out.print(' ');
				System.out.print(x);
				System.out.print(' ');
				System.out.print(a[y][x]);
				System.out.print("\n");
			}
		}
		if (flag == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}
}

