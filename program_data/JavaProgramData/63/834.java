package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[105][105];
	public static int[][] b = new int[105][105];
	public static int[][] c = new int[105][105];
	public static int x1;
	public static int y1;
	public static int x2;
	public static int y2;
	public static void init()
	{
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < x1;i++)
		{
			for (int j = 0;j < y1;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < x2;i++)
		{
			for (int j = 0;j < y2;j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
	}
	public static void calc()
	{
		for (int i = 0;i < x1;i++)
		{
			for (int j = 0;j < y2;j++)
			{
				c[i][j] = 0;
				for (int k = 0;k < y1;k++)
				{
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
	}
	public static void print()
	{
		for (int i = 0;i < x1;i++)
		{
			for (int j = 0;j < y2;j++)
			{
				if (j != 0)
				{
					System.out.print(" ");
				}
				System.out.print(c[i][j]);
			}
			System.out.print("\n");
		}
	}

	public static int Main()
	{
		init();
		calc();
		print();
		//cin>>x1;
		return 0;
	}

}

