package <missing>;

public class GlobalMembers
{
	// lp.cpp : Defines the entry point for the console application.
	//
	// ??????.cpp : Defines the entry point for the console application.
	//

	public static int[][] a = new int[10][10];
	public static int[][] b = new int[10][10];
	public static int n;
	public static int m;
	public static void f(int[][] a)
	{
		int i;
		int j;
		while (n > 0)
		{
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				b[i - 1][j - 1] += a[i][j];
				b[i][j - 1] += a[i][j];
				b[i + 1][j - 1] += a[i][j];
				b[i - 1][j] += a[i][j];
				b[i][j] += a[i][j] * 2;
				b[i + 1][j] += a[i][j];
				b[i - 1][j + 1] += a[i][j];
				b[i][j + 1] += a[i][j];
				b[i + 1][j + 1] += a[i][j];
			}
		}
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				a[i][j] = b[i][j];
				b[i][j] = 0;
			}
		}
		n--;
		}
	}
	public static int Main()
	{
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,100);
		a[4][4] = m;
		f(a);
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				if (j < 8)
				{
					System.out.print(a[i][j]);
					System.out.print(' ');
				}
				else
				{
					System.out.print(a[i][j]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

