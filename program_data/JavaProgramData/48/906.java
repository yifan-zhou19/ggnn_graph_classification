package <missing>;

public class GlobalMembers
{
	public static int[][] bac0 = new int[10][10];
	public static int[][] bac1 = new int[10][10];
	public static int m;
	public static int n;
	public static void init1()
	{
		for (int i = 1;i < 10;i++)
		{
			for (int j = 1;j < 10;j++)
			{
				bac0[i][j] = 0;
			}
		}
		bac0[5][5] = m;
		return;
	}
	public static void init2()
	{
		for (int i = 1;i < 10;i++)
		{
			for (int j = 1;j < 10;j++)
			{
				bac1[i][j] = 0;
			}
		}
		return;
	}
	public static void born(int a,int b)
	{
		bac1[a][b] += (bac0[a][b] * 2);
		if (a - 1 >= 1)
		{
			bac1[a - 1][b] += bac0[a][b];
			if (b - 1 >= 1)
			{
				bac1[a - 1][b - 1] += bac0[a][b];
			}
			if (b + 1 <= 9)
			{
				bac1[a - 1][b + 1] += bac0[a][b];
			}
		}
		if (a + 1 <= 9)
		{
			bac1[a + 1][b] += bac0[a][b];
			if (b - 1 >= 1)
			{
				bac1[a + 1][b - 1] += bac0[a][b];
			}
			if (b + 1 <= 9)
			{
				bac1[a + 1][b + 1] += bac0[a][b];
			}
		}
		if (b - 1 >= 1)
		{
			bac1[a][b - 1] += bac0[a][b];
		}
		if (b + 1 <= 9)
		{
			bac1[a][b + 1] += bac0[a][b];
		}
		return;
	}
	public static void update()
	{
		for (int i = 1;i <= 9;i++)
		{
			for (int j = 1;j <= 9;j++)
			{
				bac0[i][j] = bac1[i][j];
			}
		}
		return;
	}
	public static void day()
	{
		init2();
		for (int i = 1;i < 10;i++)
		{
			for (int j = 1;j < 10;j++)
			{
				if (bac0[i][j] != 0)
				{
					born(i, j);
				}
			}
		}
		update();
		return;
	}
	public static void Print()
	{
		for (int i = 1;i <= 9;i++)
		{
			System.out.print(bac0[i][1]);
			for (int j = 2;j <= 9;j++)
			{
				System.out.print(" ");
				System.out.print(bac0[i][j]);
			}
			System.out.print("\n");
		}
		return;
	}
	public static int Main()
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		init1();
		for (int i = 0;i < n;i++)
		{
			day();
		}
		Print();
		return 0;
	}

}

