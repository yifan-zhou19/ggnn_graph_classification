package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int[][] a = new int[9][9];
		int[][] b = new int[9][9];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[4][4] = m;
		while (n-- != 0)
		{
			for (i = 0;i < 9;i++)
			{
				for (j = 0;j < 9;j++)
				{
					if (a[i][j] != 0)
					{
						b[i][j] += 2 * a[i][j];
						b[i - 1][j] += a[i][j];
						b[i + 1][j] += a[i][j];
						b[i][j - 1] += a[i][j];
						b[i][j + 1] += a[i][j];
						b[i - 1][j - 1] += a[i][j];
						b[i - 1][j + 1] += a[i][j];
						b[i + 1][j - 1] += a[i][j];
						b[i + 1][j + 1] += a[i][j];
					}
				}
			}
			for (i = 0;i < 9;i++)
			{
				for (j = 0;j < 9;j++)
				{
					a[i][j] = b[i][j];
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(b,0,(Integer.SIZE / Byte.SIZE));
		}
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 8;j++)
			{
				System.out.print(a[i][j]);
				System.out.print(' ');
			}
			System.out.print(a[i][8]);
			System.out.print("\n");
		}
		return 0;
	}


}

