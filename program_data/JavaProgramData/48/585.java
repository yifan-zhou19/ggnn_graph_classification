package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int k;
		int[][] a = new int[9][9];
		int[][] b = new int[9][9];

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,9 * 9 * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,9 * 9 * (Integer.SIZE / Byte.SIZE));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[4][4] = m;
		b[4][4] = m;
		for (k = 0;k <= n;k++)
		{
			for (i = 4 - k;i < 4 + k;i++)
			{
				for (j = 4 - k;j < 4 + k;j++)
				{
					b[i - 1][j - 1] += a[i][j];
					b[i - 1][j] += a[i][j];
					b[i - 1][j + 1] += a[i][j];
					b[i][j - 1] += a[i][j];
					b[i][j + 1] += a[i][j];
					b[i + 1][j - 1] += a[i][j];
					b[i + 1][j] += a[i][j];
					b[i + 1][j + 1] += a[i][j];
					b[i][j] += a[i][j];
				}
			}

			for (i = 0;i < 9;i++)
			{
				for (j = 0;j < 9;j++)
				{
					a[i][j] = b[i][j];
				}
			}
		}

		for (i = 0;i < 9;i++) //????
		{
			for (j = 0;j < 9;j++)
			{
				if (i < 8)
				{
					if (j < 8)
					{
						System.out.print(a[i][j]);
						System.out.print(" ");
					}
					else
					{
						System.out.print(a[i][j]);
						System.out.print("\n");
					}
				}
				else
				{
					if (j < 8)
					{
						System.out.print(a[i][j]);
						System.out.print(" ");
					}
					else
					{
						System.out.print(a[i][j]);
					}
				}
			}
		}
		return 0;
	}

}

