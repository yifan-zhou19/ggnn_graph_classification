package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[10][10];
		int k;
		int i;
		int j;
		int[][] c = new int[10][10];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		a[5][5] = m;
		for (k = 1;k <= n;k++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(c,0,(Integer.SIZE / Byte.SIZE));
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					c[i][j] += a[i][j];
					c[i - 1][j] += a[i][j];
					c[i + 1][j] += a[i][j];
					c[i][j - 1] += a[i][j];
					c[i][j + 1] += a[i][j];
					c[i - 1][j - 1] += a[i][j];
					c[i - 1][j + 1] += a[i][j];
					c[i + 1][j - 1] += a[i][j];
					c[i + 1][j + 1] += a[i][j];
				}
			}
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					a[i][j] += c[i][j];
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
					System.out.print(" ");
				}
				if ((i != 9) && (j == 9))
				{
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

