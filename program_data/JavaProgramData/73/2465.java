package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[5][5];
	public static int[] x = new int[5];
	public static int[] y = new int[5];
	public static int Main()
	{
		int xx;
		int yy;
		int tmp;
		for (int i = 0;i < 5;i++)
		{
			for (int j = 0;j < 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 0;i < 5;i++)
		{
			tmp = a[i][0];
			x[i] = 0;
			for (int j = 1;j < 5;j++)
			{
				if (a[i][j] > a[i][x[i]])
				{
					x[i] = j;
				}
			}
		}
		for (int j = 0;j < 5;j++)
		{
			tmp = a[0][j];
			y[j] = 0;
			for (int i = 1;i < 5;i++)
			{
				if (a[i][j] < a[y[j]][j])
				{
					y[j] = i;
				}
			}
		}
		for (int i = 0;i < 5;i++)
		{
			if (i == y[x[i]])
			{
				System.out.printf("%d %d %d\n",i + 1,x[i] + 1,a[i][x[i]]);
				return 0;
			}
		}
		System.out.print("not found\n");
		return 0;
	}

}

