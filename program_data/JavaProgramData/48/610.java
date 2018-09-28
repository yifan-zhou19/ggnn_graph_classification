package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int i;
	public static int j;
	public static int[][] xijun = new int[11][11];
	public static int kuosan(int i, int j, int n)
	{
		if (i == 5 && j == 5 && n == 0)
		{
			return m;
		}
		if (i == 5 && j == 5 && n < 0)
		{
			return 0;
		}
		if (!(i == 5 && j == 5) && n <= 0)
		{
			return 0;
		}
		else
		{
			return (kuosan(i, j, n - 1) * 2 + kuosan(i - 1, j - 1, n - 1) + kuosan(i - 1, j, n - 1) + kuosan(i, j - 1, n - 1) + kuosan(i + 1, j, n - 1) + kuosan(i + 1, j + 1, n - 1) + kuosan(i, j + 1, n - 1) + kuosan(i + 1, j - 1, n - 1) + kuosan(i - 1, j + 1, n - 1));
		}
	}
	public static int Main()
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= 9; i++)
		{
			for (j = 1; j <= 9; j++)
			{
			   xijun[i][j] = kuosan(i, j, n);
			   if (j == 1)
			   {
				   System.out.print(xijun[i][j]);
			   }
			   if (j >= 2 && j <= 9)
			   {
				   System.out.print(' ');
				   System.out.print(xijun[i][j]);
			   }
			}
			if (j == 10)
			{
				System.out.print("\n");
			}
		}
		return 0;
	}
}

