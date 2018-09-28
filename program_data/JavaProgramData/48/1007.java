package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int m;
		int[][] a = new int[11][11];
		int[][] b = new int[11][11];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Integer.SIZE / Byte.SIZE));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[5][5] = m;
		for (k = 1;k <= n;k++)
		{
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					b[i][j] = a[i][j];
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Integer.SIZE / Byte.SIZE));
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					if (b[i][j] != 0)
					{
						a[i][j] += 2 * b[i][j];
						a[i - 1][j] += b[i][j];
						a[i + 1][j] += b[i][j];
						a[i][j - 1] += b[i][j];
						a[i][j + 1] += b[i][j];
						a[i - 1][j + 1] += b[i][j];
						a[i - 1][j - 1] += b[i][j];
						a[i + 1][j + 1] += b[i][j];
						a[i + 1][j - 1] += b[i][j];
					}
				}

			}
		}
		for (i = 1;i <= 9;i++)
		{
			System.out.print(a[i][1]);
			for (j = 2;j <= 9;j++)
			{
				System.out.print(" ");
				System.out.print(a[i][j]);
				if (j == 9)
				{
					System.out.print("\n");
				}
			}
		}
		return 0;
	}



}

