package <missing>;

public class GlobalMembers
{
	public static int[][] b =
	{
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
	};
	public static int[][] a =
	{
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
	};
	public static int n = 0;
	public static void f(int t)
	{
		if (t == n + 1)
		{
			for (int i = 1; i <= 9; i++)
			{
				for (int k = 1; k <= 8; k++)
				{
					System.out.print(a[i][k]);
					System.out.print(" ");
				}
				System.out.print(a[i][9]);
				System.out.print("\n");
			}
		}
		else
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b, 0, (Integer.SIZE / Byte.SIZE));
			for (int j = 1; j <= 9; j++)
			{
				for (int k = 1; k <= 9; k++)
				{
					if (a[j][k] != 0)
					{
						for (int p = j - 1; p <= j + 1; p++)
						{
							for (int q = k - 1; q <= k + 1; q++)
							{
								b[p][q] += a[j][k];
							}
						}
						b[j][k] += a[j][k];
					}
				}
			}
			for (int j = 1; j <= 9; j++)
			{
				for (int k = 1; k <= 9; k++)
				{
					a[j][k] = b[j][k];
				}
			}
			f(t + 1);
		}
	}
	public static int Main()
	{

		int m = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[5][5] = m;
			f(1);
		return 0;
	}
}

