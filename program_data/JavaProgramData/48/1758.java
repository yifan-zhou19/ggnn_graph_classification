package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int[][] a = new int[11][11];
		int[][] b = new int[11][11];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[5][5] = m;
		while (n-- != 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b,0,(Integer.SIZE / Byte.SIZE));
			for (i = 1;i <= 9;i++)
			{
				for (j = 0;j <= 9;j++)
				{
					k = a[i][j];
					b[i][j] += (2 * k);
					b[i - 1][j] += k;
					b[i - 1][j - 1] += k;
					b[i - 1][j + 1] += k;
					b[i][j - 1] += k;
					b[i][j + 1] += k;
					b[i + 1][j] += k;
					b[i + 1][j - 1] += k;
					b[i + 1][j + 1] += k;
					a[i][j] = 0;
				}
			}
				for (i = 1;i <= 9;i++)
				{
					for (j = 1;j <= 9;j++)
					{
						a[i][j] = b[i][j];
					}
				}
		}
		for (i = 1;i <= 9;i++)
		{
			for (j = 1;j <= 9;j++)
			{
				System.out.print(a[i][j]);
				if (j != 9)
				{
					System.out.print(' ');
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

